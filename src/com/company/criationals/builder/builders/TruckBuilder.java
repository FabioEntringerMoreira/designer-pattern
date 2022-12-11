package com.company.criationals.builder.builders;

import com.company.criationals.builder.cars.Truck;
import com.company.criationals.builder.components.CarType;
import com.company.criationals.builder.components.Engine;
import com.company.criationals.builder.components.TransmissionType;

public class TruckBuilder implements Ibuilder{

    private CarType carType;
    private int seat;
    private Engine engine;
    private TransmissionType transmissionType;

    @Override
    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    @Override
    public void setSeat(int seat) {
        this.seat = seat;
    }

    @Override
    public void setTransmission(TransmissionType transmissionType) {
        this.transmissionType = transmissionType;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Truck getResult(){
        return new Truck(carType, seat, engine, transmissionType);
    }
}
