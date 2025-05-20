package com.example.idiomaPaginacionRoles.domain.user.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Publisher {

    private long id;
    private String name;
    private String slug;

}
