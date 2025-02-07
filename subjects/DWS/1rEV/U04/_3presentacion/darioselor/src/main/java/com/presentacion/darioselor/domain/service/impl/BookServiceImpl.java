package com.presentacion.darioselor.domain.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.presentacion.darioselor.domain.model.Book;
import com.presentacion.darioselor.domain.service.BookService;
import com.presentacion.darioselor.persistence.repository.BookRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;

    @Override
    public List<Book> getAll() {
        return bookRepository.getAll();
    }

    @Override
    public Book findByIsbn(String isbn) {
        return bookRepository.findByIsbn(isbn).orElseThrow(() -> new RuntimeException("Book not found"));
    }

}
