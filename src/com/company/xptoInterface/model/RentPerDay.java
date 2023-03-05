package com.company.xptoInterface.model;

public class RentPerDay extends Rent{

    public RentPerDay(Notebook notebook) {
        super(notebook);
    }

    @Override
    public double calculateTotalPrice(int hoursOfRent) {

        double days = Math.ceil(hoursOfRent / 24d);
        return super.getNotebook().getPricePerDay() * days;
    }
}
