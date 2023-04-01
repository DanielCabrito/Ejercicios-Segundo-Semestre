/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.daniel.ejercicios.ejercicioPractico;

/**
 *
 * @author carri
 */
class Job extends Object {

    String description;
    private String employeeFirstName;
    private String employeeLastName;
    private float dailySalary;
    private float totalSalary;
    private int employeeAge;

    public Job() {
    }

    public Job(String description, String employeeFirstName, String employeeLastName, float dailySalary, int employeeAge) {
        this.description = description;
        this.employeeFirstName = employeeFirstName;
        this.employeeLastName = employeeLastName;
        this.dailySalary = dailySalary;
        this.employeeAge = employeeAge;
    }

    public Job(String description, float dailySalary) {
        this.description = description;
        this.dailySalary = dailySalary;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEmployeeFirstName() {
        return employeeFirstName;
    }

    public void setEmployeeFirstName(String employeeFirstName) {
        this.employeeFirstName = employeeFirstName;
    }

    public String getEmployeeLastName() {
        return employeeLastName;
    }

    public void setEmployeeLastName(String employeeLastName) {
        this.employeeLastName = employeeLastName;
    }

    public float getDailySalary() {
        return dailySalary;
    }

    public void setDailySalary(float dailySalary) {
        this.dailySalary = dailySalary;
    }

    public int getEmployeeAge() {
        return employeeAge;
    }

    public void setEmployeeAge(int employeeAge) {
        this.employeeAge = employeeAge;
    }

    public float calculateSalary() {
        if (employeeAge >= AGE_FOR_BONUS) {
            return dailySalary + BONUS;
        } else {
            return dailySalary;
        }
    }
    
    @Override
    public String toString() {
        if (employeeAge >= AGE_FOR_BONUS) {
            totalSalary = dailySalary + BONUS;
        } else {
            totalSalary = dailySalary;   
        }

        return "Job{" + "description=" + description
                + ", employeeFirstName=" + employeeFirstName
                + ", employeeLastName=" + employeeLastName
                + ", dailySalary=" + dailySalary
                + ", dailySalary + bonus =" + totalSalary
                + ", employeeAge=" + employeeAge + '}';
    }

    
    private static final int AGE_FOR_BONUS = 45;
    private static final int BONUS = 130;

}
