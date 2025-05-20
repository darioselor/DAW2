package com.example.idiomaPaginacionRoles.controller.user.webModel.Book;

import com.example.idiomaPaginacionRoles.controller.user.webModel.Author.AuthorCollection;
import com.example.idiomaPaginacionRoles.controller.user.webModel.Genre.GenreMapper;
import com.example.idiomaPaginacionRoles.controller.user.webModel.Publisher.PublisherCollection;
import com.example.idiomaPaginacionRoles.domain.user.model.Book;
import com.example.idiomaPaginacionRoles.domain.user.model.Category;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-05-09T18:10:34+0200",
    comments = "version: 1.6.2, compiler: Eclipse JDT (IDE) 3.42.0.z20250331-1358, environment: Java 21.0.6 (Eclipse Adoptium)"
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
