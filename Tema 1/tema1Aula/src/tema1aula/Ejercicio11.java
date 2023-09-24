/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema1aula;

import java.util.Scanner;

/**
 *
 * @author Baka
 */
public class Ejercicio11 {

    public static void main(String[] args) {
//        EJERCICIO 11A
//Dado un número de 5 cifras que se lee por teclado, separa cada uno de sus
//dígitos usando solo operaciones con números enteros. Suponemos que el número 
//va a tener siempre 5 digitos exactamente.

        Scanner teclado = new Scanner(System.in);

        int numero, cifra1, cifra2, cifra3, cifra4, cifra5, resto;

        System.out.println("Dinme un numero de cinco cifras: ");
        numero = teclado.nextInt();

        cifra1 = numero / 10000;
        resto = numero % 10000;
        cifra2 = resto / 1000;
        resto = resto % 1000;
        cifra3 = resto / 100;
        resto = resto % 100;
        cifra4 = resto / 10;
        cifra5 = resto & 10;

        System.out.println(cifra1 + " " + cifra2 + " " + cifra3 + " " + cifra4 + " " + cifra5);

    }
}
