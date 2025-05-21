package darioselor.domainLayer.domain.repository;

import darioselor.domainLayer.domain.model.Book;

import java.util.List;

public interface BookRepository {
    Book getBookById(Long id);
    List<Book> getAllBooks();
    Long insert(Book book);
    Book updateBook(Long id, Book book);
    void deleteBook(Long id);



}
