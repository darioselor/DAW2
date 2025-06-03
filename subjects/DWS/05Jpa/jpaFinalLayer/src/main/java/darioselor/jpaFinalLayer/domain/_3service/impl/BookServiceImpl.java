package darioselor.jpaFinalLayer.domain._3service.impl;

import darioselor.jpaFinalLayer.common.exception.ResourceAlreadyExistsException;
import darioselor.jpaFinalLayer.domain._1model.Author;
import darioselor.jpaFinalLayer.domain._1model.Book;
import darioselor.jpaFinalLayer.domain._1model.Genre;
import darioselor.jpaFinalLayer.domain._1model.ListWithCount;
import darioselor.jpaFinalLayer.domain._3service.BookService;
import darioselor.jpaFinalLayer.domain._4repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    @Override
    public Optional<Book> findByIsbn(String isbn) {
        return Optional.ofNullable(bookRepository.findByIsbn(isbn));
    }

    @Override
    public Optional<Book> findById(Long id) {
        return Optional.ofNullable(bookRepository.findById(id));
    }

    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public ListWithCount<Book> findAll(int page, int size) {
        return bookRepository.findAll(page, size);
    }

    @Override
    public long count() {
        return bookRepository.count();
    }

    @Override
    public void save(Book book) {
        bookRepository.save(book);
    }

    @Override
    public void delete(Long id) {
        bookRepository.delete(id);
    }

    @Override
    public void addAuthor(Book book, Author author) {
        if (book.getAuthors() == null) {
            book.setAuthors(new ArrayList<>());
        }
        if (book.getAuthors().contains(author)) {
            throw new ResourceAlreadyExistsException("Author " + author.getName() + " already exists in book " + book.getTitleEs());
        }
        book.addAuthor(author);
    }

    @Override
    public void addGenre(Book book, Genre genre) {
            if (book.getGenres() == null) {
                book.setGenres(new ArrayList<>());
            } if (book.getGenres().contains(genre)){
                throw new ResourceAlreadyExistsException("Genre "+genre.getNameEs()+" already exists in book " +book.getTitleEs());
            }
            book.addGenre(genre);
    }
}
