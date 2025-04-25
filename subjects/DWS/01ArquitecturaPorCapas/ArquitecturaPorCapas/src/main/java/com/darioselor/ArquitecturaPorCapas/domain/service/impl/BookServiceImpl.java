package com.darioselor.ArquitecturaPorCapas.domain.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.darioselor.ArquitecturaPorCapas.domain.model.Book;
import com.darioselor.ArquitecturaPorCapas.domain.service.BookService;
import com.darioselor.ArquitecturaPorCapas.persistence.repository.BookRepository;

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
    public Optional<Book> findByIsbn(String Isbn) {
        return bookRepository.findByIsbn(Isbn);
    }

}
