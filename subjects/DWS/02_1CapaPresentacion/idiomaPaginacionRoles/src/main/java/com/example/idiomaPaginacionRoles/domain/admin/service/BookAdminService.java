package com.example.idiomaPaginacionRoles.domain.admin.service;

import com.example.idiomaPaginacionRoles.domain.admin.model.Book;

import java.util.List;

public interface BookAdminService {
    List<Book> findAll();
    List<Book> findAll(int page, int size);
    int count();
    Book findByIsbn(String isbn);
}
