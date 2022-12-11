package com.company.criationals.factory.method.vehicles.transport;

import com.company.criationals.factory.method.vehicles.vehicle.Bike;
import com.company.criationals.factory.method.vehicles.vehicle.vehicle.inteface.IVehicle;

public class BikeTransport extends Transport{

    @Override
    public IVehicle createTransport() {
        return new Bike();
    }
}
