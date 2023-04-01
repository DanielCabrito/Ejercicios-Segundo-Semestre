/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioDosExamen.Examen;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author carri
 */
public class Persona {
    public static void main(String[] args) {
                        Scanner sc = new Scanner(System.in);
        String nombre;
        int edad = 0;
        int telefono = 0  ;
        System.out.println("introduce tu nombre");
        nombre = sc.next();
        try{
             System.out.println("introduce tu edad");
        edad = sc.nextInt();
        System.out.println("introduce tu numero de telefono");
        telefono = sc.nextInt();
         }catch(InputMismatchException ex){
            float numero  = 0;
         }
        DatosPersonales datos= new DatosPersonales(nombre,edad,telefono);
        System.out.println (datos);
        System.out.println(datos.datosPersonales()); 
        
    }
}
