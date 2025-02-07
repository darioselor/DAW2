package com.example.demo.domain.usecase.impl.BookUseCaseImpl;

import com.example.demo.common.annotation.DomainUseCase;
import com.example.demo.domain.model.Book;
import com.example.demo.domain.service.BookService;
import com.example.demo.domain.usecase.BookUseCase.BookFindByIdUseCase;

import lombok.RequiredArgsConstructor;

@DomainUseCase
@RequiredArgsConstructor
public class BookFindByIdUseCaseImpl implements BookFindByIdUseCase {

    private final BookService bookService;

    @Override
    public Book execute(Integer id) {
        return bookService
        .findById(id)
        .orElseThrow(() -> new RuntimeException("Book not found"));
    }
    
}
