package com.darioselor.examen.domain._3service;

import com.darioselor.examen.domain._1model.Director;
import com.darioselor.examen.domain._1model.Game;

import java.util.Optional;

public interface DirectorService {
    Optional<Director> findById(long id);
}
