package com.company.strtucturals.decorator.exemple1;

public class PlainIPizza implements IPizza {

    @Override
    public String getDescription() {
        return "Queijo";
    }

    @Override
    public double getCost() {
        return 4.00;
    }
}
