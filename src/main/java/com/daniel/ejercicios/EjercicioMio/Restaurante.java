/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.daniel.ejercicios.EjercicioMio;

import com.daniel.ejercicios.CambioDeMoneda.Currency;
import java.util.Scanner;


/**
 *
 * @author carri
 */
public class Restaurante {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("De menu hay opcion 1 y 2 cual prefieres la 1 es vegana y la 2 es carnibora");
        int opcion = sc.nextInt ();
        
        switch (opcion) {
            case 1 ->             {
        System.out.println("El menu 1 trae sopa de calabacitas, fruta y carne de soya en salsa de tomate ");
                    //guardar cantidad
                    Menu menu = new Menu (opcion);
                    System.out.println(menu.precioDelMenu1());
                }
            case 2 ->             {
                System.out.println("El menu 2 trae sopa azteca, arroz  y carne de cerdo en salsa de chipotle ");
                    //guardar cantidad
                 
                    Menu menu = new Menu(opcion);
                    System.out.println(menu.precioDelMenu2());
                }
            default -> System.out.println("opcion no valida, escogue un menu valido");
            }
        
        
    }
    
}
