package com.company.lambdaEStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class LambdaMain {

    // O que é uma funcão lambada de maneira resumida:
    //Considerando esta estrutura: () -> {},
    // Ela vai receber parâmetros de entrada e vai operar esses parâmetros e vai me dar uma saída.
    // São funções anônimas: eu não preciso declará-las com nomes e parâmetros para que eu possa chamá-la
    //depois, eu posso simplesmente criá-la e usá-la imediatamente no local que ela foi declarada.
    public static void main(String[] args) {

        /**
         * Uma expressão lambda é uma maneira simples de implementar uma interface que tenha apenas 1 método
         * abstrato;
         * Para o exemplo, imagine que vc tem uma lista de valores e você precisa gravar em uma outra
         * lista os respectivos valores x 2;
         * Neste caso, faz sentido escrever uma nova fução só para isso?
         * Como vc precisa apenas de um métodos rápido para resolver uma questão rápida dentro de outro
         * método vc pode optar por usar as funções lambdas
         * */

        Xpto xpto = new Xpto();
        List<Integer> values = new ArrayList<>();
        List<Integer> doub = new ArrayList<>();

        values.add(1);
        values.add(2);
        values.add(3);
        values.add(4);
        values.add(null);
        xpto.setValues(values);

        doub.add(1);
        doub.add(null);
        doub.add(3);
        doub.add(4);
        doub.add(5);
        xpto.setDoub(doub);


        removeNullElements(Arrays.asList(xpto.getValues(), xpto.getDoub()));
        xpto.getValues().forEach(System.out::println);
        xpto.getDoub().forEach(System.out::println);

      /*  values.forEach(e -> doub.add(e * 2));

        doub.forEach(System.out::println);*/
    }

    public static <T> void removeNullElements(List<List<T>> lists) {
        lists.forEach(list -> list.removeIf(Objects::isNull));
    }
}
