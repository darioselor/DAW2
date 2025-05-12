package es.darioselor.domain.domain.admin.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Author {
    private long id;
    private String name;
    private String biographyEs;
    private String biographyEn;

}
