package com.example.demo.domain.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.domain.model.Director;

public interface DirectorService {
    List<Director> getAll();

    Optional<Director> findById(Long id);
}
