package com.company;

public class Main {

    public static void main(String[] args) {

        String day = "Sunday";
        // Usando Switch-case como instrução
        switch (day){
            case "Saturday", "Sunday" -> System.out.println("1");
            case "Monday" -> System.out.println("2");
            default -> System.out.println("3");
        }

        String day2 = "Sunday";
        String result;
        // Usando Switch-case como expressão
        result = switch (day2){
            case "Saturday", "Sunday" -> "1";
            case "Monday" -> "2";
            default -> "3";
        };

        String day3 = "Sunday";
        String result2;
        // Usando Switch-case como expressão, mas sem o arrow
        result2 = switch (day3){
            case "Saturday", "Sunday" : yield  "1";
            case "Monday" : yield  "2";
            default : yield  "3";
        };


    }

}
