package com.example.capaPresentacion.persistence.repository;

import java.util.List;

import com.example.capaPresentacion.domain.model.Genre;

public interface GenreRepository {
    List<Genre> findByBookIsbn(String isbn);
}
