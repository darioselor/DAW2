package com.example.idiomaPaginacionRoles.controller.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.idiomaPaginacionRoles.controller.user.webModel.Book.BookCollection;
import com.example.idiomaPaginacionRoles.controller.user.webModel.Book.BookDetail;
import com.example.idiomaPaginacionRoles.controller.user.webModel.Book.BookMapper;
import com.example.idiomaPaginacionRoles.controller.common.PaginatedResponse;
import com.example.idiomaPaginacionRoles.domain.user.service.BookUserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(BookController.URL)
@RequiredArgsConstructor
public class BookController {
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
