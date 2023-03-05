package com.company.strtucturals.decorator.exemple1;

public abstract class ToppingDecorator implements IPizza{

    protected IPizza temPizza;

    public ToppingDecorator(IPizza newPizza){
        temPizza = newPizza;
    }

    @Override
    public String getDescription() {
        return temPizza.getDescription();
    }

    @Override
    public double getCost() {
        return temPizza.getCost();
    }
}
