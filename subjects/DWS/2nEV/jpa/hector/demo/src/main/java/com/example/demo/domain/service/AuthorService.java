package com.example.demo.domain.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.domain.model.Author;

public interface AuthorService {
    
    List<Author> findAll();

    Optional<Author> findById(Integer id);

    void create(Author author);

    void update(Author author);

    List<Author> findAllByBookId(Integer bookId);

}
