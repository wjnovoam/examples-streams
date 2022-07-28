package com.wjnovoam.app.example;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * @author William Johan Novoa Melendrez
 * @date 26/07/2022
 */
public class StreamTestSeis {
    public static void main(String[] args) {
        Path path = Paths.get("Parrafo.txt");

        try(Stream<String> lineas = Files.lines(path)) {

            lineas.forEach(linea -> {
                System.out.println("Linea....");
                System.out.println(linea);
            });
        }catch (Exception e){

        }
    }
}