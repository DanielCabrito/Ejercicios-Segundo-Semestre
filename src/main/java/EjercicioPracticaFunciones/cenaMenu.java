/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioPracticaFunciones;

/**
 *
 * @author carri
 */
public class cenaMenu {
    private String menu1Cena;
    private String menu2Cena;
    private String menu3Cena;

    public cenaMenu() {
    }

    public cenaMenu(String menu1Cena, String menu2Cena, String menu3Cena) {
        this.menu1Cena = menu1Cena;
        this.menu2Cena = menu2Cena;
        this.menu3Cena = menu3Cena;
    }

    public String getMenu1Cena() {
        return menu1Cena;
    }

    public void setMenu1Cena(String menu1Cena) {
        this.menu1Cena = menu1Cena;
    }

    public String getMenu2Cena() {
        return menu2Cena;
    }

    public void setMenu2Cena(String menu2Cena) {
        this.menu2Cena = menu2Cena;
    }

    public String getMenu3Cena() {
        return menu3Cena;
    }

    public void setMenu3Cena(String menu3Cena) {
        this.menu3Cena = menu3Cena;
    }

    @Override
    public String toString() {
        return "menuCena{" + "menu 1 Cena=" + menu1Cena + ", menu 2 Cena=" + menu2Cena + ", menu 3 Cena=" + menu3Cena + '}';
    }
    
}
