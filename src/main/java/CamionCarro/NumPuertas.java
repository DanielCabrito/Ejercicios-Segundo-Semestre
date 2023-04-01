/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CamionCarro;

/**
 *
 * @author carri
 */
public class NumPuertas extends KmVelocidad {

    private int puertas;

    public NumPuertas() {
    }


    public NumPuertas( String matricula, float velocidad, float KmAcelerar,int numPuertas) {
        super(matricula, velocidad, KmAcelerar);
        this.puertas = numPuertas;
    }

    public int getNumPuertas() {
        return puertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.puertas = numPuertas;
    }

    public void MostraDatos() {
        System.out.println("Matricula: " + getMatricula() + "\nVelocidadAnteriorKm: " + getVelocidad()
                + "\nvelocidad a subir en Km: " + getKmAcelerar() + "\nNumero de puertas: " + puertas);
    }

}
