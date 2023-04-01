/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculadora.Ejercicio;

/**
 *
 * @author carri
 */
public class Calculadora {
    
private float num1Suma;
private float num2Suma;
private float num1Resta;
private float num2Resta;
private float num1Multiplicar;
private float num2Multiplicar;
private float num1Dividir;
private float num2Dividir;

    public Calculadora() {
    }

    public Calculadora(float num1Suma, float num2Suma, float num1Resta, float num2Resta, float num1Multiplicar, float num2Multiplicar, float num1Dividir, float num2Dividir) {
        this.num1Suma = num1Suma;
        this.num2Suma = num2Suma;
        this.num1Resta = num1Resta;
        this.num2Resta = num2Resta;
        this.num1Multiplicar = num1Multiplicar;
        this.num2Multiplicar = num2Multiplicar;
        this.num1Dividir = num1Dividir;
        this.num2Dividir = num2Dividir;
    }

    public float getNum1Suma() {
        return num1Suma;
    }

    public void setNum1Suma(float num1Suma) {
        this.num1Suma = num1Suma;
    }

    public float getNum2Suma() {
        return num2Suma;
    }

    public void setNum2Suma(float num2Suma) {
        this.num2Suma = num2Suma;
    }

    public float getNum1Resta() {
        return num1Resta;
    }

    public void setNum1Resta(float num1Resta) {
        this.num1Resta = num1Resta;
    }

    public float getNum2Resta() {
        return num2Resta;
    }

    public void setNum2Resta(float num2Resta) {
        this.num2Resta = num2Resta;
    }

    public float getNum1Multiplicar() {
        return num1Multiplicar;
    }

    public void setNum1Multiplicar(float num1Multiplicar) {
        this.num1Multiplicar = num1Multiplicar;
    }

    public float getNum2Multiplicar() {
        return num2Multiplicar;
    }

    public void setNum2Multiplicar(float num2Multiplicar) {
        this.num2Multiplicar = num2Multiplicar;
    }

    public float getNum1Dividir() {
        return num1Dividir;
    }

    public void setNum1Dividir(float num1Dividir) {
        this.num1Dividir = num1Dividir;
    }

    public float getNum2Dividir() {
        return num2Dividir;
    }

    public void setNum2Dividir(float num2Dividir) {
        this.num2Dividir = num2Dividir;
    }

    @Override
    public String toString() {
        return "sumaResta{" + "num1Suma=" + num1Suma + ", num2Suma=" + num2Suma + ", num1Resta=" + num1Resta + ", num2Resta=" + num2Resta + ", num1Multiplicar=" + num1Multiplicar + ", num2Multiplicar=" + num2Multiplicar + ", num1Dividir=" + num1Dividir + ", num2Dividir=" + num2Dividir + '}';
    }
    
    public String calculoSuma (){
     float calculoSum = (num1Suma+num2Suma);
     return "la suma de tus numeros es: " +calculoSum;
    }
    public String calculoResta (){
        float calculoResta = (num1Resta-num2Resta);
        return "la resta de tus numeros es: " + calculoResta;
 }
    public String calculoMultiplicar (){
        float calculoMultiplicar = (num1Multiplicar*num2Multiplicar);
        return "la multiplicacion de tus numeros es: " +calculoMultiplicar;
    }
    public String calculoDividir (){
        float calculoDividir = (num1Dividir/num2Dividir);
        return "la division de tus numeros es: " +calculoDividir;
    }

    public String calculoDividir(float num1Dividir, float num2Dividir) {
        float calculoDividir = (num1Dividir/num2Dividir);
        return "la division de tus numeros es: " +calculoDividir;
    }

     public String calculoMultiplicar(float num1Multiplicar, float num2Multiplicar) {
        float calculoMultiplicar = (num1Multiplicar*num2Multiplicar);
        return "la multiplicacion de tus numeros es: " + calculoMultiplicar;
        
    }

    public String calculoResta(float num1Resta, float num2Resta) {
    float calculoResta = (num1Resta-num2Resta);
    return "la resta de tus numeros es: " +calculoResta;
    }

    public String calculoSuma(float num1Suma, float num2Suma) {
    float calculoSuma = (num1Suma+num2Suma);
    return "la suma de tus numeros es: " +calculoSuma;

    }

    
    
    
    
}


