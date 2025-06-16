package darioselor.jpaFinalLayer.domain._4repository;

import darioselor.jpaFinalLayer.domain._1model.Book;
import darioselor.jpaFinalLayer.domain._1model.ListWithCount;

import java.util.List;
import java.util.Optional;

public interface BookRepository {

    Optional<Book> findById(long id);
    Optional<Book> findByIsbn(String isbn);

    List<Book> findAll();
    ListWithCount<Book> findAll(int page, int pageSize);

    long count();

    void save(Book book);
    void delete(long id);
}
