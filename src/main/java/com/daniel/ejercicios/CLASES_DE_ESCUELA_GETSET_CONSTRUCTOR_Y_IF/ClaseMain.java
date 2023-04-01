/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.daniel.ejercicios.CLASES_DE_ESCUELA_GETSET_CONSTRUCTOR_Y_IF;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author carri
 */
public class ClaseMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("introduce tu nombre");
        String nombre = sc.next();

        System.out.println("introduce tu materia");
        String materia = sc.next();

        float calificacion;
        try {
            System.out.println("Introduce tu calificacion");
            calificacion = sc.nextFloat();
        } catch (InputMismatchException error) {
            calificacion = 6;
        }

        ClaseGet boleta = new ClaseGet(nombre, materia, calificacion);
        System.out.println(nombre + " tu calificacion de la materia " + materia + " es " + boleta.calcularCalificacion());
    }
} 
