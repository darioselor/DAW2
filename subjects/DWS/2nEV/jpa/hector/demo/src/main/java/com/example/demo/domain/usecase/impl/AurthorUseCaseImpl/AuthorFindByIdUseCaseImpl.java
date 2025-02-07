package com.example.demo.domain.usecase.impl.AurthorUseCaseImpl;

import com.example.demo.common.annotation.DomainUseCase;
import com.example.demo.domain.model.Author;
import com.example.demo.domain.service.AuthorService;
import com.example.demo.domain.usecase.AuthorUseCase.AuthorFindByIdUseCase;

import lombok.RequiredArgsConstructor;

@DomainUseCase
@RequiredArgsConstructor
public class AuthorFindByIdUseCaseImpl implements AuthorFindByIdUseCase {

    private final AuthorService authorService;


    @Override
    public Author execute(Integer id) {
        return authorService
                .findById(id)
                .orElseThrow(() -> new RuntimeException("Author not found"));
        
    }
    
}
