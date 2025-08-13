package darioselor.jpaFinalLayer.controller.admin.webmodel.book;

import darioselor.jpaFinalLayer.controller.user.webmodel.book.BookCollection;
import darioselor.jpaFinalLayer.domain._1model.Book;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-08-13T21:01:45+0200",
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
        float price = 0.0f;
        float discount = 0.0f;
        String cover = null;

        title = book.getTitleEs();
        isbn = book.getIsbn();
        if ( book.getPrice() != null ) {
            price = book.getPrice().floatValue();
        }
        discount = book.getDiscount();
        cover = book.getCover();

        BookCollection bookCollection = new BookCollection( isbn, title, price, discount, cover );

        return bookCollection;
    }
}
