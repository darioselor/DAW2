package com.example.demo.domain.usecase.impl.AurthorUseCaseImpl;

import java.util.List;

import com.example.demo.common.annotation.DomainService;
import com.example.demo.domain.model.Author;
import com.example.demo.domain.service.AuthorService;
import com.example.demo.domain.usecase.AuthorUseCase.AuthorFindAllByBookIdUseCase;

import lombok.RequiredArgsConstructor;


@DomainService
@RequiredArgsConstructor
public class AuthorFindAllByBookIdUseCaseImpl implements AuthorFindAllByBookIdUseCase {
    
    private final AuthorService authorService;

    @Override
    public List<Author> execute(Integer bookId) {
        return authorService.findAllByBookId(bookId);
    }
    
}
