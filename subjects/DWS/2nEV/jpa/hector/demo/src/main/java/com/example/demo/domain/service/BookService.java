package com.example.demo.domain.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.domain.model.Book;

public interface BookService {

    List<Book> findAll();

    Optional<Book> findById(Integer id);
    
}
