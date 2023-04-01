
package com.daniel.ejercicios.getset_boolena;
public class getset {
    public static void main(String[] args) {
    Bombero bombero1 = new Bombero();
        bombero1.setNombre("Luis");
        bombero1.setApellido("Brito");
        bombero1.setEdad(38);
        bombero1.setCasado(true);
        bombero1.setEspecialista(false);
        System.out.println(bombero1);
        
        Bombero bombero2 = new Bombero ("JOSE", "brito", 35, true, false);
        System.out.println(bombero2);
    }
    
} 