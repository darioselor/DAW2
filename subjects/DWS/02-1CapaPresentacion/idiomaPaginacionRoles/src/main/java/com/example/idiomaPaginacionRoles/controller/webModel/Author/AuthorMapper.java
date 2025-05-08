package com.example.idiomaPaginacionRoles.controller.webModel.Author;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.example.idiomaPaginacionRoles.domain.model.Author;

import java.util.List;

@Mapper
public interface AuthorMapper {
    AuthorMapper INSANCE = Mappers.getMapper(AuthorMapper.class);

    AuthorCollection toAuthorCollection(Author author);
}
