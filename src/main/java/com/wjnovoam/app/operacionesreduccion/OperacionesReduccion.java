package com.wjnovoam.app.operacionesreduccion;

import com.wjnovoam.app.model.Empleado;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

/**
 * @author William Johan Novoa Melendrez
 * @date 26/07/2022
 */
public class OperacionesReduccion {
    public static void main(String[] args) {
        int [] numeros = {1,2,3,4,5,6,7,8,9,1,4,6,8,4,5,6,4,4,5,4,4,5,6};
        List<Integer> numerosList = Arrays.asList(1,2,3,4,5,6,7,8,9,1,4,6,8,4,5,6,4,4,5,4,4,5,6);

        List<Empleado> empleados = Empleado.empleados();

        //Operaciones de reduccion con numeros

        //Suma de elementos array
        int suma = IntStream.of(numeros).sum();
        System.out.println("\nLa suma del array es: "+ suma);

        //Suma de elementos lista
        int sumaLista = numerosList.stream()
                .mapToInt(item -> item)
                .sum();
        System.out.println("\nLa suma de la lista es: "+ sumaLista);

        //Obtener el promedio de los elementos de un array
        double promedio = IntStream.of(numeros).average().getAsDouble();
        System.out.println("\nEl promedio es: "+ promedio);

        //Obtener el promedio de los elementos de una lista
        double promedioList = numerosList.stream()
                .mapToInt(item -> item)
                .average()
                .orElseThrow();
        System.out.println("\nEl promedio es: "+ promedioList);

        //Obtener maximo
        int maximo = IntStream.of(numeros).max().getAsInt();
        System.out.println("\nEl numero maximo del array es: "+ maximo);

        int maximoList = numerosList.stream()
                .mapToInt(item -> item)
                .max()
                .orElseThrow();
        System.out.println("\nEl numero maximo de la lista es: "+ maximoList);

        //Obtener el minimo
        int minimo = IntStream.of(numeros).min().getAsInt();
        System.out.println("\nEl numero minimo del array es: "+ minimo);

        int minimoList = numerosList.stream()
                .mapToInt(item -> item)
                .min()
                .orElseThrow();
        System.out.println("\nEl numero minimo de la lista es: "+ minimoList);

        //Contar cantidad de elementos
        long cantidad = IntStream.of(numeros).count();
        System.out.println("\nCantidad del array es: "+ cantidad);

        long cantidadList = numerosList.stream()
                .mapToInt(item -> item)
                .count();
        System.out.println("\nCantidad de la lista es: "+ cantidadList);

        //Operaciones con empleados
        System.out.println("\nOperaciones con empleados u streams");

        //Sumar los salarios de los empleados
        double sumaSalarios = empleados
                .stream()
                .mapToDouble(Empleado::getIngresos)
                .sum();
        System.out.println("Suma de salarios: "+sumaSalarios);

        //Obtner el empleado con el salario maximos
        Empleado empMax = empleados
                .stream()
                .max(Comparator.comparing(Empleado::getIngresos))
                .orElseThrow();
        System.out.println("\nEl empleado con el maximo salario es: "+ empMax);


    }
}