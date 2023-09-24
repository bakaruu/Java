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
public class Ejercicio6R {

    public static void main(String[] args) {
//        EJERCICIO 6R
//Imagina que acabas de abrir una nueva cuenta de ahorros que te ofrece el 4% de 
//interés al año. Estos ahorros producen intereses, que no se cobran hasta finales
//de año, que se te añaden al balance final de tu cuenta de ahorros. Escribir un 
//programa que comience leyendo la cantidad de dinero depositada en la cuenta de 
//ahorros, introducida por el usuario. Después el programa debe calcular y mostrar 
//por pantalla la cantidad de ahorros tras el primer, segundo y tercer año.

        //inicializamos principal para no estar metiendo por Scanner todo el rato
        double principal = 12450.89;
        double interes, periodo=0.04;
        int cantidad_p=1;
        System.out.println("Tiene usted en la cuenta: " + principal + "$.");
        //      I es el interés total.
        //      P es el principal (la cantidad de dinero inicial).
        //      r es la tasa de interés por período.
        //      t es el número de períodos. formula para el interés

        interes= principal*periodo*cantidad_p;
        System.out.printf("Dinero en cuenta despues de "+ cantidad_p+" año: %.2f\n", (interes+principal));
        cantidad_p++;
        interes= principal*periodo*cantidad_p;
        System.out.printf("Dinero en cuenta despues de "+ cantidad_p+" año: %.2f\n", (interes+principal));
        cantidad_p++;
        interes= principal*periodo*cantidad_p;
        System.out.printf("Dinero en cuenta despues de "+ cantidad_p+" año: %.2f\n", (interes+principal));
        
    }
}
