/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.daniel.ejercicios.EjercicioMio;

/**
 *
 * @author carri
 */
public class Menu {
    
    private int opcion;
    private float precio = 75;

    public Menu() {
    }

    public Menu(int opcion, float precio) {
        this.opcion = opcion;
        this.precio = precio;
    }

    Menu(int opcion) {
       
    }

    public int getOpcion() {
        return opcion;
    }

    public void setOpcion(int opcion) {
        this.opcion = opcion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    public String precioDelMenu1 (){
        return ("el total de tu cuenta es " + precio );
    }
    public String precioDelMenu2 (){
        return ("el total de tu cuenta es " + precio );
    }
    
}
