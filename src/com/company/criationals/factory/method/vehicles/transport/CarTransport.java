package com.company.criationals.factory.method.vehicles.transport;

import com.company.criationals.factory.method.vehicles.vehicle.Car;
import com.company.criationals.factory.method.vehicles.vehicle.vehicle.inteface.IVehicle;

public class CarTransport extends Transport{

    @Override
    public IVehicle createTransport() {
        return new Car();
    }
}
