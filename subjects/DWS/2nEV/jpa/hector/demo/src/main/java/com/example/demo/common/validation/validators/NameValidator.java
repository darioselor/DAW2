package com.example.demo.common.validation.validators;

import com.example.demo.common.validation.annotation.ValidName;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class NameValidator implements ConstraintValidator<ValidName, String> {

    private static final String LETTERS_ONLY_REGEX = "^[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s]+$";

    @Override
    public boolean isValid(String name, ConstraintValidatorContext context) {
        if (name == null) {
            return true; // Si es nulo, lo consideramos válido (puede haber otra validación para @NotNull)
        }

        // Validar que solo contenga letras y espacios
        return name.matches(LETTERS_ONLY_REGEX);
    }
}
