package com.example.presentationLayer.persistence.repository;

import java.util.List;

import com.example.presentationLayer.domain.model.Author;

public interface AuthorRepository {
    List<Author> findByBookIsbn(String isbn);
}
