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
public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

//        EJERCICIO 7A
//Un colegio desea saber qué porcentaje de niños y qué porcentaje de niñas hay en el
//curso actual. Diseñar un programa para este propósito.
        int ninos, ninas, suma;
        double p_ninos, p_ninas;

        System.out.println("Cantidad de niños: ");
        ninos = teclado.nextInt();
        System.out.println("Cantidad de niñas: ");
        ninas = teclado.nextInt();

        suma = ninas + ninos;

        //operacion Int por lo tanto sale 0     
        //p_ninos=ninos/suma*100;               
        //p_ninas=ninas/suma*100;               
        //HACER CASTING SE LLAMA ESTO.
        p_ninas = (double) ninas / suma * 100;
        p_ninos = (double) ninos / suma * 100;

        //operacion double, "todo" ok
        //p_ninos=ninos*100/suma;
        // p_ninas=ninas*100/suma;
        System.out.println("Porcentaje de niños: " + p_ninos);
        System.out.println("Porcentaje de niñas: " + p_ninas);
    }
}
