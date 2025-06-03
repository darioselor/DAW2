package darioselor.jpaFinalLayer.persistence.dao.db;

import darioselor.jpaFinalLayer.domain._1model.ListWithCount;

import java.util.List;
import java.util.Optional;

public interface GenericDaoDb<T> {

    List<T> findAll();
    ListWithCount<T> findAll(int page, int pageSize);

    Optional<T> findById(long id);

    long insert(T t);

    void update(T t);

    void delete(long id);

    long count();

    T save(T t);
}
