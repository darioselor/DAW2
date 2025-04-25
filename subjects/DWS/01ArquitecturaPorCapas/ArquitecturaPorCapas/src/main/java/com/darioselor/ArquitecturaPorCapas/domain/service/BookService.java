package com.darioselor.ArquitecturaPorCapas.domain.service;

import java.util.List;

import com.darioselor.ArquitecturaPorCapas.domain.model.Book;

public interface BookService {
    List<Book> getAll();

    Book findByIsbn(String Isbn);
}
