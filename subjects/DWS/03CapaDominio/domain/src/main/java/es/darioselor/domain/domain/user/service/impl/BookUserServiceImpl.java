package es.darioselor.domain.domain.user.service.impl;

import es.darioselor.common.exception.ResourceNotFoundException;
import es.darioselor.domain.domain.user.model.Book;
import es.darioselor.domain.domain.user.service.BookUserService;
import es.darioselor.domain.persistence.user.repository.BookUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BookUserServiceImpl implements BookUserService {

    private final BookUserRepository bookUserRepository;
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
}
