package com.company.criationals.abstrac.factory.factories;

import com.company.criationals.abstrac.factory.aircrafts.Helicopter;
import com.company.criationals.abstrac.factory.aircrafts.IAirCraft;
import com.company.criationals.abstrac.factory.landveicles.ILandVehicle;
import com.company.criationals.abstrac.factory.landveicles.Motorcycle;

public class NineNineTransport implements ITransportFactory{

    @Override
    public ILandVehicle createTransportVehicle() {
        return new Motorcycle();
    }

    @Override
    public IAirCraft createTransportAircraft() {
        return new Helicopter();
    }
}
