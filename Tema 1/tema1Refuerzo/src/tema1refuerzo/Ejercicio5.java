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
public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
//        EJERCICIO 5R
//        La nota final de cada alumno se calcula según el siguiente criterio: 
//        la parte práctica vale el 10%; la parte de problemas vale el 50% y la parte teórica el 40%. 
//        Hacer un programa leerá el nombre de un alumno y sus tres notas y mostrará
//        Nota final de [NOMBRE] es [NOTA FINAL].

        String nombre = "";
        double prac, prob, teo, sol = 0;

        System.out.println("Introduce nombre Alumno");
        nombre = teclado.nextLine();

        System.out.println("Introduce nota practica: ");
        prac = teclado.nextDouble();
        System.out.println("Introduce nota problemas: ");
        prob = teclado.nextDouble();
        System.out.println("Introduce nota teoria: ");
        teo = teclado.nextDouble();

        //podemos crear constantes para los porcentajes ya que no varian.
        sol = prac * 0.10 + prob * 0.50 + teo * 0.40;

        System.out.println("Nota final de " + nombre + ": " + sol);

    }
}
