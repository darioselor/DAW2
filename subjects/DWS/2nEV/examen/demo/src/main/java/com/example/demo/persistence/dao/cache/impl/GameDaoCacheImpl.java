package com.example.demo.persistence.dao.cache.impl;

import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Component;

import com.example.demo.domain.model.Game;
import com.example.demo.persistence.dao.cache.GameDaoCache;

@Component
public class GameDaoCacheImpl implements GameDaoCache {

    private final Map<String, Game> cache = new ConcurrentHashMap<>();
    private final Map<String, Long> expiration = new ConcurrentHashMap<>();
    private static final long TTL = 600_000L;

    @Override
    public Optional<Game> findByGameCode(String game_code) {
        Long expirationTime = expiration.get(game_code);
        if (expirationTime != null && expirationTime > System.currentTimeMillis()) {
            System.out.println("Retrieved from cache: " + game_code);
            return Optional.ofNullable(cache.get(game_code));
        }
        cache.remove(game_code);
        expiration.remove(game_code);
        return Optional.empty();
    }

    @Override
    public void save(Game game) {
        cache.put(game.getgame_code(), game);
        expiration.put(game.getgame_code(), System.currentTimeMillis() + TTL);
    }

    @Override
    public void clearCache() {
        cache.clear();
        expiration.clear();
    }

}
