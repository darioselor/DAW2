package darioselor.jpaFinalLayer.persistence.repository.impl;

import darioselor.jpaFinalLayer.domain._1model.Book;
import darioselor.jpaFinalLayer.domain._1model.ListWithCount;
import darioselor.jpaFinalLayer.domain._4repository.BookRepository;
import darioselor.jpaFinalLayer.persistence.dao.cache.BookDaoCache;
import darioselor.jpaFinalLayer.persistence.dao.db.BookDaoDb;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class BookRepositoryImpl implements BookRepository {
    private final BookDaoDb bookDaoDb;
    private final BookDaoCache bookDaoCache;

    @Override
    public Optional<Book> findById(long id) {
        return bookDaoDb.findById(id);
    }

    @Override
    public Optional<Book> findByIsbn(String isbn) {
//        return bookDaoCache.findByIsbn(isbn).or(
//                () -> {
//                    System.out.println("Retrieved from db: " + isbn);
//                    Optional<Book> book = bookDaoDb.findByIsbn(isbn);
//                    book.ifPresent(bookDaoCache::save);
//                    return book;
//                }
//        );
        return bookDaoDb.findByIsbn(isbn);
    }

    @Override
    public List<Book> findAll() {
        return bookDaoDb.findAll();
    }

    @Override
    public ListWithCount<Book> findAll(int page, int pageSize) {
        return bookDaoDb.findAll(page, pageSize);
    }

    @Override
    public long count() {
        return bookDaoDb.count();
    }

    @Override
    public void save(Book book) {
        bookDaoDb.save(book);
    }

    @Override
    public void delete(long id) {
        bookDaoDb.delete(id);
    }
}
