package com.company.strtucturals.decorator.exemple1;

import java.util.Objects;
import java.util.Optional;

/** In object-oriented programming, the decorator pattern is a design pattern that allows behavior to be added
 * to an individual object, dynamically, without affecting the behavior of other objects from the same class.
 * The decorator pattern is often useful for adhering to the Single Responsibility Principle,
 * as it allows functionality to be divided between classes with unique areas of concern as well as to the
 * Open-Closed Principle, by allowing the functionality of a class to be extended without being modified.
 */
public class Decorator {

   /* IPizza pizza = new TomatoSouce(new Mozzarela(new PlainIPizza()));

        pizza.getDescription();
        pizza.getCost();*/

    public static void main(String[] args) {

         IPizza pizza = new TomatoSouce(new Mozzarela(new PlainIPizza()));

        pizza.getDescription();
        pizza.getCost();
        pizza.xpto();

    }

}
