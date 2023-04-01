/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.daniel.ejercicios.fibonacci;

import java.util.Scanner;

/**
 *
 * @author carri
 */
public class fibonacciMain {
    public static void main(String[] args) {
        
        String fibonacci="";
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la cantidad de numeros fibonacci deseados");
        int number = sc.nextInt();
        if (number < 1) {
            System.out.println("Solicita al menos un numero de la serie Fibonacci");
        } else if (number == 1){
            fibonacci = "0";
        } else {
           int first = 0;
           int second = 1;
           int theNextNumber = 0;
           fibonacci="0,1,";
           
           while( number>2 ){
               theNextNumber=first+second;
               first=second;
               second = theNextNumber;
               fibonacci=fibonacci+theNextNumber+",";
               number--;
           }
        }
        
        System.out.println("fibonacci: "+fibonacci);
    }
}
