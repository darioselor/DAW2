package com.example.demo.domain.repository;

import java.util.List;
import java.util.Optional;

import com.example.demo.domain.model.Game;

public interface GameRepository {
    List<Game> findAll();

    Optional<Game> findByGameCode(String game_code);
}
