package com.example.demo.persistence.dao.db;

import java.util.List;
import java.util.Optional;

import com.example.demo.domain.model.Game;

public interface GameDaoDb extends GenericDaoDb<Game> {
    Optional<Game> findByGameCode(String game_code);

    List<Game> findAll();

}
