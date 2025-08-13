package com.darioselor.examen.persistence.dao.db.impl.jpa.mapper;

import com.darioselor.examen.domain._1model.Game;
import com.darioselor.examen.persistence.dao.db.impl.jpa.entity.GameEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.awt.print.Book;

@Mapper(uses = {
        CharacterJpaMapper.class, DirectorJpaMapper.class
})
public interface GameJpaMapper {
    GameJpaMapper INSTANCE = Mappers.getMapper(GameJpaMapper.class);
    Game toGameWithDetails (GameEntity gameEntity);
    @Mapping(target = "characters", ignore = true)
    @Mapping(target = "director", ignore = true)
    Game toGame(GameEntity gameEntity);
    GameEntity toGameEntity(Game game);
}
