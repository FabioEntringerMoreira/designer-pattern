package com.company.solid.interf.segregation;

public class Car implements IVehicleCar{

    private String color;
    private String year;
    private double engine;
    private int seats;

    public Car(String color, String year, double engine, int seats) {
        this.color = color;
        this.year = year;
        this.engine = engine;
        this.seats = seats;

        this.configureCar(color, year, engine, seats);
        this.startVehicle();
    }

    @Override
    public void startVehicle() {
        System.out.println("Ligando o motor...");
    }

    @Override
    public void configureCar(final String color, final String year, final double engine, final int seats) {
        System.out.println("Creating car: " + color + " "+ year + " " + engine + " " + seats);
    }
}
