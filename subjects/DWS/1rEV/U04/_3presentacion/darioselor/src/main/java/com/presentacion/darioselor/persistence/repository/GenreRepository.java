package com.presentacion.darioselor.persistence.repository;

import java.util.List;

import com.presentacion.darioselor.domain.model.Genre;

public interface GenreRepository {
    List<Genre> getByIsbnBook(String isbn);
}
