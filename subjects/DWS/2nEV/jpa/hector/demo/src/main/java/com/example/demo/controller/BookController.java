package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.model.Author;
import com.example.demo.domain.model.Book;
import com.example.demo.domain.usecase.AuthorUseCase.AuthorFindAllByBookIdUseCase;
import com.example.demo.domain.usecase.BookUseCase.BookFindAllUseCase;
import com.example.demo.domain.usecase.BookUseCase.BookFindByIdUseCase;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/books")
public class BookController {

    private final BookFindAllUseCase bookFindAllUseCase;
    private final BookFindByIdUseCase bookFindByIdUseCase;
    private final AuthorFindAllByBookIdUseCase authorFindAllByBookIdUseCase;

    @GetMapping
    public List<Book> findAll() {
        return bookFindAllUseCase.execute();
    }

    @GetMapping("/{id}")
    public Book findById(@PathVariable Integer id) {
        return bookFindByIdUseCase.execute(id);
    }

    @GetMapping("/{bookId}/authors")
    public List<Author> findAllByBookId(@PathVariable Integer bookId) {
        return authorFindAllByBookIdUseCase.execute(bookId);
    }
}
