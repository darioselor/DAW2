package com.example.capaPresentacion.domain.service;

import java.util.List;
import java.util.Optional;

import com.example.capaPresentacion.domain.model.Book;

public interface BookService {

    Optional<Book> findByIsbn(String isbn);

    List<Book> findAll();

}
