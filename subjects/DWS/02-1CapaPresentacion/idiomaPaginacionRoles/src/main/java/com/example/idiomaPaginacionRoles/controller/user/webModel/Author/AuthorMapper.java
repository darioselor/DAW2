package com.example.idiomaPaginacionRoles.controller.user.webModel.Author;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.example.idiomaPaginacionRoles.domain.user.model.Author;

@Mapper
public interface AuthorMapper {
    AuthorMapper INSANCE = Mappers.getMapper(AuthorMapper.class);

    AuthorCollection toAuthorCollection(Author author);
}
