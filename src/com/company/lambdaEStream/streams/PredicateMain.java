package com.company.lambdaEStream.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Representa uma operação que testa um determinado objeto e
 * retorna um valor booleano indicando se o objeto atende a uma determinada condição.
 * */
public class PredicateMain {

    public static void main(String[] args) {


        List<String> words = new ArrayList<>();
        words.add("hello");
        words.add("world");
        words.add("java");
        words.add("javascript");

        //Criando um Predicate para verificar se uma string tem mais de 5 caracteres
        Predicate<String> longWord = word -> word.length() > 5;

        // Uso fora
        System.out.println(longWord.test("Olá"));

        //Filtrando as palavras com mais de 5 caracteres e imprimindo
        words.stream().filter(longWord).forEach(System.out::println);
    }
}
