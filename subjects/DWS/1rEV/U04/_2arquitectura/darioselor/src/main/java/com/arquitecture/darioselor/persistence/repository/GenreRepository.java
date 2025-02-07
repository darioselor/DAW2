package com.arquitecture.darioselor.persistence.repository;

import java.util.List;

import com.arquitecture.darioselor.domain.model.Genre;

public interface GenreRepository {
    List<Genre> getByIsbnBook(String isbn);
}
