package com.company.lambdaEStream;

public class ClasseAnonima {


    public static void main(String[] args) {

        //implementando interface com classe anônima
        Taxi taxi = new Taxi() {
            @Override
            public void reservar(String origem) {
                System.out.println("Reservando taxi para: " + origem);
            }
        };
        taxi.reservar("");

        //implementando interface com expressão lambada
        Taxi taxi2 = (origem) -> {
            System.out.println("Reservando taxi para " + origem);
        };
        taxi2.reservar("Brasil");
    }

}

@FunctionalInterface
interface Taxi{
    void reservar(String origem);
}
