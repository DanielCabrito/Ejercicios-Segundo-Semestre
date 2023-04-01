 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.daniel.ejercicios.getset_boolena;

/**
 *
 * @author carri
 */
public class   Bombero {
    //clase bombero


    private String nombre;
    private String apellido;
    private int edad;
    private boolean casado;
    private boolean especialista;

    public Bombero() {
    }

    
    //contructor y parametros asignados
    public Bombero (String nombreRecibido, String apellidoRecibido, int edadRecibida, boolean casadoRecibido, boolean especialistaRecibido)
    {
        nombre = nombreRecibido;
        apellido = apellidoRecibido;
        edad = edadRecibida;
        casado = casadoRecibido;
        especialista = especialistaRecibido;

    }//cierre del constructor


    //Metodos setter
    public void setNombre(String valorNombre)
    {
        nombre= valorNombre;   
    }

    public void setApellido (String valorApellido)
    {
        apellido= valorApellido;
    }

    public void setEdad(int valorEdad)
    {
        edad= valorEdad;
    }

    public void setCasado (boolean valorCasado)
    {
        casado= valorCasado;
    }

    public void setEspecialista (boolean valorEspecialista)
    {
        especialista= valorEspecialista;
    }

    //Metodos getter
    public String getNombre()
    {
        return nombre;
    }

    public String getApellido()
    {
        return apellido;
    }

    public int getEdad()
    {
        return edad;
    }

    public boolean getCasado()
    {
        return casado;
    }

    public boolean getEspecialista()
    {
        return especialista;
    }

    @Override
    public String toString() {
        return "Bombero{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", casado=" + casado + ", especialista=" + especialista + '}';
    }
    
    
}//cierre de la clase
   

