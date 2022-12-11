package com.company.criationals.builder.builders;

import com.company.criationals.builder.components.CarType;
import com.company.criationals.builder.components.Engine;
import com.company.criationals.builder.components.TransmissionType;

public interface Ibuilder {

    void setCarType(CarType carType);

    void setSeat(int seat);

    void setTransmission(TransmissionType transmissionType);

    void setEngine(Engine engine);
}
