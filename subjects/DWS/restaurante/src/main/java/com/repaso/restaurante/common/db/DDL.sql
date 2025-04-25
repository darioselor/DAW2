-- Crear la base de datos (si no existe) y usarla
DROP DATABASE IF EXISTS Restaurante;
CREATE DATABASE IF NOT EXISTS Restaurante;
USE Restaurante;

-- Tabla Client
CREATE TABLE Client (
    id BIGINT NOT NULL AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    PRIMARY KEY (id)
) ENGINE=InnoDB;

-- Tabla Orders
CREATE TABLE Orders (
    id BIGINT NOT NULL AUTO_INCREMENT,
    `table` INT NOT NULL,  -- "table" es palabra reservada, por lo que se encierra entre comillas invertidas
    idClient BIGINT NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (idClient) REFERENCES Client(id)
        ON DELETE CASCADE
        ON UPDATE CASCADE
) ENGINE=InnoDB;

-- Tabla Product
CREATE TABLE Product (
    id BIGINT NOT NULL AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    prize FLOAT NOT NULL,
    stock INT NOT NULL,
    PRIMARY KEY (id)
) ENGINE=InnoDB;

-- Tabla OrderDetails
CREATE TABLE OrderDetails (
    id BIGINT NOT NULL AUTO_INCREMENT,
    ProductId BIGINT NOT NULL,
    OrderId BIGINT NOT NULL,
    quantity INT NOT NULL,
    prize FLOAT NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (ProductId) REFERENCES Product(id)
        ON DELETE CASCADE
        ON UPDATE CASCADE,
    FOREIGN KEY (OrderId) REFERENCES Orders(id)
        ON DELETE CASCADE
        ON UPDATE CASCADE
) ENGINE=InnoDB;
