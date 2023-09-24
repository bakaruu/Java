/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema1refuerzo;

/**
 *
 * @author Baka
 */
public class Ejercicio2R {

    public static void main(String[] args) {
//        EJERCICIO 2R
//Escribe un programa que calcule el salario semanal de un empleado en base a las horas trabajadas al día, a razón de 12 euros la hora.

        int horas_al_dia = 8, precio_hora = 12;
        int solu;

        solu = horas_al_dia * precio_hora * 5;

        System.out.println("Dinero ganado en una semana: "+ solu);

    }
}
