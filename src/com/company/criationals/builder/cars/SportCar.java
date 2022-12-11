package com.company.criationals.builder.cars;

import com.company.criationals.builder.components.CarType;
import com.company.criationals.builder.components.ColorEnum;
import com.company.criationals.builder.components.Engine;
import com.company.criationals.builder.components.TransmissionType;

public class SportCar extends Car{

    private final ColorEnum colorEnum;

    public SportCar(CarType carType, int seat, Engine engine, TransmissionType transmissionType, ColorEnum colorEnum) {
        super(carType, seat, engine, transmissionType);
        this.colorEnum = colorEnum;
    }

    public ColorEnum getColorEnum() {
        return colorEnum;
    }
}
