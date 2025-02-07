package com.arquitecture.darioselor.persistence.repository;

import java.util.List;
import java.util.Optional;

import com.arquitecture.darioselor.domain.model.Book;

public interface BookRepository {
    List<Book> getAll();

    Optional<Book> findByIsbn(String isbn);
}
