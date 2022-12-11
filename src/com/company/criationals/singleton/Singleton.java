package com.company.criationals.singleton;

/** In software engineering, the singleton pattern is a software design pattern that restricts the instantiation
 * of a class to a singular instance. One of the well-known "Gang of Four" design patterns, which describe
 * how to solve recurring problems in object-oriented software, the pattern is useful when exactly one object
 * is needed to coordinate actions across a system.

 More specifically, the singleton pattern allows objects to:
 Ensure they only have one instance
 Provide easy access to that instance
 Control their instantiation (for example, hiding the constructors of a class)
 */
public class Singleton {

    public static void main(String[] args) {
        ThreadSafeSingleton.getInstance("Nothing");
    }

}
