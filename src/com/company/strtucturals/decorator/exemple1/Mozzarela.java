package com.company.strtucturals.decorator.exemple1;

public class Mozzarela extends ToppingDecorator{


    public Mozzarela(IPizza newPizza) {
        super(newPizza);

        System.out.println("Adding Dough");
        System.out.println("Adding Moz");
    }

    @Override
    public String getDescription() {
        return temPizza.getDescription() + ", Mozzarela";
    }

    @Override
    public double getCost() {
        return temPizza.getCost() + .50;
    }
}
