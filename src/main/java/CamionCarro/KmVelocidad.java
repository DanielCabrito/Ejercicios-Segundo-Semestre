/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CamionCarro;

/**
 *
 * @author carri
 */
public class KmVelocidad extends MatriculaVelocidad {

    private float KmAcelerar;

    public KmVelocidad() {
    }

    public KmVelocidad(String matricula, float velocidad, float KmAcelerar) {
        super(matricula, velocidad);
        this.KmAcelerar = KmAcelerar;

    }

    public float getKmAcelerar() {
        return KmAcelerar;
    }

    public void setKmAcelerar(float KmAcelerar) {
        this.KmAcelerar = KmAcelerar;
    }

    

}
