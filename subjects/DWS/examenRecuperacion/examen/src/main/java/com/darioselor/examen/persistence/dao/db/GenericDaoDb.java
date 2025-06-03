package com.darioselor.examen.persistence.dao.db;

import com.darioselor.examen.domain._1model.ListWithCount;

import java.util.List;
import java.util.Optional;

public interface GenericDaoDb<T> {
    List<T> getAll();
    ListWithCount<T> getAll(int page, int size);
    Optional<T> findById(long id);
    String insert(T t);
    void update(T t);
    void delete(long id);
    long count();
    T save(T t);

}
