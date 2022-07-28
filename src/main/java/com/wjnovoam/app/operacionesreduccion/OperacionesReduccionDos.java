package com.wjnovoam.app.operacionesreduccion;

import java.util.stream.IntStream;

/**
 * @author William Johan Novoa Melendrez
 * @date 26/07/2022
 */
public class OperacionesReduccionDos {
    public static void main(String[] args) {
        System.out.println(IntStream.range(1,20)
                .summaryStatistics());

        System.out.println("Suma: "+IntStream.range(1,20)
                .summaryStatistics()
                .getSum());

        System.out.println("Max: "+IntStream.range(1,20)
                .summaryStatistics()
                .getMax());

        System.out.println("Promedio: "+IntStream.range(1,20)
                .summaryStatistics()
                .getAverage());
    }
}