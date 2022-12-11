package com.company.criationals.factory.method.vehicles.vehicle;

import com.company.criationals.factory.method.vehicles.vehicle.vehicle.inteface.IVehicle;

public class Motorcycle implements IVehicle {

    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Iniciando a entrega");
    }

    @Override
    public void getCargo() {
        System.out.println("Pegamos a encomenda");
    }
}
