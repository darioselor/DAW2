package com.example.demo.persistence.dao.db;

import java.util.List;
import java.util.Optional;

public interface GenericDaoDb<T> {
    List<T> findAll();

    Optional<T> findById(Long id);
}
