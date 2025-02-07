package com.presentacion.darioselor.domain.service;

import java.util.List;

import com.presentacion.darioselor.domain.model.Book;

public interface BookService {
    List<Book> getAll();

    Book findByIsbn(String isbn);

}
