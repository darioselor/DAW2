package com.darioselor.examen.persistence.dao.db.impl.jpa.repository;

import com.darioselor.examen.persistence.dao.db.impl.jpa.entity.DirectorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DirectorJpaRepository extends JpaRepository<DirectorEntity, Long> {

}
