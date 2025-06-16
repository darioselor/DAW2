package com.darioselor.examen.persistence.repository.impl;

import com.darioselor.examen.domain._1model.Game;
import com.darioselor.examen.domain._1model.ListWithCount;
import com.darioselor.examen.domain._4repository.GameRepository;
import com.darioselor.examen.persistence.dao.db.GameDaoDb;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class GameRepositoryImpl implements GameRepository {

    private final GameDaoDb gameDaoDb;

    @Override
    public List<Game> getAll() {
        return gameDaoDb.getAll();
    }

    @Override
    public ListWithCount<Game> getAll(int page, int size) {
        return gameDaoDb.getAll(page,size);
    }

    @Override
    public long count() {
        return gameDaoDb.count();
    }

    @Override
    public Optional<Game> findByGameCode(String gameCode) {
        return gameDaoDb.findByGameCode(gameCode);
    }

    @Override
    public void save(Game game) {
        gameDaoDb.save(game);
    }
}
