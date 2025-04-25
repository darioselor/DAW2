package com.darioselor.ArquitecturaPorCapas.persistence.repository;

import java.util.List;

import com.darioselor.ArquitecturaPorCapas.domain.model.Genre;

public interface GenreRepository {

    List<Genre> getByIsbnBook(String isbn);
}
