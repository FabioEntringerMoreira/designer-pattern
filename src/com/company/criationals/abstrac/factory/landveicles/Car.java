package com.company.criationals.abstrac.factory.landveicles;

public class Car implements ILandVehicle {

    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Iniciando o trajeto");
    }

    @Override
    public void getCargo() {
        System.out.println("Pegando ps passageiros");
    }
}
