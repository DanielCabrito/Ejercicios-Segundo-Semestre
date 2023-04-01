/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioDosExamen.Examen.Hiromi;

/**
 *
 * @author carri
 */
public class PersonaApp {
    private String nombre;
    private int edad;

    public PersonaApp() {
    }

    public PersonaApp(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
     public String MayoroMenor (){
       if (edad >= 18){
           return "eres mayor de edad";
       } else 
           return "no eres mayor de edad";
    }
}
