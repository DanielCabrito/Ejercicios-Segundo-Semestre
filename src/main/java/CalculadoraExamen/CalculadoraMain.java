/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CalculadoraExamen;

import Calculadora.Ejercicio.Calculadora;
import java.util.Scanner;

/**
 *
 * @author carri
 */
public class CalculadoraMain {
    public static void main(String[] args) {
        float number1;
        float number2;
        
        Calculadora cal = new Calculadora ();
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce tus numeros para hacer las operaciones ");
        number1 = sc.nextFloat();
        number2 = sc.nextFloat();
        
       Calculadora calculo = new Calculadora ();
        System.out.println(calculo);
        System.out.println(calculo.calculoSuma(number2, number2));
        System.out.println(calculo.calculoResta(number2, number2));
        System.out.println(calculo.calculoMultiplicar(number2, number2));
        System.out.println(calculo.calculoDividir(number2, number2));
    }
}
