package com.darioselor.examen.domain._3service.impl;

import com.darioselor.examen.common.annotation.DomainService;
import com.darioselor.examen.domain._1model.Game;
import com.darioselor.examen.domain._1model.ListWithCount;
import com.darioselor.examen.domain._3service.GameService;
import com.darioselor.examen.domain._4repository.GameRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Optional;

@DomainService
@RequiredArgsConstructor
public class GameServiceImpl implements GameService {
    private final GameRepository gameRepository;


    @Override
    public List<Game> getAll() {
        return gameRepository.getAll();
    }

    @Override
    public ListWithCount<Game> getAll(int page, int size) {
        return gameRepository.getAll(page,size);
    }

    @Override
    public long count() {
        return gameRepository.count();
    }

    @Override
    public Optional<Game> findByGameCode(String gameCode) {
        Game game = gameRepository.findByGameCode(gameCode).orElse(null);
        return Optional.ofNullable(game);
    }

    @Override
    public void save(Game game) {
        gameRepository.save(game);
    }
}
