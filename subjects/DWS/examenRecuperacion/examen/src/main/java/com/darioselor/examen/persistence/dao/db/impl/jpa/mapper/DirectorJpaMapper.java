package com.darioselor.examen.persistence.dao.db.impl.jpa.mapper;

import com.darioselor.examen.domain._1model.Director;
import com.darioselor.examen.persistence.dao.db.impl.jpa.entity.DirectorEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface DirectorJpaMapper {
    DirectorJpaMapper INSTANCE = Mappers.getMapper(DirectorJpaMapper.class);
    Director toDirector(DirectorEntity directorEntity);
    DirectorEntity toDirectorEntity(Director director);
}
