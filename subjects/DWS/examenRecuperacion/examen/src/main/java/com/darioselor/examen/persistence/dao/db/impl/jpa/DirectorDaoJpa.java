package com.darioselor.examen.persistence.dao.db.impl.jpa;

import com.darioselor.examen.domain._1model.Director;
import com.darioselor.examen.domain._1model.ListWithCount;
import com.darioselor.examen.persistence.dao.db.DirectorDaoDb;
import com.darioselor.examen.persistence.dao.db.impl.jpa.entity.DirectorEntity;
import com.darioselor.examen.persistence.dao.db.impl.jpa.mapper.DirectorJpaMapper;
import com.darioselor.examen.persistence.dao.db.impl.jpa.repository.DirectorJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class DirectorDaoJpa implements DirectorDaoDb {

    private final DirectorJpaRepository directorJpaRepository;

    @Override
    public List<Director> getAll() {
        return directorJpaRepository
                .findAll()
                .stream()
                .map(DirectorJpaMapper.INSTANCE::toDirector)
                .toList()
    }

    @Override
    public ListWithCount<Director> getAll(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        Page<DirectorEntity> directorPage = directorJpaRepository.findAll(pageable);
        return new ListWithCount<>(
                directorJpaRepository.findAll()
                        .stream()
                        .map(DirectorJpaMapper.INSTANCE::toDirector)
                        .toList();
                directorPage.getNumberOfElements();
        )

    }

    @Override
    public Optional<Director> findById(long id) {
        return directorJpaRepository.findById(id)
                .map(DirectorJpaMapper.INSTANCE::toDirector);
    }

    @Override
    public String insert(Director director) {
        DirectorEntity directorEntity = directorJpaRepository
                .save(DirectorJpaMapper.INSTANCE.toDirectorEntity(director));
        return directorEntity.getName();
    }

    @Override
    public void update(Director director) {
        directorJpaRepository.save(DirectorJpaMapper.INSTANCE.toDirectorEntity(director));
    }

    @Override
    public void delete(long id) {
        directorJpaRepository.deleteById(id);
    }

    @Override
    public long count() {
        return directorJpaRepository.count();
    }

    @Override
    public Director save(Director director) {
        return DirectorJpaMapper.INSTANCE.toDirector(
                directorJpaRepository.save(DirectorJpaMapper.INSTANCE.toDirectorEntity(director))
        );
    }
}
