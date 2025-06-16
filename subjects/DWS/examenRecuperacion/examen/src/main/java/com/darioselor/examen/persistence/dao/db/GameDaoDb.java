package com.darioselor.examen.persistence.dao.db;

import com.darioselor.examen.domain._1model.Game;

import java.util.Optional;

public interface GameDaoDb extends GenericDaoDb<Game>{
    Optional<Game> findByGameCode(String gameCode);
}
