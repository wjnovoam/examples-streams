package com.wjnovoam.app.operacionesfilter;

import com.wjnovoam.app.model.Empleado;

import java.util.List;
import java.util.function.Predicate;

/**
 * @author William Johan Novoa Melendrez
 * @date 26/07/2022
 */
public class OperacionesFilter {
    public static void main(String[] args) {
        List<Empleado> empleados = Empleado.empleados();

        System.out.println("Empleados hombres");
        empleados.stream()
                .filter(Empleado::esHombre)
                .forEach(empleado -> System.out.println(empleado.getNombre() + " - Genero: "+ empleado.getGenero()));

        System.out.println("\nEmpleados que son mujeres");
        empleados.stream()
                .filter(Empleado::esMujer)
                .forEach(empleado -> System.out.println(empleado.getNombre() + " - Genero: "+ empleado.getGenero()));

        System.out.println("\nEmpleados mayores de 25 años");
        empleados.stream()
                .filter(empleado -> empleado.getEdad() > 25)
                .forEach(empleado -> System.out.println(empleado.getNombre() + " - Edad: "+ empleado.getEdad()));

        System.out.println("\nPersonal masculino cuya letra comience con la letra 'B'");
        empleados.stream()
                .filter(Empleado::esHombre)
                .filter(empleado -> empleado.getNombre().startsWith("B"))
                .forEach(empleado -> System.out.println(empleado.getNombre() + " - Genero: "+ empleado.getGenero()));

        System.out.println("\nPersonal masculino que gana arriba de 500");
        empleados.stream()
                .filter(empleado -> empleado.esHombre() && empleado.getIngresos() > 500)
                .forEach(empleado -> System.out.println(empleado.getNombre() + " - Genero: "+ empleado.getGenero()+
                        " - Sueldo: "+ empleado.getIngresos()));

        System.out.println("\nPersonal femenino mayor de 25 años con ingresos por encima de los 300");
        Predicate<Empleado> empFemenino = Empleado::esMujer;
        Predicate<Empleado> empMayor25 = empleado -> empleado.getEdad() > 25;
        Predicate<Empleado> empMayor300 = empleado -> empleado.getIngresos() > 300;
        Predicate<Empleado> fem25300 =  empFemenino.and(empMayor25).and(empMayor300);

        empleados.stream()
                .filter(fem25300)
                .forEach(empleado -> System.out.println(empleado.getNombre() + " - Edad: "+ empleado.getEdad()+
                        " - Sueldo: "+ empleado.getIngresos()));

        System.out.println("\nCantidad total: "+ empleados.stream().filter(fem25300).count());

    }
}