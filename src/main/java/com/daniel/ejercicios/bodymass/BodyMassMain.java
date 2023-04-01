package com.daniel.ejercicios.bodymass;
 
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author carri
 */
public class BodyMassMain {
    
    public static void main (String arg[]){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("introduce tu nombre");
        String name = sc.next();
        
        System.out.println("introduce un peso");
        double weight = sc.nextDouble();
        
        System.out.println("introduce tu estatura en cm");
        double height =sc.nextDouble();
        
        BodyMassCalculator bodyMass1 = new BodyMassCalculator(weight, height);
        double bmi = bodyMass1.calculateBmi();
        String category = bodyMass1.getBmiCategory(bmi);
        
        System.out.println (name + ", tu indice de masa corporal es: " + bmi + ". Tu BMI es " + category);
    }
   
}
