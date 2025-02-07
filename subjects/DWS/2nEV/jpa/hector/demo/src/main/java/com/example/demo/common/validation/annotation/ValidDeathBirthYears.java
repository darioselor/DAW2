package com.example.demo.common.validation.annotation;



import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.example.demo.common.validation.validators.BirthDeathYearValidator;

@Constraint(validatedBy = BirthDeathYearValidator.class)
@Target(ElementType.TYPE) // Aplica a nivel de clase
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidDeathBirthYears {
    String message() default "The death year must be greater than the birth year.";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}

