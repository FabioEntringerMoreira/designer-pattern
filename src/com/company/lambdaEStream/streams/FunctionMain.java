package com.company.lambdaEStream.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * A interface funcional Function é uma interface presente no pacote java.util.function que possui apenas um
 * método abstrato chamado apply().
 * Esse método tem como objetivo aplicar uma função a um valor de entrada e retornar um valor de saída.
 * */
public class FunctionMain {

    public static void main(String[] args) {

        //Criando a Function
        Function<Integer, Double> converterFahrenheitParaCelsius =
                (temperaturaFahrenheit) -> (double) ((temperaturaFahrenheit - 32) * 5 / 9);

        // Exemplo de utilização dora da expressão lambda
        converterFahrenheitParaCelsius.apply(70);

        // Exemplo de utilização dentro de uma expressão lambda
        List<Integer> temperaturasFahrenheit = Arrays.asList(32, 45, 59, 77, 89);
        List<Double> temperaturasCelsius = temperaturasFahrenheit.stream()
                .map(converterFahrenheitParaCelsius)
                .collect(Collectors.toList());
        System.out.println(temperaturasCelsius);

        // --- Quais métodos do java nativo utilizam o Function
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
        Function<Integer, Integer> dobrar = num -> num*2;
        // O método map do java é um exemplo de método que utiliza um Function
        List<Integer> numerosDobrados = numeros.stream().map(dobrar).collect(Collectors.toList());


    }
}
