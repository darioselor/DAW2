package com.example.demo.persistence.repository.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.aot.hint.annotation.Reflective;
import org.springframework.stereotype.Component;

import com.example.demo.domain.model.Director;
import com.example.demo.domain.repository.DirectorRepository;
import com.example.demo.persistence.dao.db.DirectorDaoDb;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class DirectorRepositoryImpl implements DirectorRepository {

    private final DirectorDaoDb directorDaoDb;

    @Override
    public List<Director> findAll() {
        return directorDaoDb.findAll();
    }

    @Override
    public Optional<Director> findById(Long id) {
        return directorDaoDb.findById(id);
    }

}
