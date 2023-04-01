package com.daniel.ejercicios.getset;

import com.daniel.ejercicios.bodymass.*;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author carri
 */
public class GetSetMain {

    public static void main(String arg[]) {
        Student dani = new Student();

        //dani.firstName = "Dani"; (public)
        dani.setFirstName("angel");
        dani.setLastName("Brito");
        dani.setAge(18);
        //System.out.println(dani.firstName); (public)
        System.out.println(dani.getFirstName());
        System.out.println(dani.getLastName());
        System.out.println(dani.getAge());

    }

}
