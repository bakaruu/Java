/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3aula1;

/**
 *
 * @author Baka
 */
public class Tema3Aula1Matrices {

    public static void main(String[] args) {
//          EJERCICIO 1A
//          Desarrollar un programa que dada una matriz muestre la suma de todos sus elementos.

    int [][] ejer1 = {{2,3},{3,4}};
    int suma=0;
    
        for (int i = 0; i < ejer1.length; i++) {
            for (int j = 0; j < ejer1.length; j++) {
                suma+=ejer1[i][j];
                
            }
            
        }
        System.out.println("Resultado: "+suma);
    }
}
