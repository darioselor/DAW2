package com.arquitecture.darioselor.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Publisher {
    private Integer id;
    private String name;
    private String slug;
}
