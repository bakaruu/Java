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
public class Ejercicio3 {

    public static void main(String[] args) {
//        EJERCICIO 3A
//Desarrolla una aplicación que lea 4 datos enteros, calcule su producto, su suma y su media aritmética.

        int a= 4, b= 5, c=2, d= 12;
        
        int producto, suma, media_aritmetica;
        
        producto= 4*5*2*12;
        suma = 4+5+2+12;
        media_aritmetica = (4+5+2+12 )/ 4;
        
        System.out.println("suma: "+ suma);
        System.out.println("producto: "+ producto);
        System.out.println("media_aritmetica: "+ media_aritmetica);
        
    }

}
