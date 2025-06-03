package com.example.idiomaPaginacionRoles.domain.user.service;

import java.util.List;

import com.example.idiomaPaginacionRoles.domain.user.model.Book;

public interface BookUserService {
    List<Book> findAll(int page, int size);

    int count();

    Book findByIsbn(String isbn);
}
