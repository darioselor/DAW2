package com.darioselor.examen.persistence.dao.db.impl.jpa;

import com.darioselor.examen.domain._1model.Game;
import com.darioselor.examen.domain._1model.ListWithCount;
import com.darioselor.examen.persistence.dao.db.GameDaoDb;
import com.darioselor.examen.persistence.dao.db.impl.jpa.entity.GameEntity;
import com.darioselor.examen.persistence.dao.db.impl.jpa.mapper.GameJpaMapper;
import com.darioselor.examen.persistence.dao.db.impl.jpa.repository.GameJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class GameDaoJpa implements GameDaoDb {

    private final GameJpaRepository gameJpaRepository;

    @Override
    public Optional<Game> findByGameCode(String gameCode) {
        return Optional.ofNullable(gameJpaRepository.findByGameCode(gameCode))
                .map(GameJpaMapper.INSTANCE::toGameWithDetails);
    }

    @Override
    public List<Game> getAll() {
        return List.of();
    }

    @Override
    public ListWithCount<Game> getAll(int page, int size) {
        return null;
    }

    @Override
    public Optional<Game> findById(long id) {
        return Optional.empty();
    }

    @Override
    public String insert(Game game) {
        return gameJpaRepository.save(GameJpaMapper.INSTANCE.toGameEntity(game).getGameCode());
    }

    @Override
    public void update(Game game) {
        gameJpaRepository.save(GameJpaMapper.INSTANCE.toGameEntity(game));
    }

    @Override
    public void delete(long id) {
        gameJpaRepository.deleteById(id);
    }

    @Override
    public long count() {
        return gameJpaRepository.count();
    }

    @Override
    public Game save(Game game) {
        GameEntity gameEntity = GameJpaMapper.INSTANCE.toGameEntity(game);
        return GameJpaMapper.INSTANCE.toGame(gameJpaRepository.save(gameEntity));
    }
}
