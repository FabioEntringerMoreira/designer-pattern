package com.company.lambdaEStream.streams;

public class Main2 {

    public static void main(String[] args) {

        Integer num = new Integer(10);

        System.out.println("Antes do método: " + num);
        num = changeValue(num);
        System.out.println("Depois do método: " + num);

    }

    public static Integer changeValue(Integer n) {
        n = new Integer(20);

        return n;
    }

    public static void alterarNumeros(int primitivo, Integer objeto){
        primitivo = 3;
        objeto = 3;
    }

    public static void mostrarNumeros(int primitivo, Integer objeto){
        System.out.println("Primitivo: " + primitivo + "\nObjeto: " + objeto );
    }

    static class Teste {
        int num;
    }
}
