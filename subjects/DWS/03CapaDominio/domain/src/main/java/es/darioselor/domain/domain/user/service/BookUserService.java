package es.darioselor.domain.domain.user.service;

import es.darioselor.domain.domain.user.model.Book;

import java.util.List;
import java.util.Optional;

public interface BookUserService {
    List<Book> findAll();
    List<Book> findAll(int page, int size);

    int count();
    Book findByIsbn(String isbn);
}
