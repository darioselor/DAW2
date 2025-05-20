package com.example.presentationLayer.controller.webModel.Author;

import com.example.presentationLayer.domain.model.Author;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-05-08T18:04:06+0200",
    comments = "version: 1.6.2, compiler: javac, environment: Java 21.0.7 (Oracle Corporation)"
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
