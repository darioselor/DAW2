package com.example.demo.domain.repository;

import java.util.List;
import java.util.Optional;

import com.example.demo.domain.model.Book;

public interface BookRepository {

    List<Book> findAll();

        Optional<Book> findById(Integer id);


    
}
