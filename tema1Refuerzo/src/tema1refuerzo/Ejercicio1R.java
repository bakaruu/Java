/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema1refuerzo;

import java.util.Scanner;

/**
 *
 * @author Baka
 */
public class Ejercicio1R {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        // TODO code application logic here
//        EJERCICIO 1R
//Desarrolla una aplicación que permita convertir una cantidad de euros a dólares 
//y a libras (1 euro=1,15 dólares y 1 euro= 0,89 libras APROX).
        double numero, dol, lib;
        double dolares=1.15, libras=0.89;
        
        System.out.println("Introduce una cantidad de euros: ");
        
        numero=teclado.nextInt();
        
        dol= numero*dolares;
        lib= numero*libras;
        System.out.printf(numero+" euros en dolares son: %.2f\n", dol);
        System.out.printf(numero+" euros en libras son: %.2f\n", lib);
        
    }

}
