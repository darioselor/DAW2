package com.example.demo.domain.usecase.impl.AurthorUseCaseImpl;

import com.example.demo.common.annotation.DomainUseCase;
import com.example.demo.domain.model.Author;
import com.example.demo.domain.service.AuthorService;
import com.example.demo.domain.usecase.AuthorUseCase.AuthorUpdateUseCase;

import lombok.RequiredArgsConstructor;



@DomainUseCase
@RequiredArgsConstructor
public class AuthorUpdateUseCaseImpl implements AuthorUpdateUseCase {

    private final AuthorService authorService;


    @Override
    public void execute(Author author) {

            authorService.update(author);
        
    }
    
}
