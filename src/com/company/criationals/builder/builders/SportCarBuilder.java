package com.company.criationals.builder.builders;

import com.company.criationals.builder.cars.Car;
import com.company.criationals.builder.cars.SportCar;
import com.company.criationals.builder.components.CarType;
import com.company.criationals.builder.components.ColorEnum;
import com.company.criationals.builder.components.Engine;
import com.company.criationals.builder.components.TransmissionType;

public class SportCarBuilder implements IbuilderSportCar{

    private CarType carType;
    private int seat;
    private Engine engine;
    private TransmissionType transmissionType;
    private ColorEnum colorEnum;

    @Override
    public void setColor(ColorEnum colorEnum){
        this.colorEnum = colorEnum;
    }

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

    public SportCar getResult(){
        return new SportCar(carType, seat, engine, transmissionType, colorEnum);
    }

}
