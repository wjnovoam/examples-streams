package com.wjnovoam.app.operacionesmap;

import com.wjnovoam.app.model.Empleado;

import java.util.List;
import java.util.stream.IntStream;

/**
 * @author William Johan Novoa Melendrez
 * @date 26/07/2022
 */
public class OperacionesMap {
    public static void main(String[] args) {

        IntStream.rangeClosed(1, 5)
                .map(item -> item * item)
                .forEach(System.out::println);

        List<Empleado> empleados = Empleado.empleados();

        System.out.println("\nPromedio de ingresos de personal femenino mayor de 25 años");
        double suma = empleados.stream()
                .filter(Empleado::esMujer)
                .filter(empleado -> empleado.getEdad() > 25)
                .mapToDouble(Empleado::getIngresos)
                .sum();

        double promedio = suma / empleados.stream()
                .filter(Empleado::esMujer)
                .filter(empleado -> empleado.getEdad() > 25)
                .count();

        System.out.println("El promedio es: "+promedio);


    }
}