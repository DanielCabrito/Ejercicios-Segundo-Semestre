/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioDosExamen.Examen.SumaRestaMultiplicacion;

import java.util.Scanner;

/**
 *
 * @author carri
 */
public class CalculadoraMain {

    private static String menu1Desayuno;
    private static String menu1Comida;
    private static String menu1Cena;

    public static void main(String[] args) {
        float number1;
        float number2;

        desayunoMenu menu = new desayunoMenu();
        menuCena menu1 = new menuCena();
        menuComida menu2 = new menuComida();
        Scanner sc = new Scanner(System.in);
        int option = 0;

        do{
            System.out.println("si quieres un desayuno 1, si quieres comida  2, si quieres cena 3  , si quires salir 4");
             option = sc.nextInt();
             switch (option) {
            case 1 -> {
                System.out.println(" tus platillos de desayuno pueden ser ");
                      
                System.out.println(menu.menuDesayuno(menu1Desayuno));
            }
            case 2 -> {
                System.out.println("tus platillos pueden ser ");
                System.out.println(menu2.menuComida(menu1Comida));
            }
            case 3 -> {
                System.out.println("tus platillos son ");
                System.out.println(menu1.menuCena(menu1Cena));

            
        }
        }
        } while (option !=4);
        }
}
        
       
        //sumaResta resultado= new sumaResta(num1Suma,num2Suma,num1Resta,num2Resta,num1Multiplicar,num2Multiplicar,num1Dividir,num2Dividir);
        //System.out.println (resultado);
        //System.out.println(resultado.calculoSuma());       
    

    

