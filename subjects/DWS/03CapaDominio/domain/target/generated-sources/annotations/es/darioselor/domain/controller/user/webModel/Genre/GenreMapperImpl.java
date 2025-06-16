package es.darioselor.domain.controller.user.webModel.Genre;

import es.darioselor.domain.domain.user.model.Genre;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-05-15T09:14:48+0200",
    comments = "version: 1.6.2, compiler: javac, environment: Java 21.0.7 (Amazon.com Inc.)"
)
public class GenreMapperImpl implements GenreMapper {

    @Override
    public List<String> toGenreNameList(List<Genre> genres) {
        if ( genres == null ) {
            return null;
        }

        List<String> list = new ArrayList<String>( genres.size() );
        for ( Genre genre : genres ) {
            list.add( toGenreName( genre ) );
        }

        return list;
    }
}
