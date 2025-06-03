package com.darioselor.examen.domain._3service;

import com.darioselor.examen.domain._1model.Game;
import com.darioselor.examen.domain._1model.ListWithCount;

import java.util.List;
import java.util.Optional;

public interface GameService {
    List<Game> getAll();
    ListWithCount<Game> getAll(int page, int size);
    long count();
    Optional<Game> findByGameCode(String gameCode);

    void save(Game game);

}
