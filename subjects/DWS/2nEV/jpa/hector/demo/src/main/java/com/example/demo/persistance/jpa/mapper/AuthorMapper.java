package com.example.demo.persistance.jpa.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.example.demo.domain.model.Author;
import com.example.demo.persistance.jpa.entity.AuthorEntity;

@Mapper
public interface AuthorMapper {

        AuthorMapper INSTANCE = Mappers.getMapper(AuthorMapper.class);

        Author toAuthor(AuthorEntity authorEntity);

        AuthorEntity toAuthorEntity(Author author);

        List<Author> toAuthors(List<AuthorEntity> authorEntities);

        List<AuthorEntity> toAuthorEntities(List<Author> authors);
}
