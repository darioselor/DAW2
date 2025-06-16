package com.example.presentationLayer.controller.webModel.Genre;

import java.util.List;

import org.mapstruct.factory.Mappers;

import com.example.presentationLayer.domain.model.Genre;

public interface GenreMapper {
    GenreMapper INSTANCE = Mappers.getMapper(GenreMapper.class);

    List<String> toGenreNameList(List<Genre> genres);

    default String toGenreName(Genre genre) {
        return genre.getName();
    }
}
