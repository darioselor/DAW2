package es.darioselor.domain.persistence.user.repository;

import es.darioselor.domain.domain.user.model.Book;

import java.util.List;
import java.util.Optional;

public interface BookUserRepository {
    List<Book> findAll();
    List<Book> findAll(int page, int size);
    int count();
    Optional<Book> findByIsbn(String isbn);

}
