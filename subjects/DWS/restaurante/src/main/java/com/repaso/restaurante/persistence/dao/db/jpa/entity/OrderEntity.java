package com.repaso.restaurante.persistence.dao.db.jpa.entity;

import com.repaso.restaurante.domain.model.Client;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "orders")
@Data
@NoArgsConstructor

public class OrderEntity {

    @Id
    @GeneratedValue
    private Long Id;

    @Column(name = "table")
    private int table;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idClient")
    private ClientEntity clientEntity;

}
