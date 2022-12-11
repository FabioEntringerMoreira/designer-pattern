package com.company.criationals.factory.method.vehicles.vehicle;

import com.company.criationals.factory.method.vehicles.vehicle.vehicle.inteface.IBikeVehicle;

public class Bike implements IBikeVehicle {

    @Override
    public void startRoute() {
        checkRoute();
        getCargo();
        System.out.println("Iniciando o delivery");
    }

    @Override
    public void getCargo() {
        System.out.println("Pegamos a comida");
    }

    @Override
    public void checkRoute() {
        System.out.println("Route is ok!");
    }
}
