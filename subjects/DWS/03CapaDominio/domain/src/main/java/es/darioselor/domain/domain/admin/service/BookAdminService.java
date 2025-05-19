package es.darioselor.domain.domain.admin.service;

import es.darioselor.domain.domain.admin.model.Author;
import es.darioselor.domain.domain.admin.model.Book;
import es.darioselor.domain.domain.admin.model.Genre;

import java.util.List;
import java.util.Optional;

public interface BookAdminService {
    List<Book> findAll();
    List<Book> findAll(int page, int size);

    int count();
    Optional<Book> findByIsbn(String isbn);

    Optional<Book> findById(Long id);

    void insertAuthors(Long id, List<Author> authors);
    void insertGenres(Long id, List<Genre> genres);
}
