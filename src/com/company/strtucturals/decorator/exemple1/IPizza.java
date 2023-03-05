package com.company.strtucturals.decorator.exemple1;

public interface IPizza {

    String getDescription();

    double getCost();

    default void xpto(){
        System.out.println("Funcionou!");
    }
}
