package com.example.demo.persistence.dao.db;

import java.util.List;
import java.util.Optional;

import com.example.demo.domain.model.Director;

public interface DirectorDaoDb extends GenericDaoDb<Director> {
    Optional<Director> findById(Long id);

    List<Director> findAll();
}
