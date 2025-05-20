package com.example.idiomaPaginacionRoles.persistence.user.repository;

import java.util.List;

import com.example.idiomaPaginacionRoles.domain.user.model.Genre;

public interface GenreUserRepository {
    List<Genre> findGenresByBookIsbn(String isbn);
}
