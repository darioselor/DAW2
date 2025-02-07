package com.example.demo.domain.usecase.impl.AurthorUseCaseImpl;

import com.example.demo.common.annotation.DomainUseCase;
import com.example.demo.domain.model.Author;
import com.example.demo.domain.service.AuthorService;
import com.example.demo.domain.usecase.AuthorUseCase.AuthorCreateUseCase;

import lombok.RequiredArgsConstructor;



@DomainUseCase
@RequiredArgsConstructor
public class AuthorCreateUseCaseImpl implements AuthorCreateUseCase {
    
    public final AuthorService authorService;

    
    
    @Override
    public void execute(Author author) {
        authorService.create(author);
    }
    
}
