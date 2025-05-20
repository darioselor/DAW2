package com.example.presentationLayer.controller.webModel.Book;

import com.example.presentationLayer.controller.webModel.Author.AuthorCollection;
import com.example.presentationLayer.controller.webModel.Genre.GenreMapper;
import com.example.presentationLayer.controller.webModel.Publisher.PublisherCollection;
import com.example.presentationLayer.domain.model.Book;
import com.example.presentationLayer.domain.model.Category;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-05-08T18:04:06+0200",
    comments = "version: 1.6.2, compiler: javac, environment: Java 21.0.7 (Oracle Corporation)"
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
