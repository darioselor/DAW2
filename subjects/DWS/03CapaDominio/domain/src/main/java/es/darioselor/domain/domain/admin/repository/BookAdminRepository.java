package es.darioselor.domain.domain.admin.repository;

import es.darioselor.domain.domain.admin.model.Book;

import java.util.List;
import java.util.Optional;

public interface BookAdminRepository {
    List<Book> findAll();
    List<Book> findAll(int page, int size);
    int count();
    Optional<Book> findByIsbn(String isbn);
    Optional<Book> findById(Long id);
    void save(Book book);
}
