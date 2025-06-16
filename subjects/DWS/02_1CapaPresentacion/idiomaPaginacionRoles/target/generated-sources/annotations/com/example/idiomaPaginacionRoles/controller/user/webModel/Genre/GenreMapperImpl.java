package com.example.idiomaPaginacionRoles.controller.user.webModel.Genre;

import com.example.idiomaPaginacionRoles.domain.user.model.Genre;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-05-09T18:10:35+0200",
    comments = "version: 1.6.2, compiler: Eclipse JDT (IDE) 3.42.0.z20250331-1358, environment: Java 21.0.6 (Eclipse Adoptium)"
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
