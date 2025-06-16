package darioselor.jpaFinalLayer.controller.user.webmodel.author;

import darioselor.jpaFinalLayer.domain._1model.Author;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-06-03T07:54:08+0200",
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

        if ( author.getId() != null ) {
            id = author.getId();
        }
        name = author.getName();

        AuthorCollection authorCollection = new AuthorCollection( id, name );

        return authorCollection;
    }
}
