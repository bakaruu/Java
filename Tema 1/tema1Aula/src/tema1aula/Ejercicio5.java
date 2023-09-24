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
public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
//        EJERCICIO 5A
//        Hacer en Java un programa donde el usuario tecleará dos números (a y b), y el programa mostrará el resultado
//        de la operación (a+b) x (a-b) y por otro lado el resultado de la operación a2 - b2 (a al cuadrado menos b al cuadrado). Deberian ser iguales.

        int a, b;
        int opA, opB;
        
        
        System.out.println("Introduca a: ");
        a= teclado.nextInt();
        
        System.out.println("Introduca b: ");
        b= teclado.nextInt();
        
        opA= (a+b) * (a-b);
        opB= (a*2) - (b*2);
        
        System.out.println("Resultado opB: "+ opA);
        System.out.println("Resultado opB: "+ opB);
        
        
        
    }
}
