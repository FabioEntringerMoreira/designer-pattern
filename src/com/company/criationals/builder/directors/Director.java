package com.company.criationals.builder.directors;

import com.company.criationals.builder.builders.Ibuilder;
import com.company.criationals.builder.builders.IbuilderSportCar;
import com.company.criationals.builder.components.CarType;
import com.company.criationals.builder.components.ColorEnum;
import com.company.criationals.builder.components.Engine;
import com.company.criationals.builder.components.TransmissionType;

public class Director {

    public void constructSedanCar(Ibuilder builder){
        builder.setCarType(CarType.SEDAN);
        builder.setSeat(5);
        builder.setTransmission(TransmissionType.AUTOMATIC);
        builder.setEngine(new Engine(1600));
    }

    public void constructTruck(Ibuilder builder){
        builder.setCarType(CarType.TRUCK);
        builder.setSeat(5);
        builder.setTransmission(TransmissionType.AUTOMATIC_SEQUENTIAL);
        builder.setEngine(new Engine(13000));
    }

    public void constructSportCar(IbuilderSportCar builder){
        builder.setColor(ColorEnum.YELLOW);
        builder.setCarType(CarType.SPORT_CAR);
        builder.setSeat(2);
        builder.setEngine(new Engine(4000));
    }
}
