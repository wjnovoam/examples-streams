package com.wjnovoam.app.operacionesreduce;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/**
 * @author William Johan Novoa Melendrez
 * @date 26/07/2022
 */
public class OperacionesReduce {
    public static void main(String[] args) {
        int [] numeros = {1,2,3,4,5,6,7,8,9,1,4,6,9,4,5,6,4,4,5,4,4,5,6};
        List<Integer> numerosList = Arrays.asList(1,2,3,4,5,6,7,8,9,1,4,6,8,4,5,6,4,4,5,4,4,5,6);

        int suma = IntStream.of(numeros)
                .reduce(0, Integer::sum);
        System.out.println("La suma es: "+ suma);

        int sumaList = numerosList.stream()
                .reduce(0, Integer::sum);

        System.out.println("La suma es: "+ sumaList);

    }
}