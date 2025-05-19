package es.darioselor.domain.controller.admin.webModel.Genre;

import es.darioselor.domain.domain.admin.model.Genre;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface GenreMapper {
    GenreMapper INSTANCE = Mappers.getMapper(GenreMapper.class);

    List<String> toGenreNameList(List<Genre> genres);

    default String toGenreName(Genre genre) {
        return genre.getName();
    }
}
