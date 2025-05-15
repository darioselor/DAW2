package es.darioselor.domain.domain.admin.service;

import es.darioselor.domain.domain.admin.model.Book;

import java.util.List;

public interface BookAdminService {
    List<Book> findAll();

    List<Book> findAll(int page, int pageSize);

    int count();

    Book findByIsbn(String isbn);
}
