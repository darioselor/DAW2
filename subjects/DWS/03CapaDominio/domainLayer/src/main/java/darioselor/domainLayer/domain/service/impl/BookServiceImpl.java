package darioselor.domainLayer.domain.service.impl;

import darioselor.domainLayer.domain.model.Book;
import darioselor.domainLayer.domain.repository.BookRepository;
import darioselor.domainLayer.domain.service.BookService;
import java.util.List;

public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;
    @Override
    public Book getBookById(Long id) {
        return bookRepository.getBookById(id);
    }

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.getAllBooks();
    }
    public Long insert(Book book) {
        return bookRepository.insert(book);
    }

    @Override
    public Book updateBook(Long id, Book book) {
        return bookRepository.updateBook(id, book);
    }

    @Override
    public void deleteBook(Long id) {

    }
}
