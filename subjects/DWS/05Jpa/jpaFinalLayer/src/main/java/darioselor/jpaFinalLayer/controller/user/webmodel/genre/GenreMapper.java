package darioselor.jpaFinalLayer.controller.user.webmodel.genre;

import darioselor.jpaFinalLayer.domain._1model.Genre;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface GenreMapper {
    GenreMapper INSTANCE = Mappers.getMapper(GenreMapper.class);

    List<String> toGenreNameList(List<Genre> genres);

    default String toGenreName(Genre genre){
        return genre.getNameEs();
    }
}
