/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioUnoExamen;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author carri
 */
public class AlumnosMain {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        String nombre;
        float prom;
        float cal1 = 0;
             float cal2=0;
             float cal3=0;
             float cal4=0;
             float cal5=0;
        System.out.println("Introduce tu nombre");
         nombre=entrada.next();
         try{
             System.out.println("Intoduce 5 calificaciones");
              cal1=entrada.nextFloat();
              cal2=entrada.nextFloat();
              cal3=entrada.nextFloat();
              cal4=entrada.nextFloat();
             cal5=entrada.nextFloat();
         }catch(InputMismatchException ex){
            float calificacion = 0;
         }
          AlumnoContructor alumno= new AlumnoContructor(cal1,cal2,cal3,cal4,cal5);
        System.out.println (alumno);
        System.out.println(alumno.calcularPromedio());        
       
             
             
       
             
         
    }
}
