package es.darioselor.domain.domain.user.service.impl;

import es.darioselor.common.annotation.DomainService;
import es.darioselor.common.exception.ResourceNotFoundException;
import es.darioselor.domain.domain.user.model.Author;
import es.darioselor.domain.domain.user.model.Book;
import es.darioselor.domain.domain.user.model.Genre;
import es.darioselor.domain.domain.user.repository.AuthorUserRepository;
import es.darioselor.domain.domain.user.service.BookUserService;
import es.darioselor.domain.domain.user.repository.BookUserRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@DomainService
@RequiredArgsConstructor
public class BookUserServiceImpl implements BookUserService {

    private final BookUserRepository bookUserRepository;
    private final AuthorUserRepository authorUserRepository;
    @Override
    public List<Book> findAll() {
        return bookUserRepository.findAll();
    }

    @Override
    public List<Book> findAll(int page, int size) {
        return bookUserRepository.findAll(page, size);
    }

    @Override
    public int count() {
        return bookUserRepository.count();
    }

    @Override
    public Book findByIsbn(String isbn) {
        return bookUserRepository.findByIsbn(isbn).orElseThrow(() -> new ResourceNotFoundException("Book with isbn: " + isbn + " not found"));
    }

    @Override
    public void insertAuthors(String isbnBook, List<Author> authors) {
        Book book = bookUserRepository.findByIsbn(isbnBook).orElseThrow(() -> new ResourceNotFoundException("Book " + isbnBook + " not found"));
        List<Author> authorList = authorUserRepository.findAuthorsByBookIsbn(
                authors.stream()
                        .map(Author::getId)
                        .toArray(Long[]::new)
        );
        if (authorList.size() != authors.size()) {
        throw new ResourceNotFoundException("Some authors were not found");
        }
        authorList.forEach(book::addAuthor);
        bookUserRepository.save(Book);
    }

    @Override
    public void insertGenres(String isbnBook, List<Genre> genres) {

    }
}
