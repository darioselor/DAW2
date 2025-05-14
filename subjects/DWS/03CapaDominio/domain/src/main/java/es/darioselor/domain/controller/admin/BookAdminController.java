package es.darioselor.domain.controller.admin;

import es.darioselor.domain.controller.admin.webModel.Book.BookCollection;
import es.darioselor.domain.controller.common.PaginatedResponse;
import es.darioselor.domain.controller.admin.webModel.Book.BookMapper;
import es.darioselor.domain.domain.admin.service.BookAdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(BookAdminController.URL)
public class BookAdminController {
    public static final String URL = "api/admin/books";
    @Value("${app.base.url}")
    private String baseUrl;

    @Value("${app.pageSize.default}")
    private String defaultPageSize;

    private final BookAdminService bookAdminService;

    @GetMapping
    public ResponseEntity<PaginatedResponse<BookCollection>> findAll(
            @RequestParam(defaultValue = "1") int page,
            @RequestParam(required = false) Integer size
    ){
        int pageSize = (size != null) ? size : Integer.parseInt(defaultPageSize);
        List<BookCollection> books = bookAdminService
                .findAll(page-1, pageSize)
                .stream()
                .map(BookMapper.INSTANCE::toBookCollection)
                .toList();
        int total = bookAdminService.count();
        PaginatedResponse<BookCollection> response = new PaginatedResponse<>(books, total, page, pageSize, baseUrl + URL);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
