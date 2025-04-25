package com.repaso.restaurante.persistence.dao.db.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.repaso.restaurante.persistence.dao.db.jpa.entity.OrderEntity;
import java.util.Optional;

public interface OrderJpaRepository extends JpaRepository<OrderEntity, Long> {
    Optional<OrderEntity> findById(Long id);
}
