package com.darioselor.ArquitecturaPorCapas.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.darioselor.ArquitecturaPorCapas.domain.model.Book;
import com.darioselor.ArquitecturaPorCapas.domain.service.BookService;

@RestController
@RequestMapping(BookController.URL)
@RequiredArgsConstructor
public class BookController {
    public static final String URL = "/books";

    private final BookService bookService;

    @GetMapping
    public List<Book> getAll() {
        return bookService.getAll();
    }

    @GetMapping("/{isbn}")
    public Optional<Book> findByIsbn(@PathVariable String isbn) {
        return bookService.findByIsbn(isbn);
    }

}
