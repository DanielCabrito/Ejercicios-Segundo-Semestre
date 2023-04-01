/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CamionCarro;

import java.util.Scanner;

/**
 *
 * @author carri
 */
public class MenuMainCarro {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String matricula;
        String matricula2;
        float velocidad;
        float velocidad2 = 0 ;
        float KmAcelerar;
        float KmAcelerar2 ;
        float KmAcelerar3 ;
        int puertas;
        int puertas2 ;
        int opcion;
        int num ;

        do {
            System.out.println("si quieres simulador de un coche preciona 1 si quieres de camion preciona 2 si quires salir preciona 3");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1 -> {
                    System.out.println("intiduce la matricula de tu automivil");
                    matricula = sc.next();
                    MatriculaVelocidad mave = new MatriculaVelocidad();
                    mave.setMatricula(matricula);
                    mave.setVelocidad(0);
                    System.out.println(mave);
                    System.out.println("cuanta velocidad quieres aumentar");
                    KmAcelerar = sc.nextFloat();
                    System.out.println("numero de puertas del automivil");
                    puertas = sc.nextInt();
                    NumPuertas dev = new NumPuertas(matricula, 0, KmAcelerar, puertas);
                    dev.MostraDatos();
                }
                case 2 -> {
                    System.out.println("intiduce la matricula del camion");
                    matricula2 = sc.next();
                    RemolqueCamion mare = new RemolqueCamion();
                    mare.setRemolque(0);
                    mare.setMatricula2(matricula2);
                    mare.setVelocidadCamion(velocidad2);
                    System.out.println(mare);
                    float kmAcelerarTotal = 0;
                    System.out.println("cuanta velocidad quieres aumentar");
                    KmAcelerar2 = sc.nextFloat();
                    System.out.println("numero de puertas del automivil");
                    puertas2 = sc.nextInt();
                    System.out.println("quieres ponerle remolque al camion \nPreciona 1 para agregra y 2 para dejarlo sin");
                    num = sc.nextInt();
                    System.out.println("cuanta velocidad quieres aumentar ");
                    KmAcelerar3 = sc.nextFloat();
                    ConRemolque conre = new ConRemolque(KmAcelerar2, puertas2, num, KmAcelerar3, kmAcelerarTotal);
                    System.out.println(conre.remolquito());
                    System.out.println(conre.newVelocidad());
                    System.out.println(conre.ConRemolque());
                    System.out.println(conre);

                }

            }
        } while (opcion != 3);
    }
}
