package com.example.paginacion.domain.service;

import java.util.List;

import com.example.paginacion.domain.model.Book;

public interface BookService {
    List<Book> getAll();

    Book findByIsbn(String isbn);

}
