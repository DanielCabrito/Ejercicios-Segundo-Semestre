/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.daniel.ejercicios.CambioDeMoneda;

import java.util.Scanner;

/**
 *
 * @author carri
 */
public class DolarPesoMx {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Si quieres transformar dolares a pesos preciona 1, si quieres transformar pesos a dolares preciona 2");
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                {
                    System.out.println("cuantos dolares quieres tranforrmar a pesos");
                    //guardar cantidad
                    float cantidad = sc.nextFloat();
                    Currency currency = new Currency(cantidad);
                    System.out.println(currency.convertirAPesos());
                    break;
                }
            case 2:
                {
                    System.out.println("cuantos pesos quieres tranformar a dolares");
                    //guardar cantidad
                    float cantidad = sc.nextFloat();
                    Currency currency = new Currency(cantidad);
                    System.out.println(currency.convertirADolares());
                    break;
                }
            default:
                System.out.println("no es una opcion valida");
                break;
        }

    }
}
