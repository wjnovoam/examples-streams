package com.wjnovoam.app.model;

import java.util.Arrays;
import java.util.List;

/**
 * @author William Johan Novoa Melendrez
 * @date 26/07/2022
 */
public class Empleado implements Comparable{

    private Long id;
    private String nombre;
    private double ingresos;
    private Genero genero;
    private int edad;

    public Empleado(Long id, String nombre, double ingresos, Genero genero, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.ingresos = ingresos;
        this.genero = genero;
        this.edad = edad;
    }

    @Override
    public int compareTo(Object object) {
        return this.getNombre().compareTo(((Empleado)object).getNombre());
    }

    public enum Genero {
        HOMBRE, MUJER
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getIngresos() {
        return ingresos;
    }

    public void setIngresos(double ingresos) {
        this.ingresos = ingresos;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean esHombre(){
        return this.genero == Genero.HOMBRE;
    }

    public boolean esMujer(){
        return this.genero == Genero.MUJER;
    }

    public static List<Empleado> empleados(){
        Empleado emp1 = new Empleado(1L, "William", 538.00, Genero.HOMBRE, 21);
        Empleado emp2 = new Empleado(2L, "Lina", 438.00,  Genero.MUJER, 33);
        Empleado emp3 = new Empleado(3L, "Yeison", 338.00,  Genero.HOMBRE, 13);
        Empleado emp4 = new Empleado(4L, "Brayan", 138.00,  Genero.HOMBRE, 28);
        Empleado emp5 = new Empleado(5L, "Emilce", 5138.00, Genero.MUJER, 20);
        Empleado emp6 = new Empleado(6L, "Belcy", 800.00, Genero.MUJER, 40);
        Empleado emp7 = new Empleado(7L, "Maria", 900.00, Genero.MUJER, 38);
        Empleado emp8 = new Empleado(8L, "Jaider", 700.00, Genero.HOMBRE, 46);
        Empleado emp9 = new Empleado(9L, "Jose", 654.00, Genero.HOMBRE, 31);
        Empleado emp10 = new Empleado(10L, "Viterminia", 58.00, Genero.MUJER, 18);
        Empleado emp11 = new Empleado(11L, "Roberto", 280.00, Genero.HOMBRE, 42);
        Empleado emp12 = new Empleado(12L, "Andres", 1180.00, Genero.HOMBRE, 12);
        Empleado emp13 = new Empleado(13L, "Jose", 1000.00, Genero.HOMBRE, 32);
        Empleado emp14 = new Empleado(14L, "Sneider", 900.00, Genero.HOMBRE, 21);
        Empleado emp15 = new Empleado(15L, "Jaider", 300.00, Genero.HOMBRE, 34);
        Empleado emp16 = new Empleado(16L, "Edwin", 700.00, Genero.HOMBRE, 42);
        Empleado emp17 = new Empleado(17L, "Wilson", 500.00, Genero.HOMBRE, 65);
        Empleado emp18 = new Empleado(18L, "Jhon", 890.00, Genero.HOMBRE, 42);
        Empleado emp19 = new Empleado(19L, "Jaime", 590.00, Genero.HOMBRE, 12);
        Empleado emp20 = new Empleado(20L, "Erika", 440.00, Genero.MUJER, 42);

        return Arrays.asList(emp1, emp2, emp3, emp4, emp5, emp6, emp7, emp8, emp9, emp10,
                emp11, emp12, emp13, emp14, emp15, emp16, emp17, emp18, emp19, emp20);
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", ingresos=" + ingresos +
                ", genero=" + genero +
                ", edad=" + edad +
                '}';
    }
}