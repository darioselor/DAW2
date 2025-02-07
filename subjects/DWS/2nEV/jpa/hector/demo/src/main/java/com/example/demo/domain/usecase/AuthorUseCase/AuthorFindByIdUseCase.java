package com.example.demo.domain.usecase.AuthorUseCase;

import com.example.demo.domain.model.Author;



public interface AuthorFindByIdUseCase {

    Author execute(Integer id);
    
}
