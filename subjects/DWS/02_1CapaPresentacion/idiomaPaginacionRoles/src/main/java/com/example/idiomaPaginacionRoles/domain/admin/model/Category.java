package com.example.idiomaPaginacionRoles.domain.admin.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Category {
    private long id;
    private String nameEs;
    private String nameEn;
    private String slug;
}
