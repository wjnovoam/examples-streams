package com.wjnovoam.app.operacionessorted;

import com.wjnovoam.app.model.Empleado;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author William Johan Novoa Melendrez
 * @date 26/07/2022
 */
public class OperacionesSorted {
    public static void main(String[] args) {
        System.out.println("Nombres ordenados");
        Arrays.asList("William", "Lina", "Emilce", "Abuela", "Viterminia", "Maria")
                .stream()
                .sorted()
                .forEach(System.out::println);

        System.out.println("\nNUmeros ordenados");
        Arrays.asList(3, 2, 1, 5, 4, 6)
                .stream()
                .sorted()
                .forEach(System.out::println);

        System.out.println("\nOEmpleados ordenados por nombre alfabeticamente");
        List<Empleado> empleados = Empleado.empleados();
        empleados.stream()
                .sorted()
                .forEach(System.out::println);

        System.out.println("\nOEmpleados ordenados por edad");
        empleados.stream()
                .sorted(Comparator.comparingInt(Empleado::getEdad))
                .forEach(System.out::println);
    }
}