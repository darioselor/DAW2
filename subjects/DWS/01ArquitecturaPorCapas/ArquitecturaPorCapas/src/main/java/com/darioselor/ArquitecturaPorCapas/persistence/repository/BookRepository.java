package com.darioselor.ArquitecturaPorCapas.persistence.repository;

import java.util.List;
import java.util.Optional;

import com.darioselor.ArquitecturaPorCapas.domain.model.Book;

public interface BookRepository {
    List<Book> getAll();

    Optional<Book> findByIsbn(String isbn);
}
