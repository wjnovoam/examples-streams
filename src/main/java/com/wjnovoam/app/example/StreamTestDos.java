package com.wjnovoam.app.example;

import com.wjnovoam.app.model.Estudiante;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author William Johan Novoa Melendrez
 * @date 26/07/2022
 */
public class StreamTestDos {
    public static void main(String[] args) {
        //Crear Stream desde valores -> Convertir un string a Streams
        Stream<String> stream1 = Stream.of("Curso de programacon");
        stream1.forEach(System.out::println);

        //Otro ejemplo -> Convertir varios string a Streams
        Stream<String> stream2 = Stream.of("Curso1", "Curso2", "Curso3", "Curso4", "Curso5");
        stream2.forEach(System.out::println);

        //Otro ejemplo -> Convertir array a Streams
        String[] arreglo = {"java", "c++", "ruby"};
        Stream<String> stream3 = Stream.of(arreglo);
        stream3.forEach(System.out::println);

        //Stream genericos con objetos
        Stream<Estudiante> estudianteStream = Stream.<Estudiante>builder()
                .add(new Estudiante("n01", 17, 1.70, 9.5))
                .add(new Estudiante("n01", 17, 1.70, 9.5))
                .build();
        estudianteStream.forEach(System.out::println);

        //Otro ejemplo
        IntStream unoAVeinte =IntStream.rangeClosed(1,20);
        unoAVeinte.forEach(System.out::println);
    }
}