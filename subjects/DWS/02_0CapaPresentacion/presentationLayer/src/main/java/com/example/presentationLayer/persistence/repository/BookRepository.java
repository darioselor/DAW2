package com.example.presentationLayer.persistence.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.example.presentationLayer.domain.model.Book;

@Repository
public interface BookRepository {
    Optional<Book> findByIsbn(String isbn);

    List<Book> findAll();
}
