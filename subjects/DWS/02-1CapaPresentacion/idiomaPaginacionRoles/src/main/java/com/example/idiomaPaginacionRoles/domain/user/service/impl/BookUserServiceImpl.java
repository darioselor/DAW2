package com.example.idiomaPaginacionRoles.domain.user.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.common.exception.ResourceNotFoundException;
import com.example.idiomaPaginacionRoles.domain.user.model.Book;
import com.example.idiomaPaginacionRoles.domain.user.service.BookUserService;
import com.example.idiomaPaginacionRoles.persistence.user.repository.BookRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BookUserServiceImpl implements BookUserService {

    private final BookRepository bookRepository;

    @Override
    public List<Book> findAll(int page, int size) {
        return bookRepository.findAll(page, size);
    }

    @Override
    public int count() {
        return bookRepository.count();
    }

    @Override
    public Book findByIsbn(String isbn) {
        return bookRepository.findByIsbn(isbn).orElseThrow(() -> new ResourceNotFoundException("Book with isbn: " + isbn + " not found"));
    }

}
