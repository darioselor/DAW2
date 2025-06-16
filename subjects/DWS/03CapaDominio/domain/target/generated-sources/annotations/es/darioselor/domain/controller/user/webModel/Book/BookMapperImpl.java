package es.darioselor.domain.controller.user.webModel.Book;

import es.darioselor.domain.controller.user.webModel.Author.AuthorCollection;
import es.darioselor.domain.controller.user.webModel.Genre.GenreMapper;
import es.darioselor.domain.controller.user.webModel.Publisher.PublisherCollection;
import es.darioselor.domain.domain.user.model.Book;
import es.darioselor.domain.domain.user.model.Category;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-05-15T09:14:47+0200",
    comments = "version: 1.6.2, compiler: javac, environment: Java 21.0.7 (Amazon.com Inc.)"
)
public class BookMapperImpl implements BookMapper {

    private final GenreMapper genreMapper = GenreMapper.INSTANCE;

    @Override
    public BookCollection toBookCollection(Book book) {
        if ( book == null ) {
            return null;
        }

        String isbn = null;
        String title = null;
        float price = 0.0f;
        float discount = 0.0f;
        String cover = null;

        isbn = book.getIsbn();
        title = book.getTitle();
        price = book.getPrice();
        discount = book.getDiscount();
        cover = book.getCover();

        BookCollection bookCollection = new BookCollection( isbn, title, price, discount, cover );

        return bookCollection;
    }

    @Override
    public BookDetail toBookDetail(Book book) {
        if ( book == null ) {
            return null;
        }

        String category = null;
        String isbn = null;
        String title = null;
        float price = 0.0f;
        float discount = 0.0f;
        String synopsis = null;
        String cover = null;
        List<String> genres = null;

        category = bookCategoryName( book );
        isbn = book.getIsbn();
        title = book.getTitle();
        price = book.getPrice();
        discount = book.getDiscount();
        synopsis = book.getSynopsis();
        cover = book.getCover();
        genres = genreMapper.toGenreNameList( book.getGenres() );

        PublisherCollection publisherCollection = null;
        AuthorCollection authorCollection = null;

        BookDetail bookDetail = new BookDetail( isbn, title, price, discount, synopsis, cover, genres, category, publisherCollection, authorCollection );

        return bookDetail;
    }

    private String bookCategoryName(Book book) {
        Category category = book.getCategory();
        if ( category == null ) {
            return null;
        }
        return category.getName();
    }
}
