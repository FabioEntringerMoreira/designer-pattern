package com.company.criationals.factory.method.vehicles.vehicle;

import com.company.criationals.factory.method.vehicles.vehicle.vehicle.inteface.IVehicle;

public class Car implements IVehicle {

    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Iniciando o trajeto");
    }

    @Override
    public void getCargo() {
        System.out.println("Pegamos os passageiros");
    }
}
