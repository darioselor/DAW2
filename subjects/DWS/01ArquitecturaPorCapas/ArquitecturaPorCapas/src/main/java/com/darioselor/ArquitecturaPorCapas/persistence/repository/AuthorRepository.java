package com.darioselor.ArquitecturaPorCapas.persistence.repository;

import java.util.List;

import com.darioselor.ArquitecturaPorCapas.domain.model.Author;

public interface AuthorRepository {

    List<Author> getByIsbnBook(String isbn);
}
