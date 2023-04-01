/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.daniel.ejercicios.EJERCICIO_PRACTICO_GET_SET_TRABAJADORES;

import java.util.Scanner;

/**
 *
 * @author carri
 */
public class GETSET {
    
        public static void main(String[] args) {
       
            Scanner sc = new Scanner(System.in);
            System.out.println("introduce el nombre del libro");
            String title = sc.next();
            System.out.println("introduce autor");
            String author = sc.next();
            System.out.println("introduce numero de pagina");
            String pages = sc.next();
            System.out.println("introduce precio");
            String price = sc.next();
            
            Book bookcito = new Book();
            bookcito.setTitle(title);
            bookcito.setAuthor(author);
            
            try{
                bookcito.setPages(Integer.parseInt(pages) );
                bookcito.setPrices( Float.parseFloat(price) );
            }catch(NumberFormatException ex){
                System.out.println("EXCEPTION OCCURRED");
                ex.printStackTrace(); //Imprimir la exception
            }finally{
                System.out.println("EXITO");
            }
            

                
        Book book = new Book();
        book.setTitle("Maestro de Ingles");
        book.setPrices((float) 400.50);
        book.setAuthor("Angel");
        book.setPages(45);
            System.out.println(book.getTitle());
            System.out.println(book.getPrices());
            System.out.println(book.getAuthor());
            System.out.println(book.getPages());
        
        Book libro1 = new Book("Shazam", "brito", 900, 49f);
        Book libro2 = new Book("Back to the future", "Carrillo", 900, 49f);
        Book libro3 = new Book("El sinsajo", "Carrillo", 900, 49f);
        Book libro4 = new Book("Harry Potter", "Carrillo", 900, 49f);
        System.out.println(libro1);
        System.out.println(libro2);
        System.out.println(libro3);
        System.out.println(libro4);
    }

}
