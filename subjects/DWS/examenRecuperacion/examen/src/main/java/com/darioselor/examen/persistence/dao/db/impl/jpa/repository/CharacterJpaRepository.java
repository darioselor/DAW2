package com.darioselor.examen.persistence.dao.db.impl.jpa.repository;

import com.darioselor.examen.persistence.dao.db.impl.jpa.entity.CharacterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CharacterJpaRepository extends JpaRepository<CharacterEntity, Long> {
    @Query(value = "SELECT c.* FROM characters c " +
    "JOIN games_characters gc ON c.id = gc.character_id " +
            "JOIN games c ON gc games_id = g.id" +
            "AND g.game_code = : gameCode", nativeQuery = true
    )
    List<CharacterEntity> findByGameCode(String gameCode);


}
