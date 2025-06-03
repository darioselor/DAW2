package com.example.presentationLayer.persistence.repository;

import java.util.List;

import com.example.presentationLayer.domain.model.Genre;

public interface GenreRepository {
    List<Genre> findByBookIsbn(String isbn);
}
