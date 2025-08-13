package darioselor.jpaFinalLayer.persistence.dao.db.impl.jpa.mapper;

import darioselor.jpaFinalLayer.domain._1model.Genre;
import darioselor.jpaFinalLayer.persistence.dao.db.impl.jpa.entity.GenreEntity;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-08-13T21:01:45+0200",
    comments = "version: 1.6.2, compiler: javac, environment: Java 21.0.7 (Amazon.com Inc.)"
)
public class GenreJpaMapperImpl implements GenreJpaMapper {

    @Override
    public Genre toGenre(GenreEntity genreEntity) {
        if ( genreEntity == null ) {
            return null;
        }

        Genre genre = new Genre();

        genre.setId( genreEntity.getId() );
        genre.setNameEs( genreEntity.getNameEs() );
        genre.setNameEn( genreEntity.getNameEn() );
        genre.setSlug( genreEntity.getSlug() );

        return genre;
    }

    @Override
    public GenreEntity toGenreEntity(Genre genre) {
        if ( genre == null ) {
            return null;
        }

        GenreEntity genreEntity = new GenreEntity();

        if ( genre.getId() != null ) {
            genreEntity.setId( genre.getId() );
        }
        genreEntity.setNameEs( genre.getNameEs() );
        genreEntity.setNameEn( genre.getNameEn() );
        genreEntity.setSlug( genre.getSlug() );

        return genreEntity;
    }
}
