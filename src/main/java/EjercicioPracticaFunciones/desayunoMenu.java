/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioPracticaFunciones;

/**
 *
 * @author carri
 */
public class desayunoMenu {
   
    private String desayuno1;
    private String desayuno2;
    private String desayuno3;
    private float precio;

    public desayunoMenu() {
    }

    public desayunoMenu(String desayuno1, String desayuno2, String desayuno3) {
        this.desayuno1 = desayuno1;
        this.desayuno2 = desayuno2;
        this.desayuno3 = desayuno3;
    }

    public String getDesayuno1() {
        return desayuno1;
    }

    public void setDesayuno1(String desayuno1) {
        this.desayuno1 = desayuno1;
    }

    public String getDesayuno2() {
        return desayuno2;
    }

    public void setDesayuno2(String desayuno2) {
        this.desayuno2 = desayuno2;
    }

    public String getDesayuno3() {
        return desayuno3;
    }

    public void setDesayuno3(String desayuno3) {
        this.desayuno3 = desayuno3;
    }

    @Override
    public String toString() {
        return "desayunoMenu{" + "desayuno 1=" + desayuno1 + ", desayuno 2=" + desayuno2 + ", desayuno 3=" + desayuno3 + '}';
    }


  
    
    
        
}
