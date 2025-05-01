package com.example.presentationLayer.domain.service;

import java.util.List;
import java.util.Optional;

import com.example.presentationLayer.domain.model.Book;

public interface BookService {

    Optional<Book> findByIsbn(String isbn);

    List<Book> findAll();

}
