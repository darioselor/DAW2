package com.darioselor.examen.persistence.dao.db.impl.jpa.repository;

import com.darioselor.examen.persistence.dao.db.impl.jpa.entity.GameEntity;
import org.hibernate.boot.model.source.spi.AttributePath;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface GameJpaRepository extends JpaRepository<GameEntity, Long> {
    Optional<GameEntity> findByGameCode(String gameCode);
}
