package es.darioselor.domain.domain.user.service;

import es.darioselor.domain.domain.user.model.Author;
import es.darioselor.domain.domain.user.model.Book;
import es.darioselor.domain.domain.user.model.Genre;

import java.util.List;
import java.util.Optional;

public interface BookUserService {
    List<Book> findAll();
    List<Book> findAll(int page, int size);

    int count();
    Book findByIsbn(String isbn);

    void insertAuthors(String isbnBook, List<Author> authors);
    void insertGenres(String isbnBook, List<Genre> genres);
}
