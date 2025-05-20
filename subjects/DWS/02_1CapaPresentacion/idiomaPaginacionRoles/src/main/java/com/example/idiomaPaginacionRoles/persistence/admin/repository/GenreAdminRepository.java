package com.example.idiomaPaginacionRoles.persistence.admin.repository;

import com.example.idiomaPaginacionRoles.domain.admin.model.Genre;

import java.util.List;

public interface GenreAdminRepository {
    List<Genre> findGenreByBookIsbn(String isbn);
}
