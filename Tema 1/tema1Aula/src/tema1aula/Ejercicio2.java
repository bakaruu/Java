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
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        // EJERCICIO 2A
        //Desarrolla una aplicación que calcule el área y el perímetro de una circunferencia.
        //EJERCICIO 2A Desarrolla una aplicación que calcule el área y el perímetro de una circunferencia
        
        //area= pi x r2
        //perimetro= 2 x pi x r
        
        int radio = 0;
        double area, perimetro;
        final double pi = 3.14;
        
        System.out.println("Introduce el area de una circunferencia: ");
        radio = teclado.nextInt();
        
        area= (pi* (Math.pow(radio, 2)));
        perimetro = (2* pi * radio);
        
        System.out.println("El area de una circunferencia con radio " +radio + " es: "+ area);
        System.out.println("El perimetro de una circunferencia con radio " +radio + " es: "+ perimetro);

    }
}
