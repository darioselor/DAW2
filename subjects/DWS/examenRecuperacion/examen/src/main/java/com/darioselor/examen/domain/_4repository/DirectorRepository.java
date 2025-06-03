package com.darioselor.examen.domain._4repository;

import com.darioselor.examen.domain._1model.Director;

import java.util.Optional;

public interface DirectorRepository {
    Optional<Director> findById(long id);
}
