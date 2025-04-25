package com.repaso.restaurante.persistence.dao.db.jpa.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "client")
@Data
@NoArgsConstructor
public class ClientEntity {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "name")
    private String name;
}
