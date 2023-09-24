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
public class Ejercicio12 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double dato, resto, billete20, billete10, billete5, moneda2, moneda1;
        double centimo50, centimo20, centimo10, centimo5;

        System.out.println("Introduzca un importe ENTERO a devolver:");
        dato = teclado.nextDouble();

        //PROCESO DE DATOS
        billete20 = dato / 20;
        resto = dato % 20;

        billete10 = resto / 10;
        resto = resto % 10;

        billete5 = resto / 5;
        resto = resto % 5;

        moneda2 = resto / 2;
        resto = resto % 2;

        moneda1 = resto / 1;
        resto = resto % 1;

        centimo50 = resto / 0.5;
    }
}
