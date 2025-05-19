package es.darioselor.domain.domain.admin.repository;

import es.darioselor.domain.domain.admin.model.Genre;

import java.util.List;

public interface GenreAdminRepository {
    List<Genre> findGenresByBookIsbn(String isbn);
    List<Genre> findGenresByBookId(Long id);
}
