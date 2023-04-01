/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menuObMain;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author carri
 */
public class menuOB {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
                int a = 0;
                int b = 0;
                int c = 0;
                int d = 0;
                int r;
                System.out.println("tu menu de hoy puede ser ");
                System.out.println("bocadillos de jamon $18 ");
                System.out.println("bocadillos de queso $20 ");
                System.out.println("papas a la francesa $15 ");
                System.out.println("soda $10 ");
                
                
               try { 
                   System.out.println(" elije lo que quieres de comer ");
                a = sc.nextInt();
                b = sc.nextInt();
                c = sc.nextInt();
                d = sc.nextInt();
               }catch (InputMismatchException ex){
                   
               }
                r = (a*18)+(b*20)+(c*15)+(d*10);
                System.out.println("tu total a pagar es: " + r);
                

    }
}
