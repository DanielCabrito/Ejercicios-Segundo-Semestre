/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CamionCarro;

/**
 *
 * @author carri
 */
public class MatriculaVelocidad extends MenuMainCarro {

    private String matricula;
    private float velocidad;

    public MatriculaVelocidad() {
    }

    public MatriculaVelocidad(String matricula, float velocidad) {
        this.matricula = matricula;
        this.velocidad = velocidad;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public float getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(float velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return "MatriculaVelocidad{" + "matricula=" + matricula + ", velocidad=" + velocidad + '}';
    }

}
