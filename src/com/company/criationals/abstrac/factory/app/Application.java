package com.company.criationals.abstrac.factory.app;

import com.company.criationals.abstrac.factory.aircrafts.IAirCraft;
import com.company.criationals.abstrac.factory.factories.ITransportFactory;
import com.company.criationals.abstrac.factory.landveicles.ILandVehicle;

public class Application {

    private ILandVehicle landVehicle;
    private IAirCraft airCraft;

    public Application(ITransportFactory transportFactory) {
        this.landVehicle = transportFactory.createTransportVehicle();
        this.airCraft = transportFactory.createTransportAircraft();
    }

    public void startRoute(){
        landVehicle.startRoute();
        airCraft.startRoute();
    }
}
