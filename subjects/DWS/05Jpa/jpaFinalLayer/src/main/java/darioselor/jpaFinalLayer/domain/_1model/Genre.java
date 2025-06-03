package darioselor.jpaFinalLayer.domain._1model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Genre {
    private Long id;
    private String nameEs;
    private String nameEn;
    private String slug;

}
