/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CalculadoraExamen;

/**
 *
 * @author carri
 */
public class Calculadora {
    private float num1Suma;
    private float num2Suma;
    private float num1Resta;
    private float num2Resta;
    private float num1Multiplicacion;
    private float num2Multiplicacion;
    private float num1Dividir;
    private float num2Dividir;

    public Calculadora() {
    }

    public Calculadora(float num1Suma, float num2Suma, float num1Resta, float num2Resta, float num1Multiplicacion, float num2Multiplicacion, float num1Dividir, float num2Dividir) {
        this.num1Suma = num1Suma;
        this.num2Suma = num2Suma;
        this.num1Resta = num1Resta;
        this.num2Resta = num2Resta;
        this.num1Multiplicacion = num1Multiplicacion;
        this.num2Multiplicacion = num2Multiplicacion;
        this.num1Dividir = num1Dividir;
        this.num2Dividir = num2Dividir;
    }

    @Override
    public String toString() {
        return "Calculadora{" + "num1Suma=" + num1Suma + ", num2Suma=" + num2Suma + ", num1Resta=" + num1Resta + ", num2Resta=" + num2Resta + ", num1Multiplicacion=" + num1Multiplicacion + ", num2Multiplicacion=" + num2Multiplicacion + ", num1Dividir=" + num1Dividir + ", num2Dividir=" + num2Dividir + '}';
    }
    
    public float calculoSuma (){
        float calculoSuma = (num1Suma+num2Suma);
        return calculoSuma;
    }
    public float calculoResta (){
        float calculoResta = (num1Resta-num2Resta);
        return calculoResta;
    }
    public float calculoMultiplicacion (){
        float calculoMultiplicacion = (num1Multiplicacion*num2Multiplicacion);
        return calculoMultiplicacion;
    }
    public float calculoDivision (){
        float calculoDivision = (num1Dividir/num2Dividir);
        return calculoDivision;
    }
    
}
