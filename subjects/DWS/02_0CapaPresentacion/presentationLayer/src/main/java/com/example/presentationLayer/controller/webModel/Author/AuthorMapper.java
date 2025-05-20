package com.example.presentationLayer.controller.webModel.Author;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.example.presentationLayer.domain.model.Author;

@Mapper
public interface AuthorMapper {

    AuthorMapper INSTANCE = Mappers.getMapper(AuthorMapper.class);

    AuthorCollection toAuthorCollection(Author author);
}