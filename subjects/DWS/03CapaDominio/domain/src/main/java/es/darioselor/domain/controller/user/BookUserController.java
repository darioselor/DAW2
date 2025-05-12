package es.darioselor.domain.controller.user;

import es.darioselor.domain.controller.common.PaginatedResponse;
import es.darioselor.domain.controller.user.webModel.Book.BookCollection;
import es.darioselor.domain.controller.user.webModel.Book.BookDetail;
import es.darioselor.domain.controller.user.webModel.Book.BookMapper;
import es.darioselor.domain.domain.user.service.BookUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(BookUserController.URL)
@RequiredArgsConstructor
public class BookUserController {
    public static final String URL = "/api/books";
    @Value("${app.base.url}")
    private String baseUrl;

    @Value("${app.pageSize.default}")
    private String defaultPageSize;

    private final BookUserService bookUserService;

    @GetMapping
    public ResponseEntity<List<BookCollection>> findAll(
            @RequestParam(defaultValue = "1") int page,
            @RequestParam(required = false) Integer size) {
        int pageSize = (size != null) ? size : Integer.parseInt(defaultPageSize);
        List<BookCollection> bookCollections = bookUserService
                .findAll(page-1, pageSize)
                .stream()
                .map(BookMapper.INSTANCE::toBookCollection)
                .toList();
        int total = bookUserService.count();

        PaginatedResponse<BookCollection> response = new PaginatedResponse<>(bookCollections, total, page, pageSize,
                baseUrl + URL);
        return new ResponseEntity<>(bookCollections, HttpStatus.OK);
    }

    @GetMapping("/{isbn}")
    public ResponseEntity<BookDetail> findByIsbn(@PathVariable String isbn) {
        BookDetail bookDetail = BookMapper.INSTANCE.toBookDetail(bookUserService.findByIsbn(isbn));
        return new ResponseEntity<>(bookDetail, HttpStatus.OK);
    }

}