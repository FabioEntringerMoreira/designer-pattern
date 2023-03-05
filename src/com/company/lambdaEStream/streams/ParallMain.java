package com.company.lambdaEStream.streams;

import java.math.BigInteger;
import java.util.stream.Stream;

public class ParallMain {

    private static final BigInteger TWO = new BigInteger(String.valueOf(2L));

    public static void main(String[] args) {
        primes().parallel().map(p -> TWO.pow(p.intValueExact()).subtract(BigInteger.ONE))
                .filter(mersenne -> mersenne.isProbablePrime(50))
                .limit(20)
                .forEach(System.out::println);
    }

    static Stream<BigInteger> primes(){
        return Stream.iterate(TWO, BigInteger::nextProbablePrime);
    }
}

/**
 * Por hoje, vou apenas resumir com um exemplo, mas amnhã vou explicar o que está exatamente acontecendo com esse código que vou escrever aqui*/


