package com.darioselor.examen.persistence.repository.impl;

import com.darioselor.examen.domain._1model.Director;
import com.darioselor.examen.domain._4repository.DirectorRepository;
import com.darioselor.examen.persistence.dao.db.DirectorDaoDb;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class DirectorRepositoryImpl implements DirectorRepository {

    private final DirectorDaoDb directorDaoDb;

    @Override
    public Optional<Director> findById(long id) {
        return directorDaoDb.findById(id);
    }
}
