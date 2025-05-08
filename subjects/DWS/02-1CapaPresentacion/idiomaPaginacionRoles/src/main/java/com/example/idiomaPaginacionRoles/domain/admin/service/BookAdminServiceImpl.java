package com.example.idiomaPaginacionRoles.domain.admin.service;

import com.common.exception.ResourceNotFoundException;
import com.example.idiomaPaginacionRoles.domain.admin.model.Book;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookAdminServiceImpl implements BookAdminService{
    private final BookAdminRepository bookAdminRepository;
    @Override
    public List<Book> findAll() {
        return bookAdminRepository.findAll();
    }

    @Override
    public List<Book> findAll(int page, int size) {
        return bookAdminRepository.findAll(page, size);
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
