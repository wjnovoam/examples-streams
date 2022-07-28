package com.wjnovoam.app.example;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

/**
 * @author William Johan Novoa Melendrez
 * @date 26/07/2022
 */
public class StreamTestCinco {
    public static void main(String[] args) {
        //Creacion de streams desde strings
        Scanner sc = new Scanner(System.in);
        String entrada = sc.nextLine();

        IntStream streamChars = entrada.chars();

        streamChars.filter(n -> !Character.isDigit((char)n)
                && !Character.isWhitespace((char) n))
                .forEach((item) -> System.out.println((char) item));

        String str = "HTML, CSS, JAVASCRIPT, JAVA";
        Pattern.compile(", ")
                .splitAsStream(str)
                .forEach(System.out::println);
    }
}