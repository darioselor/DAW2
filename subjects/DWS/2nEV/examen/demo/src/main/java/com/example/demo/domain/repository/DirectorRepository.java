package com.example.demo.domain.repository;

import java.util.List;
import java.util.Optional;

import com.example.demo.domain.model.Director;

public interface DirectorRepository {
    List<Director> findAll();

    Optional<Director> findById(Long id);
}
