package com.darioselor.ArquitecturaPorCapas.domain.service.impl;

import java.util.List;

import com.darioselor.ArquitecturaPorCapas.domain.model.Book;
import com.darioselor.ArquitecturaPorCapas.domain.service.BookService;

public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    @Override
    public List<Book> getAll() {
        return bookRepository.getAll();
    }

    @Override
    public Book findByIsbn(String Isbn) {

    }

}
