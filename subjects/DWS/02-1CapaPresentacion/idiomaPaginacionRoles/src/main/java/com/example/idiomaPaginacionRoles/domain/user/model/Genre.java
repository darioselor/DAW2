package com.example.idiomaPaginacionRoles.domain.user.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Genre {

    private long id;
    private String name;
    private String slug;

}
