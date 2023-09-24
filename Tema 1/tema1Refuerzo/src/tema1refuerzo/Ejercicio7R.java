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
public class Ejercicio7R {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

//        EJERCICIO 7R
//Escribir un programa que pregunte al usuario una cantidad a invertir (Co), 
//la tasa de interés anual(R) y el número de años (n), y muestre por pantalla 
//el capital final(Cn) obtenido en la inversión.
        double cant_ini, cant_fin, int_anual;
        int years;


        System.out.println("Introduce la cantidad a invertir: ");
        cant_ini = teclado.nextDouble();
        
        System.out.println("Introduce la tasa de interés anual (%): ");
        int_anual = teclado.nextInt();
        
        System.out.println("Introduce el número de años: ");
        years = teclado.nextInt();
        
        teclado.close();

        // Calcula el capital final con interés compuesto
        cant_fin = cant_ini * Math.pow(1 + int_anual / 100, years);

        System.out.printf("Capital final obtenido en la inversión: %.2f\n", cant_fin);

    }
}
