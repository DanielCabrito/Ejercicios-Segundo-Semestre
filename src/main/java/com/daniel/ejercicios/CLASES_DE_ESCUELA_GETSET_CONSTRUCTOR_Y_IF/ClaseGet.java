/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.daniel.ejercicios.CLASES_DE_ESCUELA_GETSET_CONSTRUCTOR_Y_IF;

/**
 *
 * @author carri
 */
public class ClaseGet {
    private String nombre;
    private String materia;
    private float calificacion;

    public ClaseGet() {
    }

    public ClaseGet(String nombre, String materia, float calificacion) {
        this.nombre = nombre;
        this.materia = materia;
        this.calificacion = calificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public float getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(float calificacion) {
        this.calificacion = calificacion;
    }
    
    public String calcularCalificacion(){
        if (calificacion >= 70){
        return "aprobatoria";
        }else{ return "no aprobatoria";
            
        }
    }
    
}
