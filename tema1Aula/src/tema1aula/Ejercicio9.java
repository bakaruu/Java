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
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        
//        EJERCICIO 9A
//Se tienen tres variables A, B, C de tipo int (aunque podría ser cualquier tipo de datos).
//Escribir una aplicación que haga los siguientes intercambios usando sólo una variable
//auxiliar:
//B toma el valor de A.
//C toma el valor de B.
//A toma el valor de C.
        
        //DECLARACION DE VARIABLES
        int a, b, c, d;
        int aux, aux2;
        
        
        //ENTRADA DE DATOS
        System.out.println("Introduce variable A: ");
            a=teclado.nextInt();
        System.out.println("Introduce variable B: ");
            b=teclado.nextInt();
        System.out.println("Introduce variable C: ");
            c=teclado.nextInt();
//        System.out.println("Introduce variable D:");
//            d=teclado.nextInt();
        
            
        //PROCESO DE DATOS
        
        //solo con un auxiliar
//        aux= b;
//        b=a;
//        a=c;
//        c=aux;
        
        //con dos auxiliar
//        aux=b;
//        b=d;
//        aux2=c;
//        c=a;
//        a=aux;
//        d=aux2;
        //OTRA SOLUCION
          
//          b=c-a;
//          a=a+b;
//          c=b-a;
          
        
        
 
        
        //SALIDA DE DATOS
        System.out.println("Valor de a: "+ a);
        System.out.println("Valor de b: "+ b);
        System.out.println("Valor de c: "+ c);
        //System.out.println("Valor de d: "+ d);
        
           
    }
}
