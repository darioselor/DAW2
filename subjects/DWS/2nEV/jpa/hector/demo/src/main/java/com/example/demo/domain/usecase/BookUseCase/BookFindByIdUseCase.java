package com.example.demo.domain.usecase.BookUseCase;

import com.example.demo.domain.model.Book;

public interface BookFindByIdUseCase {

    Book execute(Integer id);

    
} 