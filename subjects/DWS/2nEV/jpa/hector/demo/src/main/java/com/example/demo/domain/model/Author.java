package com.example.demo.domain.model;

import com.example.demo.common.locale.LanguageUtils;
import com.example.demo.common.validation.annotation.ValidDeathBirthYears;
import com.example.demo.common.validation.annotation.ValidName;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ValidDeathBirthYears
public class Author {

    
    private Integer id;

    @NotBlank
    @ValidName(message = "The name must have only contain letters")
    private String name;

    @NotBlank
    private String nationality;

    @NotBlank
    private String biographyEn;

    @NotBlank
    private String biographyEs;

    @NotNull
    @Min(value = 1800, message = "The birth year must be greater than or equal to 1800")
    private Integer birthYear;

   
    private Integer deathYear;

    
        public String getBiography(){
            String language = LanguageUtils.getCurrentLanguage();
            if ("en".equals(language)) {
                return biographyEn;
            }
            return biographyEs;
        }
    
        

    
    
    
}
