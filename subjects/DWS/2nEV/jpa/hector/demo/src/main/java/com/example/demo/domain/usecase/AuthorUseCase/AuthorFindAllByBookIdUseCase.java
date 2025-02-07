package com.example.demo.domain.usecase.AuthorUseCase;

import java.util.List;

import com.example.demo.domain.model.Author;

public interface AuthorFindAllByBookIdUseCase {
    
    List<Author> execute(Integer bookId);
    
}
