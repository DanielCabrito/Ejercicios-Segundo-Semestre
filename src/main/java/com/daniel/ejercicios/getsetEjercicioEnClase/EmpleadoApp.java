/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.daniel.ejercicios.getsetEjercicioEnClase;
import java.util.Scanner;

/**
 *
 * @author carri
 */



    public class EmpleadoApp {

        public static void main(String[] args) {

            Empleado empleado1 = new Empleado("Fernando", "Ureña", 23, 800);

            Empleado empleado2 = new Empleado("", "Lopez", 50, 1800);

            //Mostramos el valor actual del salario del empleado1
            System.out.println("El salario del empleado1 es " + empleado1.getSalario());

            //Modificamos la edad del empleado1
            empleado1.setEdad(43);

            empleado1.plus(100);

            //Mostramos el salario de nuevo, ahora tendra 100 mas
            System.out.println("El salario actual del empleado1 es " + empleado1.getSalario());

            //Modificamos el nombre del empleado2
            empleado2.setNombre("Antonio");

            empleado2.plus(100);

            //Mostramos el salario de nuevo, ahora tendra 100 mas
            System.out.println("El salario del empleado2 es " + empleado2.getSalario());

        }

    }

