package com.wjnovoam.app.example;

import java.util.stream.Stream;

/**
 * @author William Johan Novoa Melendrez
 * @date 26/07/2022
 */
public class StreamTestTres {
    public static void main(String[] args) {
        //Creacion de streams desde colecciones
        Stream<Long> primerosDiez = Stream.iterate(1L, n -> n + 1)
                .limit(10);
        primerosDiez.forEach(System.out::println);

        //Otro ejemplo
        Stream.iterate(1L, n -> n + 1)
                .filter(num -> num % 2 == 0)
                .limit(20)
                .forEach(System.out::println);

        //Descartar algunos elementos
        Stream.iterate(1L, n -> n + 1)
                .filter(num -> num % 2 == 0)
                .skip(100)
                .limit(5)
                .forEach(System.out::println);

        //Numeros aleatorios, generados automaticamente
        Stream.generate(Math::random)
                .limit(5)
                .forEach(System.out::println);
    }
}