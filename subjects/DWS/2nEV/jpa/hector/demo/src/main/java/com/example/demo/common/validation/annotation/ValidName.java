package com.example.demo.common.validation.annotation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.example.demo.common.validation.validators.NameValidator;

@Constraint(validatedBy = NameValidator.class)
@Target(ElementType.FIELD) // La validación se aplicará a nivel de campo
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidName {
    String message() default "The name must contain only letters.";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}