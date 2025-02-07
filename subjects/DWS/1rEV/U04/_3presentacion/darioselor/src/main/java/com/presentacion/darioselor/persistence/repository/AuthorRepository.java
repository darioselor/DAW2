package com.presentacion.darioselor.persistence.repository;

import java.util.List;

import com.presentacion.darioselor.domain.model.Author;

public interface AuthorRepository {
    List<Author> getByIsbnBook(String isbn);
}
