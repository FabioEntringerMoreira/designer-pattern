package com.company.criationals.builder;

import com.company.criationals.builder.builders.CarBuilder;
import com.company.criationals.builder.builders.SportCarBuilder;
import com.company.criationals.builder.builders.TruckBuilder;
import com.company.criationals.builder.cars.Car;
import com.company.criationals.builder.cars.SportCar;
import com.company.criationals.builder.cars.Truck;
import com.company.criationals.builder.directors.Director;

/**
 *The builder pattern is a design pattern designed to provide a flexible solution to various object creation problems
 * in object-oriented programming.
 * The intent of the Builder design pattern is to separate the construction of a complex object from its representation.
 */
public class Builder {

    public static void main(String[] args) {
        Director director = new Director();

        // Create car
        CarBuilder builder = new CarBuilder();
        director.constructSedanCar(builder);
        Car car = builder.getResult();
        System.out.println(car.getCarType() + " Successfully produced");

        //Truck
        TruckBuilder truckBuilder = new TruckBuilder();
        director.constructTruck(truckBuilder);
        Truck truck = truckBuilder.getResult();
        System.out.println(truck.result());

        SportCarBuilder sportCarBuilder = new SportCarBuilder();
        director.constructSportCar(sportCarBuilder);
        SportCar sportCar = sportCarBuilder.getResult();
        System.out.println(sportCar.getCarType() + ", " + sportCar.getColorEnum() + ", " + sportCar.getEngine().getPower());
    }
}
