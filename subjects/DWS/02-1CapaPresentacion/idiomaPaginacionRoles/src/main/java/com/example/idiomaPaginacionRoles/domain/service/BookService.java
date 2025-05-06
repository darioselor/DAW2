package com.example.idiomaPaginacionRoles.domain.service;

import java.util.List;

import com.example.idiomaPaginacionRoles.domain.model.Book;

public interface BookService {
    List<Book> findAll();

    Book findByIsbn(String isbn);
}
