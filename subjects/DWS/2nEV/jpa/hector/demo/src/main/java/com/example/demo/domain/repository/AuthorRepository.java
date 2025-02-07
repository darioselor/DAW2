package com.example.demo.domain.repository;

import java.util.List;
import java.util.Optional;

import com.example.demo.domain.model.Author;

public interface AuthorRepository {

        List<Author> findAll();

        Optional<Author> findById(Integer id);

        void save(Author author);

        List<Author> findAllByBookId(Integer bookId);

        
    
}
