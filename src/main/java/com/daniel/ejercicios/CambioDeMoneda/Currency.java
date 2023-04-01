/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.daniel.ejercicios.CambioDeMoneda;

/**
 *
 * @author carri
 */
public class Currency {
    private float cantidad;
    public int numero;
    public Currency() {
    }

    public Currency(float cantidad) {
        this.cantidad = cantidad;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }
    public String convertirAPesos (){
             return ("tu coversion de dolares a pesos es " +cantidad*20 );
         }
    
    public String convertirADolares(){
             return ("tu conversion de pesos a dolares es " +cantidad/20);
    }

    public boolean precioDelMenu1() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public boolean precioDelMenu2() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
