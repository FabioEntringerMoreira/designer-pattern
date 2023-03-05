package com.company.anotation;

import java.lang.reflect.Field;

public class NegativeNumberValidator {

    public static void validate(Object object) throws IllegalAccessException,
            NegativeNumberValidationException {
        for (Field field : object.getClass().getDeclaredFields()) {
            field.setAccessible(true);
            if (field.isAnnotationPresent(NegativeNumber.class)) {
                double value = (double) field.get(object);
                if (value >= 0) {
                    throw new NegativeNumberValidationException(field.getAnnotation(NegativeNumber.class)
                            .message());
                }
            }
        }
    }
}
