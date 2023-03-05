package com.company.xptoEnum;

public enum Ensemble {

    SOLO(1),
    DUET(2),
    TRIO(3);

    private final int numberOfMusicians;

    Ensemble(int numberOfMusicians){
        this.numberOfMusicians = numberOfMusicians;
    }

    public int getNumberOfMusicians(){
        return this.numberOfMusicians;
    }
}
