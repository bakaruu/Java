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
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner teclado = new Scanner(System.in);
        // TODO code application logic here

//          EJERCICIO 1A
//          Desarrolla una aplicación que lea un valor entero, calcule su doble, lo multiplique por 25 
//            y sume los resultados obtenidos mostrando los resultados por pantalla.
        int numero;
        int resultado;

        System.out.println("Introduce un numero: ");
        
        numero= teclado.nextInt();
        resultado = ((numero*2)*25);
        System.out.println("El resultado es: "+ resultado);
    }
    
}
