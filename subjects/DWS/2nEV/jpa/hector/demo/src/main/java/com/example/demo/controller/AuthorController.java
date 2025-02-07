package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.model.Author;
import com.example.demo.domain.usecase.AuthorUseCase.AuthorCreateUseCase;
import com.example.demo.domain.usecase.AuthorUseCase.AuthorFindAllUseCase;
import com.example.demo.domain.usecase.AuthorUseCase.AuthorFindByIdUseCase;
import com.example.demo.domain.usecase.AuthorUseCase.AuthorUpdateUseCase;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequiredArgsConstructor
@RequestMapping("/authors")
public class AuthorController {

    private final AuthorFindAllUseCase authorFindAllUseCase;
    private final AuthorFindByIdUseCase authorFindByIdUseCase;
    private final AuthorCreateUseCase authorCreateUseCase;
    private final AuthorUpdateUseCase authorUpdateUseCase;

    @GetMapping
    public List<Author> findAll() {
        return authorFindAllUseCase.execute();
    }

    @GetMapping("/{id}")
    public Author findById(@PathVariable Integer id) {
        return authorFindByIdUseCase.execute(id);
    }

    @PostMapping()
    public void create(@Valid @RequestBody Author author) {
         authorCreateUseCase.execute(author);
    }

    @PostMapping("/{id}")
    public void update(@PathVariable Integer id, @RequestBody Author author) {
        author.setId(id);
        authorUpdateUseCase.execute(author);
    }
    
    
}
