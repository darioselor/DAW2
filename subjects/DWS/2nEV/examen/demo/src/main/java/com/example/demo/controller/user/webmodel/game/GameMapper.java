package com.example.demo.controller.user.webmodel.game;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.example.demo.controller.user.webmodel.character.CharacterMapper;
import com.example.demo.controller.user.webmodel.director.DirectorMapper;
import com.example.demo.domain.model.Game;

@Mapper(uses = { CharacterMapper.class, DirectorMapper.class })
public interface GameMapper {

    GameMapper INSTANCE = Mappers.getMapper(GameMapper.class);

    GameCollection toGameCollection(Game game);

    @Mapping(target = "characters", source = "game_characters")
    @Mapping(target = "directors", source = "directors")
    GameDetail toGameDetail(Game game);
}
