package es.darioselor.domain.controller.admin.webModel.Book;

import es.darioselor.domain.domain.admin.model.Book;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-05-15T09:14:47+0200",
    comments = "version: 1.6.2, compiler: javac, environment: Java 21.0.7 (Amazon.com Inc.)"
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
