package com.example.idiomaPaginacionRoles.domain.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.common.exception.ResourceNotFoundException;
import com.example.idiomaPaginacionRoles.domain.model.Book;
import com.example.idiomaPaginacionRoles.domain.service.BookService;
import com.example.idiomaPaginacionRoles.persistence.repository.BookRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public Book findByIsbn(String isbn) {
        return bookRepository.findByIsbn(isbn)
                .orElseThrow(() -> new ResourceNotFoundException("Book with isbn: " + isbn + " not found"));
    }

}
