package com.company.anotation;

public class Main {

    public static void main(String[] args) throws NegativeNumberValidationException,
            IllegalAccessException {

        MyClass myEntity = new MyClass();
        NegativeNumberValidator.validate(myEntity);
    }
}
