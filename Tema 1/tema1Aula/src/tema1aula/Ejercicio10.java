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
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        
//        EJERCICIO 10A
//Dada una cantidad de tiempo de segundos, expresar ese mismo tiempo en forma de
//horas, minutos y segundos. Por ejemplo, 8676 segundos son 2 horas, 24 minutos y 36
//segundos.
        
        int dato, segundos, horas, minutos;
        
        System.out.println("Introduce una cantidad de tiempo en segundos: ");
        dato=teclado.nextInt();
        
        //PROCESO DE DATOS
        
        horas = dato / 3600;
        //minutos= (dato - horas * 3600) / 60;
        minutos=(dato %3600)/60;//usando el resto, (modulo %)
        //segundos= dato -(horas * 3600 + minutos * 60);
        segundos=dato%60;//usando el resto, (modulo %)
        
        //SALIDA DE DATOS
        System.out.println("El cambio es "+horas+ " horas " +minutos+ " minutos "
        +segundos+ " segundos.");
    }
}
