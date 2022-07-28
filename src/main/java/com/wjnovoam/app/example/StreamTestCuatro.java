package com.wjnovoam.app.example;

import com.wjnovoam.app.model.Estudiante;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author William Johan Novoa Melendrez
 * @date 26/07/2022
 */
public class StreamTestCuatro {
    public static void main(String[] args) {
        //Convertir un array de interos en un streams
        IntStream numStream = Arrays.stream(new int[]{1,2,3,4,5,6});
        numStream.forEach(System.out::println);

        //Convertir un array de string en streams
        Stream<String> nombres = Arrays.stream(new String []{"Juan", "Pedro", "Lucas"});
        nombres.forEach(System.out::println);

        //Una lista o un set o un arreglo recorrerlo
        Set<String> lenjuagesSet = new HashSet<>();
        lenjuagesSet.add("Java");
        lenjuagesSet.add("C++");
        lenjuagesSet.add("C#");

        lenjuagesSet.stream()
                .forEach(System.out::println);

        //Convertir una lista en un streams
        List<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(new Estudiante("William", 23, 21, 19));
        estudiantes.add(new Estudiante("William", 23, 25, 18));
        estudiantes.add(new Estudiante("William", 23, 27, 16));
        estudiantes.add(new Estudiante("William", 23, 28, 15));
        estudiantes.add(new Estudiante("William", 23, 29, 13));
        estudiantes.add(new Estudiante("William", 23, 41, 10));

        estudiantes.stream()
                .forEach(System.out::println);

    }
}