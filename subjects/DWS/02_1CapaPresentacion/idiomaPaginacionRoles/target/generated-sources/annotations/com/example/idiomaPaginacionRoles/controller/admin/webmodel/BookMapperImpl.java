package com.example.idiomaPaginacionRoles.controller.admin.webmodel;

import com.example.idiomaPaginacionRoles.domain.admin.model.Book;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-05-09T18:10:34+0200",
    comments = "version: 1.6.2, compiler: Eclipse JDT (IDE) 3.42.0.z20250331-1358, environment: Java 21.0.6 (Eclipse Adoptium)"
)
public class BookMapperImpl implements BookMapper {

    @Override
    public BookCollection toBookCollection(Book book) {
        if ( book == null ) {
            return null;
        }

        String title = null;
        String isbn = null;

        title = book.getTitle();
        isbn = book.getIsbn();

        BookCollection bookCollection = new BookCollection( isbn, title );

        return bookCollection;
    }
}
