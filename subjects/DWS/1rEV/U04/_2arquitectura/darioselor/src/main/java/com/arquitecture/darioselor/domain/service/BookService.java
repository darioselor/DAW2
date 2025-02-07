package com.arquitecture.darioselor.domain.service;

import java.util.List;

import com.arquitecture.darioselor.domain.model.Book;

public interface BookService {
    List<Book> getAll();

    Book findByIsbn(String isbn);
}
