package com.wjnovoam.app.operacionescollect;

import com.wjnovoam.app.model.Empleado;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;

/**
 * @author William Johan Novoa Melendrez
 * @date 28/07/2022
 */
public class OperacionesCollect {

    public static void main(String[] args) {

        //Supplier<ArrayList<String>> proveedor = () -> new ArrayList<String>();
        Supplier<ArrayList<String>> proveedor = ArrayList::new;

        //BiConsumer<ArrayList<String>, String>  acumulador = (lista, string) -> lista.add(string);
        BiConsumer<ArrayList<String>, String>  acumulador = ArrayList::add;

        //BiConsumer<ArrayList<String>, ArrayList<String>> combinador = (lista1, lista2) -> lista1.addAll(lista2);
        BiConsumer<ArrayList<String>, ArrayList<String>> combinador = ArrayList::addAll;

        List<String> listaNombres = Empleado.empleados()
                .stream()
                .map(Empleado::getNombre)
                .collect(proveedor, acumulador, combinador);

        System.out.println("\n"+listaNombres);

        List<String> listaNombresDos= Empleado.empleados()
                .stream()
                .map(Empleado::getNombre)
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);

        System.out.println("\n"+listaNombresDos);

        //ToList
        List<String> toList = Empleado.empleados()
                .stream()
                .map(Empleado::getNombre)
                .collect(Collectors.toList());

        System.out.println("\nCollectors.toList(): "+toList);

        //ToSet
        Set<String> toSet = Empleado.empleados()
                .stream()
                .map(Empleado::getNombre)
                .collect(Collectors.toSet());

        System.out.println("\nCollectors.toSet(): "+toSet);

        //toCollection
        SortedSet<String> toCollection = Empleado.empleados()
                .stream()
                .map(Empleado::getNombre)
                .collect(Collectors.toCollection(TreeSet::new));

        System.out.println("\nCollectors.toCollection: "+toCollection);

        //REduccion de un Streams a un Map
        Map<Long, String> idNombreMapa = Empleado.empleados()
                .stream()
                .collect(Collectors.toMap(Empleado::getId, Empleado::getNombre));

        System.out.println("\nMap: "+idNombreMapa);

        //El tercer argumento es un tipo BiOperator, se utiliza para cuando las claves son repetidas

        Map<Empleado.Genero, String> generoANombreMapa = Empleado.empleados()
                .stream()
                .collect(Collectors.toMap(Empleado::getGenero, Empleado::getNombre, (nom1, nom2) -> String.join(", ",
                 nom1, nom2)));

        System.out.println("\n"+generoANombreMapa);

    }
}