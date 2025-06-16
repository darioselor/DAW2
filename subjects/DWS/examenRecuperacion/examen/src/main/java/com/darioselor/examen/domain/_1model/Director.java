package com.darioselor.examen.domain._1model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Director {
    private long id;
    private String name;
    private String role;
    private String biography;
}
