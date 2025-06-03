package com.darioselor.examen.persistence.dao.db.impl.jpa.mapper;

import com.darioselor.examen.persistence.dao.db.impl.jpa.entity.CharacterEntity;
import com.darioselor.examen.domain._1model.Character;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CharacterJpaMapper {
    CharacterJpaMapper INSTANCE = Mappers.getMapper(CharacterJpaMapper.class);
    Character toCharacter(CharacterEntity characterEntity);
    CharacterEntity toCharacterEntity(Character character);
}
