/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.daniel.ejercicios.sumaEnSerie;

import java.util.Scanner;

/**
 *
 * @author carri
 */
public class NumeroEnSerieMain SD{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("INTRODUCE UN NUMERO N");
        int number = sc.nextInt();
        if (number < 0) {
            System.out.println("tu numero no es positivo");
        } else {
            String equation = "";
            double total = 0;
            while (number > 0){
                equation = equation + "1/" + number + " + ";
                total= total +(1/number);
                number--;
            }
            
            System.out.println(equation + " = " + total);
        }
    }

}
