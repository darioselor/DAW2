package com.repaso.restaurante.persistence.dao.db.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.repaso.restaurante.persistence.dao.db.jpa.entity.OrderDetailEntity;
import java.util.Optional;

public interface OrderDetailJpaRepository extends JpaRepository<OrderDetailEntity, Long> {
    Optional<OrderDetailEntity> findById(Long id);
}
