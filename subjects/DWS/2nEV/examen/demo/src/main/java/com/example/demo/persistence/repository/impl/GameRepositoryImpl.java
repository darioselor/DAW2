package com.example.demo.persistence.repository.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.example.demo.domain.model.Game;
import com.example.demo.domain.repository.GameRepository;
import com.example.demo.persistence.dao.cache.GameDaoCache;
import com.example.demo.persistence.dao.db.GameDaoDb;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class GameRepositoryImpl implements GameRepository {

    private final GameDaoDb gameDaoDb;
    private final GameDaoCache gameDaoCache;

    @Override
    public List<Game> findAll() {
        return gameDaoDb.findAll();
    }

    @Override
    public Optional<Game> findByGameCode(String gameCode) {
        return gameDaoCache.findByGameCode(gameCode).or(() -> {
            System.out.println("Retrieved from db: " + gameCode);
            Optional<Game> game = gameDaoDb.findByGameCode(gameCode);
            game.ifPresent(gameDaoCache::save);
            return game;
        });
    }

}
