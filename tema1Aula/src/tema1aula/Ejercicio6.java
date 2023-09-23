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
public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
//        EJERCICIO 6A
//Desarrolla una aplicación que calcule la paga bruta, neta y el descuento 
//por impuestos de un trabajador, en función del sueldo base, complementos y la 
//tasa de impuestos del estado sobre su paga bruta IRFP (que se pedirán por teclado). 
//El programa pedirá al usuario los distintos datos y mostrará los resultados con un formato lo más parecido al siguiente:

//Sueldo base: 1237.56 €
//Complemento de destino: 146.95 €
//Complemento de cargo académico: 97 €
//Cálculo de la nómina.
//Sueldo bruto: 1481,51 €
//Porcentaje de IRPF: 19%
//Retención por IRPF: 281,48 €
//Sueldo neto: 1200,03 €
        //DECLARACION DE VARIABLES
        double sueldo_base, destino, academico, impuesto;
        double sueldo_bruto, sueldo_neto, descuento;

        //ENTRADA DE DATOS
        System.out.println("Introduzca los siguientes datos:");
        System.out.println("El sueldo base: ");
        sueldo_base = teclado.nextDouble();
        System.out.println("El complemento de destino: ");
        destino = teclado.nextDouble();
        System.out.println("El complemento academico: ");
        academico = teclado.nextDouble();
        System.out.println("Y el IRPF: ");
        impuesto = teclado.nextDouble();

        //PROCESO
        sueldo_bruto = sueldo_base + destino + academico;
        descuento = (impuesto / 100) * sueldo_bruto;
        sueldo_neto = sueldo_bruto - descuento;

        //SALIDA DE DATOS
        System.out.println("El sueldo bruto es: " + sueldo_bruto);
        System.out.println("El sueldo neto es: " + sueldo_neto);
        System.out.printf("El sueldo neto es:%.2f\n", sueldo_neto);
        System.out.println("Retención por IRPF: " + descuento);
    }
}
