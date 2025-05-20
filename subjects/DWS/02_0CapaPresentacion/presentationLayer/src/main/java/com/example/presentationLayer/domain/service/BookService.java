package com.example.presentationLayer.domain.service;

import java.util.List;

import com.example.presentationLayer.domain.model.Book;

public interface BookService {

    Book findByIsbn(String isbn);

    List<Book> findAll();

}
