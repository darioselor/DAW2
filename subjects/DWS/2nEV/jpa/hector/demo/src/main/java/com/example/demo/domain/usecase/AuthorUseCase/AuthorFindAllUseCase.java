package com.example.demo.domain.usecase.AuthorUseCase;

import java.util.List;

import com.example.demo.domain.model.Author;

public interface AuthorFindAllUseCase {

    List<Author> execute();
    
}
