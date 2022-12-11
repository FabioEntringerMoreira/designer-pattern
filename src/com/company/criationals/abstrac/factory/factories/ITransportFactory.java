package com.company.criationals.abstrac.factory.factories;

import com.company.criationals.abstrac.factory.aircrafts.IAirCraft;
import com.company.criationals.abstrac.factory.landveicles.ILandVehicle;

public interface ITransportFactory {

    ILandVehicle createTransportVehicle();

    IAirCraft createTransportAircraft();

}
