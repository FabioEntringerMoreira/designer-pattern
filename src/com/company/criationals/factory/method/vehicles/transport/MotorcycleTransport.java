package com.company.criationals.factory.method.vehicles.transport;

import com.company.criationals.factory.method.vehicles.vehicle.vehicle.inteface.IVehicle;
import com.company.criationals.factory.method.vehicles.vehicle.Motorcycle;

public class MotorcycleTransport extends Transport{

    @Override
    public IVehicle createTransport() {
        return new Motorcycle();
    }
}
