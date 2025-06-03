package com.darioselor.examen.domain._4repository;

import com.darioselor.examen.domain._1model.Game;
import com.darioselor.examen.domain._1model.ListWithCount;

import java.util.List;
import java.util.Optional;

public interface GameRepository {
    List<Game> getAll();
    ListWithCount<Game> getAll(int page, int size);
    long count();
    Optional<Game> findByGameCode(String gameCode);
    void save(Game game);
}
