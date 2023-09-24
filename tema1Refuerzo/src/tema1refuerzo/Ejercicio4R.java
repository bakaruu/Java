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
public class Ejercicio4R {

    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
//        EJERCICIO 4R
//Elaborar un programa que permita ingresar el número de partidos ganados, perdidos y 
//empatados, por algún equipo en el torneo de liga, se debe de mostrar su puntuación 
//total, teniendo en cuenta que por cada partido ganado obtendrá 3 puntos, empatado 1 punto y perdido 0 puntos.

        int win = 3, lose = 0, tie = 1;
        int p_win, p_lose, p_tie, p_total=0;

        System.out.println("Introduce cuantas victorias tiene: ");
        p_win= teclado.nextInt();
        //no tiene sentido preguntar partidos perdidos si no se hace total de partidos jugados
        System.out.println("Introduce cuantos perdidos tiene: ");
        p_lose= teclado.nextInt();
        System.out.println("Introduce cuantos empates tiene: ");
        p_tie= teclado.nextInt();
        
        p_total= p_win*win + p_tie*tie;
        
        System.out.println("Puntos totales por X equipo: "+ p_total+ " puntos");

    }
}
