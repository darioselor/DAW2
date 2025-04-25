package com.repaso.restaurante.persistence.dao.db.jpa.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.repaso.restaurante.persistence.dao.db.jpa.entity.ProductEntity;

public interface ProductJpaRepository extends JpaRepository<ProductEntity, Long> {
    Optional<ProductEntity> findById(Long id);
}
