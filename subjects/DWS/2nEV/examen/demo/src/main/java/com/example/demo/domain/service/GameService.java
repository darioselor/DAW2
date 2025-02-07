package com.example.demo.domain.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.domain.model.Game;

public interface GameService {
    List<Game> findAll();

    Optional<Game> findByGameCode(String game_code);
}
