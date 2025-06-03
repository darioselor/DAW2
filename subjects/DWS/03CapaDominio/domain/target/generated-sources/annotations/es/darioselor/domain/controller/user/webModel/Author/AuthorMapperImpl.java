package es.darioselor.domain.controller.user.webModel.Author;

import es.darioselor.domain.domain.user.model.Author;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-05-15T09:14:48+0200",
    comments = "version: 1.6.2, compiler: javac, environment: Java 21.0.7 (Amazon.com Inc.)"
)
public class AuthorMapperImpl implements AuthorMapper {

    @Override
    public AuthorCollection toAuthorCollection(Author author) {
        if ( author == null ) {
            return null;
        }

        long id = 0L;
        String name = null;

        id = author.getId();
        name = author.getName();

        AuthorCollection authorCollection = new AuthorCollection( id, name );

        return authorCollection;
    }
}
