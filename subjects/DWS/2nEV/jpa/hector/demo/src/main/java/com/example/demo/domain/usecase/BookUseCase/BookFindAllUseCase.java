package com.example.demo.domain.usecase.BookUseCase;

import java.util.List;

import com.example.demo.domain.model.Book;

public interface BookFindAllUseCase {

    List<Book> execute();
    
}
