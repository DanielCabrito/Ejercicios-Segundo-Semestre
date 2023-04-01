/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioPracticaFunciones;

/**
 *
 * @author carri
 */
public class comidaMenu {
    private String menu1Comida;
    private String menu2Comida;
    private String menu3Comida;

    public comidaMenu() {
    }

    public comidaMenu(String menu1Comida, String menu2Comida, String menu3Comida) {
        this.menu1Comida = menu1Comida;
        this.menu2Comida = menu2Comida;
        this.menu3Comida = menu3Comida;
    }

    public String getMenu1Comida() {
        return menu1Comida;
    }

    public void setMenu1Comida(String menu1Comida) {
        this.menu1Comida = menu1Comida;
    }

    public String getMenu2Comida() {
        return menu2Comida;
    }

    public void setMenu2Comida(String menu2Comida) {
        this.menu2Comida = menu2Comida;
    }

    public String getMenu3Comida() {
        return menu3Comida;
    }

    public void setMenu3Comida(String menu3Comida) {
        this.menu3Comida = menu3Comida;
    }

    @Override
    public String toString() {
        return "comidaMenu{" + "menu 1 Comida=" + menu1Comida + ", menu 2 Comida=" + menu2Comida + ", menu 3 Comida=" + menu3Comida + '}';
    }
    
}
