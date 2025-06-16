package com.darioselor.examen.domain._3service.impl;

import com.darioselor.examen.common.annotation.DomainService;
import com.darioselor.examen.domain._1model.Director;
import com.darioselor.examen.domain._3service.DirectorService;
import com.darioselor.examen.domain._4repository.DirectorRepository;
import lombok.RequiredArgsConstructor;

import java.util.Optional;

@DomainService
@RequiredArgsConstructor
public class DirectorServiceImpl implements DirectorService {
    private final DirectorRepository directorRepository;
    @Override
    public Optional<Director> findById(long id) {
        return directorRepository.findById(id);

    }
}
