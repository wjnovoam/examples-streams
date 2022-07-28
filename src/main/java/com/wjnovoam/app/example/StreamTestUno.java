package com.wjnovoam.app.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author William Johan Novoa Melendrez
 * @date 25/07/2022
 */
public class StreamTestUno {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6);

        Stream<Integer> numStream = numeros.stream();

        int suma = numStream.filter(n -> n % 2 == 1)
                .map(numero -> numero * numero)
                .reduce(0, Integer::sum);

        System.out.println("La suma de numeros impares es: "+ suma);
    }
}