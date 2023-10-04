package tema3aula1;

public class Tema3Aula1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // COMO SE DECLARA UN ARRAY, ALGUNOS EJEMPLOS
//        int [] prueba;
//        prueba = new int [2];
//        
//        int [] prueba2 = new int[12];
//        
//        prueba2[0]= 1;
//        prueba2[1]= 2;
//        prueba2[2]= 3;
//        prueba2[3]= 4;
//        //etc
//        
//        int [] prueba1 = {1,2,3,4,5,6};
//        
//        int [] prueba4 = new int[12];
//        
//        for (int i = 0; i < prueba4.length; i++) {
//            prueba4[i]=i;
//            
//        }
//        
//        //para imprimir un array.
//        //Si imprimimos en un sout directamente nos enseña la direccion de memoria
////        for (int i = 0; i < prueba4.length; i++) {
////            System.out.println(prueba4[i]);
////            
////            
////        }
        //EJERCICIO 1A
        //Desarrolla un programa que dado un array de enteros, muestre por pantalla 
        //los números que sean positivos.
        int[] enteros = {-1, 2, -3, -4, -5, 6};

        for (int i = 0; i < enteros.length; i++) {
            if (enteros[i] > 0) {
                System.out.print(enteros[i] + ", ");
            }

        }
        System.out.println();

        //EJERCICIO 2A
        //Desarrolla un programa que dado un array de enteros, muestre la cantidad de números que sean positivos.
        int[] enteros2a = {-1, 2, -3, 4, -5, 6};
        int cantidad = 0;
        for (int i = 0; i < enteros2a.length; i++) {
            if (enteros2a[i] > 0) {
                cantidad++;
            }

        }
        System.out.println("Cantidad de numeros positivos: " + cantidad);

        //EJERCICIO 3A
        //Desarrolla un programa que dado un array de enteros, muestre la media de los números que sean pares.
        int[] enteros3a = {1, 2, 3, 4, 5, 6, 7, 8};
        int cantidad3a = 0;
        for (int i = 0; i < enteros3a.length; i++) {
            if (enteros3a[i] % 2 == 0) {
                cantidad3a++;
            }

        }
        System.out.println("Cantidad de numeros pares: " + cantidad3a);

//          EJERCICIO 4A
//          Desarrolla un programa que dado un array de enteros, muestre la media de los números que estén en posiciones pares.
        int[] enteros4a = {1, 2, 3, 4, 5, 6, 7};
        int suma = 0;
        int cantidad4a = 0;

        for (int i = 0; i < enteros4a.length; i += 2) {
            suma += enteros4a[i];
            cantidad4a++;
        }

        int media = suma / cantidad4a;

        System.out.println("La media de los numeros en posiciones pares es: " + media);

        //  EJERCICIO 5A
        //  Desarrolla un programa que dado dos arrays nos muestre que posiciones de los 
        //  dos arrays coinciden en valor y en posición. Por ejemplo, si tenemos los dos siguientes arrays:
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {2, 3, 4, 1, 3};

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == array2[i]) {
                System.out.println("la posicion " + i + " son iguales");
            } else {
                System.out.println("No hay iguales.");
            }

        }

//          EJERCICIO 6A
//          Desarrolla un programa que dado dos arrays de enteros nos muestre el producto escalar 
//          de ambos. El producto escalar consiste en multiplicar los números en posiciones 
//          correlativas y sumar los resultados. Si no tienen el mismo tamaño mostrar un mensaje de error.
        int[] escalar1 = {2, 8};
        int[] escalar2 = {1, -7, 3};
        int p_escalar = 0;

//        if (escalar1.length == escalar2.length) {
//            for (int i = 0; i < escalar2.length; i++) {
//                p_escalar += escalar1[i] * escalar2[i];
//            }
//            System.out.println("Producto escalar: " + p_escalar);
//
//        } else {
//            System.out.println("No tienen mismo tamaño");
//        }
        //  EJERCICIO 7A
//          Repite los ejercicios 5 y 6 de manera que si no tienen el mismo tamaño se ejecute 
//          el programa parcialmente sobre la longitud más pequeña en lugar de mostrar un mensaje de error.
        if (escalar1.length < escalar2.length) {

            for (int i = 0; i < escalar1.length; i++) {
                p_escalar += escalar1[i] * escalar2[i];
            }

        }
        System.out.println("Producto escalar del menor: " + p_escalar);

//          EJERCICIO 8A
//          Desarrolla un programa que dado un array nos muestre el valor mayor de todos los elementos del array.
        int[] mayor8a = {1, 32, 3, 4, 5, 6, 12, 23, 2};
        int aux = mayor8a[0];

        for (int i = 0; i < mayor8a.length; i++) {
            if (mayor8a[i] > aux) {
                aux = mayor8a[i];
            }

        }
        System.out.println("El mayor es: " + aux);

//          EJERCICIO 9A
//          Desarrolla un programa que dado un array nos muestre la posición donde está 
//          el mayor de todos los elementos del array.
        int[] mayor9a = {1, 32, 3, 4, 5, 6, 12, 23, 2};
        int aux2 = mayor9a[0];
        int aux3 = 0;

        for (int i = 0; i < mayor9a.length; i++) {
            if (mayor9a[i] > aux2) {
                aux2 = mayor9a[i];
                aux3 = i;
            }

        }
        System.out.println("La posicion del mayor es: " + aux3);
    }

}
