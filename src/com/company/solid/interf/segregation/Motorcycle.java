package com.company.solid.interf.segregation;

public class Motorcycle implements IVehicleMotorcicle{

    private String color;
    private String year;
    private double engine;

    public Motorcycle(String color, String year, double engine) {
        this.color = color;
        this.year = year;
        this.engine = engine;

        this.configureMotorcicle(color, year, engine);
        this.startVehicle();
    }

    @Override
    public void startVehicle() {
        System.out.println("Ligando o motor...");
    }

    @Override
    public void configureMotorcicle(String color, String year, double engine) {
        System.out.println("Creating motorcycle: " + color + " "+ year + " " + engine);
    }
}
