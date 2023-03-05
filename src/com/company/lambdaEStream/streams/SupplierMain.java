package com.company.lambdaEStream.streams;

import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * A interface funcional Supplier, presente no pacote java.util.function,
 * representa uma operação que fornece um resultado.
 * Ela é usada para representar uma fonte de dados, como uma função sem parâmetros que retorna um valor.
 */
public class SupplierMain {

    public static void main(String[] args) {

        // Cria um objeto Supplier que gera números aleatórios
        Supplier<Double> randomNumberGenerator = Math::random;

        // Exemplo de uso
        double randomNumber = randomNumberGenerator.get();
        System.out.println(randomNumber);

        // -- Exemplo de uso dentro de um método nativo do java
        // Usa o objeto Supplier com o método Stream.generate()
        Stream<Double> randomNumberStream = Stream.generate(randomNumberGenerator);
    }
}
