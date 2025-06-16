package com.darioselor.examen.controller.admin.webmodel.game;

import com.darioselor.examen.domain._1model.Game;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface GameMapper {
    GameMapper INSTANCE = Mappers.getMapper(GameMapper.class);

    @Mapping(target = "title", source = "game.title")
    GameCollection toGameCollection(Game game);
}
