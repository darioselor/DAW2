package com.arquitecture.darioselor.persistence.repository;

import java.util.List;

import com.arquitecture.darioselor.domain.model.Author;

public interface AuthorRepository {

    List<Author> getByIsbnBook(String isbn);
}
