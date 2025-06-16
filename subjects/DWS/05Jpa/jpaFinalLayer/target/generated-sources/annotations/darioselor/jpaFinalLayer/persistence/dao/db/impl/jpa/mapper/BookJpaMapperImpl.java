package darioselor.jpaFinalLayer.persistence.dao.db.impl.jpa.mapper;

import darioselor.jpaFinalLayer.domain._1model.Author;
import darioselor.jpaFinalLayer.domain._1model.Book;
import darioselor.jpaFinalLayer.domain._1model.Genre;
import darioselor.jpaFinalLayer.persistence.dao.db.impl.jpa.entity.AuthorEntity;
import darioselor.jpaFinalLayer.persistence.dao.db.impl.jpa.entity.BookEntity;
import darioselor.jpaFinalLayer.persistence.dao.db.impl.jpa.entity.GenreEntity;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-06-03T07:54:08+0200",
    comments = "version: 1.6.2, compiler: javac, environment: Java 21.0.7 (Amazon.com Inc.)"
)
public class BookJpaMapperImpl implements BookJpaMapper {

    private final PublisherJpaMapper publisherJpaMapper = PublisherJpaMapper.INSTANCE;
    private final AuthorJpaMapper authorJpaMapper = AuthorJpaMapper.INSTANCE;
    private final GenreJpaMapper genreJpaMapper = GenreJpaMapper.INSTANCE;
    private final CategoryJpaMapper categoryJpaMapper = CategoryJpaMapper.INSTANCE;

    @Override
    public Book toBookWithDetails(BookEntity bookEntity) {
        if ( bookEntity == null ) {
            return null;
        }

        Book book = new Book();

        book.setId( bookEntity.getId() );
        book.setIsbn( bookEntity.getIsbn() );
        book.setTitleEs( bookEntity.getTitleEs() );
        book.setTitleEn( bookEntity.getTitleEn() );
        book.setSynopsisEs( bookEntity.getSynopsisEs() );
        book.setSynopsisEn( bookEntity.getSynopsisEn() );
        book.setPrice( BigDecimal.valueOf( bookEntity.getPrice() ) );
        book.setDiscount( bookEntity.getDiscount() );
        book.setCover( bookEntity.getCover() );
        book.setPublisher( publisherJpaMapper.toPublisher( bookEntity.getPublisher() ) );
        book.setCategory( categoryJpaMapper.toCategory( bookEntity.getCategory() ) );
        book.setGenres( genreEntityListToGenreList( bookEntity.getGenres() ) );
        book.setAuthors( authorEntityListToAuthorList( bookEntity.getAuthors() ) );

        return book;
    }

    @Override
    public Book toBook(BookEntity bookEntity) {
        if ( bookEntity == null ) {
            return null;
        }

        Book book = new Book();

        book.setId( bookEntity.getId() );
        book.setIsbn( bookEntity.getIsbn() );
        book.setTitleEs( bookEntity.getTitleEs() );
        book.setTitleEn( bookEntity.getTitleEn() );
        book.setSynopsisEs( bookEntity.getSynopsisEs() );
        book.setSynopsisEn( bookEntity.getSynopsisEn() );
        book.setPrice( BigDecimal.valueOf( bookEntity.getPrice() ) );
        book.setDiscount( bookEntity.getDiscount() );
        book.setCover( bookEntity.getCover() );

        return book;
    }

    @Override
    public BookEntity toBookEntity(Book book) {
        if ( book == null ) {
            return null;
        }

        BookEntity bookEntity = new BookEntity();

        if ( book.getId() != null ) {
            bookEntity.setId( book.getId() );
        }
        bookEntity.setIsbn( book.getIsbn() );
        bookEntity.setTitleEs( book.getTitleEs() );
        bookEntity.setTitleEn( book.getTitleEn() );
        bookEntity.setSynopsisEs( book.getSynopsisEs() );
        bookEntity.setSynopsisEn( book.getSynopsisEn() );
        if ( book.getPrice() != null ) {
            bookEntity.setPrice( book.getPrice().floatValue() );
        }
        bookEntity.setDiscount( book.getDiscount() );
        bookEntity.setCover( book.getCover() );
        bookEntity.setPublisher( publisherJpaMapper.toPublisherEntity( book.getPublisher() ) );
        bookEntity.setCategory( categoryJpaMapper.toCategoryEntity( book.getCategory() ) );
        bookEntity.setAuthors( authorListToAuthorEntityList( book.getAuthors() ) );
        bookEntity.setGenres( genreListToGenreEntityList( book.getGenres() ) );

        return bookEntity;
    }

    protected List<Genre> genreEntityListToGenreList(List<GenreEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<Genre> list1 = new ArrayList<Genre>( list.size() );
        for ( GenreEntity genreEntity : list ) {
            list1.add( genreJpaMapper.toGenre( genreEntity ) );
        }

        return list1;
    }

    protected List<Author> authorEntityListToAuthorList(List<AuthorEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<Author> list1 = new ArrayList<Author>( list.size() );
        for ( AuthorEntity authorEntity : list ) {
            list1.add( authorJpaMapper.toAuthor( authorEntity ) );
        }

        return list1;
    }

    protected List<AuthorEntity> authorListToAuthorEntityList(List<Author> list) {
        if ( list == null ) {
            return null;
        }

        List<AuthorEntity> list1 = new ArrayList<AuthorEntity>( list.size() );
        for ( Author author : list ) {
            list1.add( authorJpaMapper.toAuthorEntity( author ) );
        }

        return list1;
    }

    protected List<GenreEntity> genreListToGenreEntityList(List<Genre> list) {
        if ( list == null ) {
            return null;
        }

        List<GenreEntity> list1 = new ArrayList<GenreEntity>( list.size() );
        for ( Genre genre : list ) {
            list1.add( genreJpaMapper.toGenreEntity( genre ) );
        }

        return list1;
    }
}
