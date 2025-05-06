package com.example.idiomaPaginacionRoles.persistence.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.example.idiomaPaginacionRoles.domain.model.Book;

@Repository
public interface BookRepository {
    public List<Book> findAll();

    public Optional<Book> findByIsbn(String isbn);
}
