/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioDosExamen;

import static java.lang.Integer.toString;
import java.util.Scanner;

/**
 *
 * @author carri
 */
public class Persona {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                
       
        PersonaApp persona = new PersonaApp("daniel",19);
        System.out.println(persona);
        System.out.println(persona.edadaDelSujeto() );
                 

    }
}
