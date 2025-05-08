package com.example.idiomaPaginacionRoles.persistence.repository;

import java.util.List;

import com.example.idiomaPaginacionRoles.domain.model.Genre;

public interface GenreRepository {
    List<Genre> findGenresByBookIsbn(String isbn);
}
