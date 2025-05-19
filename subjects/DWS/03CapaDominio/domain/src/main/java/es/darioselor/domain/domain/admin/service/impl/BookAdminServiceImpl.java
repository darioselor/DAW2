package es.darioselor.domain.domain.admin.service.impl;

import es.darioselor.common.annotation.DomainService;
import es.darioselor.common.exception.ResourceAlreadyExistsException;
import es.darioselor.common.exception.ResourceNotFoundException;
import es.darioselor.domain.domain.admin.model.Author;
import es.darioselor.domain.domain.admin.model.Book;
import es.darioselor.domain.domain.admin.model.Genre;
import es.darioselor.domain.domain.admin.repository.AuthorAdminRepository;
import es.darioselor.domain.domain.admin.service.BookAdminService;
import es.darioselor.domain.domain.admin.repository.BookAdminRepository;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@DomainService
@RequiredArgsConstructor
public class BookAdminServiceImpl implements BookAdminService {

    private final BookAdminRepository bookUserRepository;
    private final AuthorAdminRepository authorAdminRepository;
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
    public Optional<Book> findByIsbn(String isbn) {
        return bookUserRepository.findByIsbn(isbn);
    }
    @Override
    public Optional<Book> findById(Long id) {
        return bookUserRepository.findById(id);
    }

    @Override
    public void insertAuthors(Long id, List<Author> authors) {
        Book book = bookUserRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Book " + id + " not found"));
        List<Author> authorList = authorAdminRepository.findAllById(
                authors.stream()
                        .map(Author::getId)
                        .toArray(Long[]::new)
        );
        if (authorList.size() != authors.size()) {
        throw new ResourceNotFoundException("Some authors were not found");
        }
        authorList.forEach(book::addAuthor);
        bookUserRepository.save(book);
    }

    @Override
    public void addGenre(Book book, Genre genre) {
        if (book.getGenres() == null) {
            book.setGenres(new ArrayList<>());
        }
        if (book.getGenres().contains(genre)) {
            throw new ResourceAlreadyExistsException("Genre " + genre.getId() + "already exists");
        }
        book.addGenre(genre);
    }
}
