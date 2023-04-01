/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.daniel.ejercicios.ejercicioPractico;


/**
 *
 * @author carri
 */
public class ejerciciosDePractica {
    public static void main(String[] args) {
        Job job = new Job();
        job.setDescription("Maestro de Ingles");
        job.setDailySalary((float) 400.50);
        job.setEmployeeFirstName("Angel");
        job.setEmployeeLastName("Brito");
        job.setEmployeeAge(38);
        
        
        Job programmer = new Job("Programmer", "Daniel", "Carrillo", 900f, 49);
        Job dentist = new Job ( "Dentist", 1500f);
        dentist.setEmployeeAge(41);
        System.out.println(job.calculateSalary());
        System.out.println(programmer.calculateSalary());
        System.out.println(dentist.calculateSalary());
        
        System.out.println(Job.description);
        /*
        System.out.println(job.getEmployeeFirstName());
        System.out.println(job.getEmployeeLastName());
        System.out.println(job.getEmployeeAge());
        System.out.println(job.getDailySalary());
        */

    }
}
