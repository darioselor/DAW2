package com.example.idiomaPaginacionRoles.persistence.admin.repository;

import com.example.idiomaPaginacionRoles.domain.admin.model.Book;

import java.util.List;
import java.util.Optional;

public interface BookAdminRepository {
    List<Book> findAll();

    List<Book> findAll(int page, int size);

    int count();

    Optional<Book> findByIsbn(String isbn);
}
