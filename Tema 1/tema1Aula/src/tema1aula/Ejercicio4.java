/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema1aula;

/**
 *
 * @author Baka
 */
public class Ejercicio4 {
    public static void main(String[] args) {
//        EJERCICIO 4A
//          Escriba un programa que reciba como entrada las longitudes de los dos catetos de un triángulo rectángulo, 
//        y que muestre como salida el largo de la hipotenusa a del triángulo, dado por el teorema de Pitágoras.

            //pitagoras= H2= C1+C2

        int cateto1=12, cateto2=5;
        
        double pitagoras;
        
        pitagoras = (cateto1*cateto1 + cateto2*cateto2);
        
        pitagoras = Math.sqrt(pitagoras);
        
        System.out.println("La hipotenusa es: "+ pitagoras);
        
    }
}
