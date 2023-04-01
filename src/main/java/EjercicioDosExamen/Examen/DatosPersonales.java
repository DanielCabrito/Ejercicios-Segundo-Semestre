/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioDosExamen.Examen;

/**
 *
 * @author carri
 */
public class DatosPersonales {
    private String nombre;
    private int edad;
    private int telefono = 2283135 ;

    public DatosPersonales() {
    }

    public DatosPersonales(String nombre, int edad, int telefono) {
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTelefono() {
        return (int) telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "DatosPersonales{" + "nombre=" + nombre + ", edad=" + edad + ", telefono=" + telefono + '}';
    }
    public String datosPersonales (){
        return (" tu nombre es " + nombre +" tu  edad es " + edad + " y tu numero de telefono es " + telefono  ) ;
        
    }
       
    
}
