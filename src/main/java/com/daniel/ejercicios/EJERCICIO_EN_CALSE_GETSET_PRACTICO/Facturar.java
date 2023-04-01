/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.daniel.ejercicios.EJERCICIO_EN_CALSE_GETSET_PRACTICO;

/**
 *
 * @author carri
 */
public class Facturar {

    private float cantidad;
    private float precio;

    public Facturar() {
    }

    public Facturar(float cantidad, float precio) {
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float calcularVenta(){
        float subtotal = cantidad * precio;
        float iva = (float) (subtotal*IVA);
        float total = subtotal+iva;
        return total;
    }
    
    private static final double IVA = 0.16;

}
