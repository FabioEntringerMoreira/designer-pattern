package com.company.xptoEnum;

public class Plant {

    enum LifeCycle {ANNUAL, PERENNIAL, BIENNAL}

    final String name;
    final LifeCycle lifeCycle;

    public Plant(String name, LifeCycle lifeCycle) {
        this.name = name;
        this.lifeCycle = lifeCycle;
    }

    @Override
    public String toString() {
        return "Plant{" +
                "name='" + name + '\'' +
                ", lifeCycle=" + lifeCycle +
                '}';
    }
}
