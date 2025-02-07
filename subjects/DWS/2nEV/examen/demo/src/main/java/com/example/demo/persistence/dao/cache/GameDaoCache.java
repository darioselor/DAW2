package com.example.demo.persistence.dao.cache;

import java.util.Optional;

import com.example.demo.domain.model.Game;

public interface GameDaoCache extends GenericDaoCache<Game> {
    Optional<Game> findByGameCode(String game_code);
}
