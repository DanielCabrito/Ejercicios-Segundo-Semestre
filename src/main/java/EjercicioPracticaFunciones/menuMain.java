/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioPracticaFunciones;

import java.util.Scanner;

/**
 *
 * @author carri
 */
public class menuMain {
    public static void main(String[] args) {
        String menu1;
        String menu2;
        String menu3;
        desayunoMenu menu = new desayunoMenu();
        menu.setDesayuno1("Carne con arroz");
        menu.setDesayuno2("hot cakes");
        menu.setDesayuno3("huevo con tocino");
        comidaMenu menuComida = new comidaMenu ();
        menuComida.setMenu1Comida("carne con frijoles");
        menuComida.setMenu2Comida("chuleta a la crema");
        menuComida.setMenu3Comida("frijoles con arroz");
        cenaMenu menuCena = new cenaMenu();
        menuCena.setMenu1Cena("huevo y frijoles");
        menuCena.setMenu2Cena("picadas con salsa");
        menuCena.setMenu3Cena("hot dogs");
        
        int opcion;
                Scanner sc = new Scanner(System.in);
                System.out.println("Hola los menus de hoy son los siguientes");
               do{
                  System.out.println("Desayuno opcion 1");
                System.out.println("Comida opcion 2");
                System.out.println("Cena opcion 3");
                   System.out.println("si quieres salir preciona 4");
                opcion = sc.nextInt();
                
                switch (opcion){
                    case 1 -> {
                        System.out.println("tus platillos para el desayuno pueden ser: ");
                        System.out.println(menu);
            }
                    case 2 -> {
                        System.out.println("tus platillos para la comida pueden ser: ");
                        System.out.println(menuComida);
                    }
                    case 3 -> {
                        System.out.println("tus platillos para la cena pueden ser :");
                        System.out.println(menuCena);
                    }
                    case 4-> {
                        System.out.println("gracias, vuelva pronto");
                    }
                }  
               }while (opcion != 4);
               
                

                
    }
}
