package com.company.lambdaEStream.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

/**
 * A interface funcional Consumer em Java é utilizada para representar operações
 * que recebem um único argumento e não retornam nenhum valor (ou seja, são void).
 * */
public class ConsumerMain {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Criando um objeto Consumer que imprime os elementos da lista
        Consumer<Integer> printConsumer = System.out::println;

        // Chamando diretamente com o método abastrato
        printConsumer.accept(1);

        // Implementando dentro da expressão lambda
        // O forEach recebe uma interface funcional Consumer
        numbers.forEach(System.out::println);

        //--- Exemplo de método java nativo que utiliza o Consumer

        Optional<String> maybeName = Optional.ofNullable("John");
        maybeName.ifPresent(name -> System.out.println("Name: " + name));

        numbers.forEach(System.out::println);

    }
}
