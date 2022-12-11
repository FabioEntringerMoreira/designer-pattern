package com.company.criationals.factory.method.vehicles.transport;

import com.company.criationals.factory.method.vehicles.vehicle.vehicle.inteface.IVehicle;

public abstract class Transport {

    public void startTransport(){
        IVehicle vehicle = createTransport();
        vehicle.startRoute();
    }

    public abstract IVehicle createTransport();
}
