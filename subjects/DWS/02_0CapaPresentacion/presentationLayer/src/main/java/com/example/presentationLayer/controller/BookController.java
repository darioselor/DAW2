package com.example.presentationLayer.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.presentationLayer.controller.webModel.Book.BookCollection;
import com.example.presentationLayer.controller.webModel.Book.BookDetail;
import com.example.presentationLayer.controller.webModel.Book.BookMapper;
import com.example.presentationLayer.domain.service.BookService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(BookController.URL)
@RequiredArgsConstructor
public class BookController {
    public static final String URL = "/api/books";

    private final BookService bookService;

    @GetMapping
    public ResponseEntity<List<BookCollection>> findAll() {
        List<BookCollection> bookCollections = bookService
                .findAll()
                .stream()
                .map(BookMapper.INSTANCE::toBookCollection)
                .toList();
        return new ResponseEntity<>(bookCollections, HttpStatus.OK);
    }

    @GetMapping("/{isbn}")
    public ResponseEntity<BookDetail> findByIsbn(@PathVariable String isbn) {
        BookDetail bookDetail = BookMapper.INSTANCE.toBookDetail(bookService.findByIsbn(isbn));
        return new ResponseEntity<>(bookDetail, HttpStatus.OK);
    }

}
