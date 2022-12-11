package com.company.criationals.abstrac.factory.factories;

import com.company.criationals.abstrac.factory.aircrafts.Airplane;
import com.company.criationals.abstrac.factory.aircrafts.IAirCraft;
import com.company.criationals.abstrac.factory.landveicles.Car;
import com.company.criationals.abstrac.factory.landveicles.ILandVehicle;

public class UberTransport implements ITransportFactory{

    @Override
    public ILandVehicle createTransportVehicle() {
        return new Car();
    }

    @Override
    public IAirCraft createTransportAircraft() {
        return new Airplane();
    }
}
