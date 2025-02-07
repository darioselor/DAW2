package com.example.demo.domain.usecase.impl.BookUseCaseImpl;

import java.util.List;

import com.example.demo.common.annotation.DomainUseCase;
import com.example.demo.domain.model.Book;
import com.example.demo.domain.service.BookService;
import com.example.demo.domain.usecase.BookUseCase.BookFindAllUseCase;

import lombok.RequiredArgsConstructor;

@DomainUseCase
@RequiredArgsConstructor
public class BookFindAllUseCaseImpl implements BookFindAllUseCase {

    private final BookService bookService;

    @Override
    public List<Book> execute() {
        return bookService.findAll();
    }
    
}
