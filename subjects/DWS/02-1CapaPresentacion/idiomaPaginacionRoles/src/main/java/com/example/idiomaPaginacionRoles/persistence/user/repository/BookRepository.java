package com.example.idiomaPaginacionRoles.persistence.user.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.example.idiomaPaginacionRoles.domain.user.model.Book;

@Repository
public interface BookRepository {
    public List<Book> findAll(int page, int size);

    int count();

    public Optional<Book> findByIsbn(String isbn);
}
