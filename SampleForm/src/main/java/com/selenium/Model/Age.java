package com.selenium.Model;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Documented
@Retention(RUNTIME)
@Target(FIELD)
@Constraint(validatedBy = AgeValidator.class)
public @interface Age {
	int upper() default 80;
	int lower() default 20;
	String message() default "{invalidAgeMesssage}";
	
	Class<?>[] groups() default { };
	Class<? extends Payload>[] payload() default{ };
}
