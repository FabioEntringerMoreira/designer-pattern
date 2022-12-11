package com.company.criationals.factory.method;

import com.company.criationals.factory.method.vehicles.transport.BikeTransport;
import com.company.criationals.factory.method.vehicles.transport.CarTransport;
import com.company.criationals.factory.method.vehicles.transport.MotorcycleTransport;
import com.company.criationals.factory.method.vehicles.transport.Transport;

/** In class-based programming, the factory method pattern is a creational pattern that uses factory methods
 * to deal with the problem of creating objects without having to specify the exact class of the object
 * that will be created.
 * This is done by creating objects by calling a factory method—either specified in an interface and
 * implemented by child classes, or implemented in a base class and optionally overridden by derived classes—rather
 * than by calling a constructor. */
public class FactoryMethodMain {

    private static Transport transport;

    public static void main(String[] args) {
        configure(args[0]);
        if (transport != null){
            transport.startTransport();
        }
    }

    private static void configure(String type) {
        switch (type){
            case "uber":
                transport = new CarTransport();
                break;
            case "log":
                transport = new MotorcycleTransport();
                break;
            case "bike":
                transport = new BikeTransport();
            default:
                System.out.println("Please, select a service type");
        }
    }
}
