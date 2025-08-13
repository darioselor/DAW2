package darioselor.jpaFinalLayer.persistence.dao.db.impl.jpa.mapper;

import darioselor.jpaFinalLayer.domain._1model.Author;
import darioselor.jpaFinalLayer.persistence.dao.db.impl.jpa.entity.AuthorEntity;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-08-13T21:01:45+0200",
    comments = "version: 1.6.2, compiler: javac, environment: Java 21.0.7 (Amazon.com Inc.)"
)
public class AuthorJpaMapperImpl implements AuthorJpaMapper {

    @Override
    public Author toAuthor(AuthorEntity authorEntity) {
        if ( authorEntity == null ) {
            return null;
        }

        Author author = new Author();

        author.setId( authorEntity.getId() );
        author.setName( authorEntity.getName() );
        author.setNationality( authorEntity.getNationality() );
        author.setBiographyEs( authorEntity.getBiographyEs() );
        author.setBiographyEn( authorEntity.getBiographyEn() );
        author.setBirthYear( authorEntity.getBirthYear() );
        author.setDeathYear( authorEntity.getDeathYear() );

        return author;
    }

    @Override
    public AuthorEntity toAuthorEntity(Author author) {
        if ( author == null ) {
            return null;
        }

        AuthorEntity authorEntity = new AuthorEntity();

        if ( author.getId() != null ) {
            authorEntity.setId( author.getId() );
        }
        authorEntity.setName( author.getName() );
        authorEntity.setNationality( author.getNationality() );
        authorEntity.setBiographyEs( author.getBiographyEs() );
        authorEntity.setBiographyEn( author.getBiographyEn() );
        authorEntity.setBirthYear( author.getBirthYear() );
        authorEntity.setDeathYear( author.getDeathYear() );

        return authorEntity;
    }
}
