package com.company.anotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface NegativeNumber {
    // mensagem de erro que será exibida caso a validação falhe
    String message() default "ANNOTATION THROWING EXCEPTION - O valor deve ser negativo";
}
