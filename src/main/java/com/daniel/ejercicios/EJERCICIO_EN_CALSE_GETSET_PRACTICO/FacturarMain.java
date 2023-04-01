/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */ /*ESCRIBA LA CALSE FACTURAR, QUE TIENE COMO ATRIBUTOS DECIMALES LA CANTIDAD, PRECIO, UN METODO CONSTRUCTOR QUE NO RESIVA ARGUMENTO, UN METODO CONSTRUCTOR QUE INICIALISE LOS ATRIBUTPOS DE LA CLASE Y LOS CORRESPONDINTES METODOS GET Y SET DE CADA ATRIBUTO DE LA CLASE, ADEMAS CREAR LA FUNCION CALCULAR VENTA Y RETORNE EL VALOR DE LA VEMTA EN BASE AL SIGUIENTE CRITERIO. EN EL PROGRAMA PRINCIPAL LEEA LOS VALORES DEL PRECIO DEL ARTICULO Y L ACANTIDAD SOLICITADA POR EL USUARIO, LUEGO PASE ESTOS DATOS ATRAVES DE LA CLASE FACTURAR,A LA VARIABLE TOTAL A PAGAR ASIGNALE EL RESULTADO TOTAL A PAGAR*/
package com.daniel.ejercicios.EJERCICIO_EN_CALSE_GETSET_PRACTICO;

import java.util.Scanner;

/**
 *
 * @author carri
 */
public class FacturarMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("introduce la cantiadad de articulos que requiere");
        float cantidad = sc.nextFloat();
        System.out.println ("El precio de los articulos");
        float precio = sc.nextFloat();
        
        Facturar facturita = new Facturar(cantidad, precio);
        float total = facturita.calcularVenta();
        System.out.println("tu total es de :" + total );
  
    }
}

