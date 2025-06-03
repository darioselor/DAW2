package darioselor.domainLayer.domain.service;

import darioselor.domainLayer.domain.model.Book;

import java.util.List;

public interface BookService {

    Book getBookById(Long id);
    List<Book> getAllBooks();
    Book createBook(Book book);
    Book updateBook(Long id, Book book);
    void deleteBook(Long id);


}