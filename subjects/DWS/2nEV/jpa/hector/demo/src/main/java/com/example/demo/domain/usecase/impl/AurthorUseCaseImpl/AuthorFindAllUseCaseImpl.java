package com.example.demo.domain.usecase.impl.AurthorUseCaseImpl;

import java.util.List;

import com.example.demo.common.annotation.DomainUseCase;
import com.example.demo.domain.model.Author;
import com.example.demo.domain.service.AuthorService;
import com.example.demo.domain.usecase.AuthorUseCase.AuthorFindAllUseCase;

import lombok.RequiredArgsConstructor;

@DomainUseCase
@RequiredArgsConstructor
public class AuthorFindAllUseCaseImpl implements AuthorFindAllUseCase {

    private final AuthorService authorService;

    @Override
    public List<Author> execute() {
        return authorService.findAll();
    }

    
}
