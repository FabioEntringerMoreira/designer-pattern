package com.company.solid.interf.segregation;

/**
 * In the field of software engineering, the interface segregation principle (ISP) states that no code should be forced
 * to depend on methods it does not use.
 * ISP splits interfaces that are very large into smaller and more specific ones so that clients will only have
 * to know about the methods that are of interest to them. Such shrunken interfaces are also called role interfaces.
 * ISP is intended to keep a system decoupled and thus easier to refactor, change, and redeploy.
 * ISP is one of the five SOLID principles of object-oriented design, similar to the High Cohesion Principle of GRASP.
 * Beyond object-oriented design, ISP is also a key principle in the design of distributed systems in general
 * and microservices in particular.
 * ISP is one of the six IDEALS principles for microservice design.
 */
public class InterfaceSegregationPrinciple {

    static VehicleType vehicleType = VehicleType.MOTORCYCLE;

    public static void main(String[] args) {

        if (vehicleType.equals(VehicleType.CAR)){
            new Car("Prata", "2009", 1000, 5);
        }else {
            new Motorcycle("Prata", "2022", 1.100);
        }

    }
}
