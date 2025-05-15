package es.darioselor.domain.domain.admin.service.impl;

import es.darioselor.common.exception.ResourceNotFoundException;
import es.darioselor.domain.domain.admin.model.Book;
import es.darioselor.domain.domain.admin.service.BookAdminService;
import es.darioselor.domain.persistence.admin.repository.BookAdminRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class BookAdminServiceImpl implements BookAdminService {

    private final BookAdminRepository bookAdminRepository;

    @Override
    public List<Book> findAll() {
        return bookAdminRepository.findAll();
    }

    @Override
    public List<Book> findAll(int page, int pageSize) {
        return bookAdminRepository.findAll(page, pageSize);
    }

    @Override
    public int count() {
        return bookAdminRepository.count();
    }

    @Override
    public Book findByIsbn(String isbn) {

        return bookAdminRepository.findByIsbn(isbn).orElseThrow(() -> new ResourceNotFoundException("Book isbn " + isbn + " not found"));
    }
}
