package com.company.xptoInterface.model;

public class RentPerHour extends Rent{

    public RentPerHour(Notebook notebook) {
        super(notebook);
    }

    @Override
    public double calculateTotalPrice(int hoursOfRent) {
        return super.getNotebook().getPricePerHour() * hoursOfRent;
    }
}
