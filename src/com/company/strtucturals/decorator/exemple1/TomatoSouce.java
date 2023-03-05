package com.company.strtucturals.decorator.exemple1;

public class TomatoSouce extends ToppingDecorator{

    public TomatoSouce(IPizza newPizza) {
        super(newPizza);

        System.out.println("Adding Souce");
    }

    @Override
    public String getDescription() {
        return temPizza.getDescription() + ", Tomato";
    }

    @Override
    public double getCost() {
        return temPizza.getCost() + 35;
    }
}
