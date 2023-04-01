/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.daniel.ejercicios.bodymass;

/**
 *
 * @author carri
 */
public class BodyMassCalculator extends Object {

    private final double CM_IN_A_METER = 100;
    private final double DELGADO_MODERADA = 16;
    private final double DELGADO_LEVE = 17;
    private final double NORMAL = 18.5;
    private final double EXCESO = 25;
    private final double OBESO_CLASS_1 = 30;
    private final double OBESO_CLASS_2 = 35;
    private final double OBESO_CLASS_3 = 40;
    private final double weightInKg;
    private final double heightInMeters;

    public BodyMassCalculator(double weight, double height) {
        System.out.println("-- Constructor");
        this.weightInKg = weight;
        this.heightInMeters = height / CM_IN_A_METER;
    }

    public double calculateBmi() {
        System.out.println("-- Calculating BMI");
        return weightInKg / (heightInMeters * heightInMeters);
    }
    
    public String getBmiCategory(double bmi) {
        System.out.println("-- Getting BMI Category");
        if (bmi < DELGADO_MODERADA) {
            return "delgado severo";
        } else if (bmi < DELGADO_LEVE) {
            return "delgado moderado";
        } else if (bmi < NORMAL) {
            return "delgado leve";
        } else if (bmi < EXCESO) {
            return "normal";
        } else if (bmi < this.OBESO_CLASS_1) {
            return "exceso";
        } else if (bmi < this.OBESO_CLASS_2) {
            return "obeso clase 1";
        } else if (bmi < this.OBESO_CLASS_3) {
            return "obeso clase 2";
        } else {
            return "obeso clase 3";
            
        }
    }

    @Override
    public void finalize() {
        System.out.println("-- Destructor");
    }

}
