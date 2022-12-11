package com.company.criationals.abstrac.factory.aircrafts;

public class Helicopter implements IAirCraft{

    @Override
    public void startRoute() {
        wind();
        getCargo();
        System.out.println("Iniciando o trajeto");
    }

    @Override
    public void getCargo() {
        System.out.println("Passageiros a bordo");
    }

    @Override
    public void wind() {
        System.out.println("Ventos a 25km. Podemos ir!");
    }
}
