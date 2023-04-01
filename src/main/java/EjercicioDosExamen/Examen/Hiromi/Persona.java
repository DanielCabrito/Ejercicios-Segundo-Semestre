/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioDosExamen.Examen.Hiromi;

import java.util.Scanner;

/**
 *
 * @author carri
 */
    public class Persona {
    public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   
            String nombre;
            int edad;
            System.out.println("Ingresa tu nombre:");
            nombre=sc.next();
            System.out.println("Ingresa tu edad:");
            edad=sc.nextInt();
            
            PersonaApp persona= new PersonaApp();
            
            System.out.println("Tu eres: "+ persona.MayoroMenor());
            
        
        
      
    }  
    }

