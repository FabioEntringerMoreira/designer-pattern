package com.company.criationals.builder.cars;

import com.company.criationals.builder.components.CarType;
import com.company.criationals.builder.components.Engine;
import com.company.criationals.builder.components.TransmissionType;

public class Truck {

    private final CarType carType;
    private final int seat;
    private final Engine engine;
    private final TransmissionType transmissionType;

    public Truck(CarType carType, int seat, Engine engine, TransmissionType transmissionType) {
        this.carType = carType;
        this.seat = seat;
        this.engine = engine;
        this.transmissionType = transmissionType;
    }

    public String result() {
        String truck = "Truck with motor: " + engine.getPower() + "\n";
        truck += "Transmission: " + transmissionType;

        return truck;
    }
}
