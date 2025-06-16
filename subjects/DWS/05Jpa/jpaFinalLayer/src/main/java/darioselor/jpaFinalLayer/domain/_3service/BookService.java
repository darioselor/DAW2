package darioselor.jpaFinalLayer.domain._3service;

import darioselor.jpaFinalLayer.domain._1model.Author;
import darioselor.jpaFinalLayer.domain._1model.Book;
import darioselor.jpaFinalLayer.domain._1model.Genre;
import darioselor.jpaFinalLayer.domain._1model.ListWithCount;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

public interface BookService {
    Optional<Book> findByIsbn(String isbn);
    Optional<Book> findById(Long id);

    List<Book> findAll();
    ListWithCount<Book> findAll(int page, int size);

    long count();

    void save(Book book);

    void delete(Long id);

    void addAuthor(Book book, Author author);

    void addGenre(Book book, Genre genre);
}
