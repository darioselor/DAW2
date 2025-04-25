package com.darioselor.ArquitecturaPorCapas.domain.service;

import java.util.List;
import java.util.Optional;

import com.darioselor.ArquitecturaPorCapas.domain.model.Book;

public interface BookService {
    List<Book> getAll();

    Optional<Book> findByIsbn(String Isbn);
}
