package com.example.idiomaPaginacionRoles.domain.service;

import java.util.List;

import com.example.idiomaPaginacionRoles.domain.model.Book;

public interface BookService {
    List<Book> findAll(int page, int size);

    int count();

    Book findByIsbn(String isbn);
}
