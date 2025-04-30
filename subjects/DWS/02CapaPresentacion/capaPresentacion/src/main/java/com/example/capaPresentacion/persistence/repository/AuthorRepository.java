package com.example.capaPresentacion.persistence.repository;

import java.util.List;

import com.example.capaPresentacion.domain.model.Author;

public interface AuthorRepository {
    List<Author> findByBookIsbn(String isbn);
}
