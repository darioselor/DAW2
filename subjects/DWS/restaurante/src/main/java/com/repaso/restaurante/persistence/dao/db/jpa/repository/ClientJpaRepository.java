package com.repaso.restaurante.persistence.dao.db.jpa.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.repaso.restaurante.persistence.dao.db.jpa.entity.ClientEntity;

public interface ClientJpaRepository extends JpaRepository<ClientEntity, Long> {
    Optional<ClientEntity> findById(Long id);
}
