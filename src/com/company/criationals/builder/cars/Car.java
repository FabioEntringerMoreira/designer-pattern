package com.company.criationals.builder.cars;

import com.company.criationals.builder.components.CarType;
import com.company.criationals.builder.components.Engine;
import com.company.criationals.builder.components.TransmissionType;

import java.util.Objects;

public class Car {

    private final CarType carType;
    private final int seat;
    private final Engine engine;
    private final TransmissionType transmissionType;

    public Car(CarType carType, int seat, Engine engine, TransmissionType transmissionType) {
        this.carType = carType;
        this.seat = seat;
        this.engine = engine;
        this.transmissionType = transmissionType;
    }

    public CarType getCarType() {
        return carType;
    }

    public int getSeat() {
        return seat;
    }

    public Engine getEngine() {
        return engine;
    }

    public TransmissionType getTransmission() {
        return transmissionType;
    }
}
