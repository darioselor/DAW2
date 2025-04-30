package com.example.capaPresentacion.persistence.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.example.capaPresentacion.domain.model.Book;

@Repository
public interface BookRepository {
    Optional<Book> findByIsbn(String isbn);

    List<Book> findAll();
}
