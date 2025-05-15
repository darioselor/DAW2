package es.darioselor.domain.domain.user.repository;

import es.darioselor.domain.domain.user.model.Genre;

import java.util.List;

public interface GenreUserRepository {
    List<Genre> findGenresByBookIsbn(String isbn);
}
