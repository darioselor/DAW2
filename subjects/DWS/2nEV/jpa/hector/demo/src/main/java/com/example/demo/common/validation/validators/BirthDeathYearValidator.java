package com.example.demo.common.validation.validators;



import com.example.demo.common.validation.annotation.ValidDeathBirthYears;
import com.example.demo.domain.model.Author;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class BirthDeathYearValidator implements ConstraintValidator<ValidDeathBirthYears, Author> {

    @Override
    public boolean isValid(Author author, ConstraintValidatorContext context) {
        if (author == null) {
            return true; // No validamos objetos nulos
        }

        Integer birthYear = author.getBirthYear();
        Integer deathYear = author.getDeathYear();

        // Si uno de los campos es nulo, asumimos que es válido (manejado por otras validaciones)
        if (birthYear == null || deathYear == null) {
            return true;
        }

        // Comprobamos que el año de muerte sea mayor al de nacimiento
        return deathYear > birthYear;
    }
}
