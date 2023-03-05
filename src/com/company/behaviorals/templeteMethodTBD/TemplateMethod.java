package com.company.behaviorals.templeteMethodTBD;

import com.company.behaviorals.templeteMethodTBD.payment.PaymentProcessor;
import com.company.behaviorals.templeteMethodTBD.payment.Pix;

/**
 * The template method is a method in a superclass, usually an abstract superclass, and defines the skeleton of an operation
 * in terms of a number of high-level steps. These steps are themselves implemented by additional helper methods
 * in the same class as the template method.

 The helper methods may be either abstract methods, in which case subclasses are required to provide concrete implementations,
 or hook methods, which have empty bodies in the superclass. Subclasses can (but are not required to)
 customize the operation by overriding the hook methods. The intent of the template method is to define the
 overall structure of the operation, while allowing subclasses to refine, or redefine, certain steps.*/
public class TemplateMethod {

    public static void main(String[] args) {

        PaymentProcessor processor = new Pix();
        processor.process();
    }
}
