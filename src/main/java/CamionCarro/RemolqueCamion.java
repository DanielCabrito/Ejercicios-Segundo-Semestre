/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CamionCarro;

/**
 *
 * @author carri
 */
public class RemolqueCamion extends MenuMainCarro {
    private int remolque;
    private String matricula2;
    private float velocidadCamion;

    public RemolqueCamion() {
    }

    public RemolqueCamion(int remolque, String matricula2, float velocidadCamion) {
        this.remolque = remolque;
        this.matricula2 = matricula2;
        this.velocidadCamion = velocidadCamion;
    }

    public int getRemolque() {
        return remolque;
    }

    public void setRemolque(int remolque) {
        this.remolque = remolque;
    }

    public String getMatricula2() {
        return matricula2;
    }

    public void setMatricula2(String matricula2) {
        this.matricula2 = matricula2;
    }

    public float getVelocidadCamion() {
        return velocidadCamion;
    }

    public void setVelocidadCamion(float velocidadCamion) {
        this.velocidadCamion = velocidadCamion;
    }

    @Override
    public String toString() {
        return "RemolqueCamion{" + "remolque=" + remolque + ", matricula2=" + matricula2 + ", velocidadCamion=" + velocidadCamion + '}';
    }

   
   

    
    
}
