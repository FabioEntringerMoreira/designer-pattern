package com.company.criationals.abstrac.factory.landveicles;

public class Motorcycle implements ILandVehicle{

    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Iniciando a entrega");
    }

    @Override
    public void getCargo() {
        System.out.println("Pegando a encomenda");
    }
}
