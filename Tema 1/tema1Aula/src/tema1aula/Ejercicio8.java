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
public class Ejercicio8 {

    public static void main(String[] args) {
//        EJERCICIO 8A
//Desarrolla una aplicación que pida al usuario dos números. Después debe intercambiar
//los valores que contiene que cada variable, es decir:
        Scanner teclado = new Scanner(System.in);

        //DECLARACION DE VARIABLES
        int a, b, c, d, e;
        int aux, aux2;

        //ENTRADA DE DATOS
        System.out.println("Introduce variable A: ");
        a = teclado.nextInt();
        System.out.println("Introduce variable B: ");
        b = teclado.nextInt();
        System.out.println("Introduce variable C: ");
        c = teclado.nextInt();
        System.out.println("Introduce variable D:");
        d = teclado.nextInt();
        System.out.println("Introduce variable E:");
        e = teclado.nextInt();

        //PROCESO DE DATOS
        //solo con un auxiliar
//        aux= b;
//        b=a;
//        a=c;
//        c=aux;
        //con dos auxiliar
        aux = b;
        b = a;
        aux2 = c;
        a = c;
        c = aux;
        d = e;

        //SALIDA DE DATOS
        System.out.println("Valor de a: " + a);
        System.out.println("Valor de b: " + b);
        System.out.println("Valor de c: " + c);
        System.out.println("Valor de d: " + d);
        System.out.println("Valor de e: " + e);

    }

}
