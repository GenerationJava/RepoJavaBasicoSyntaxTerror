package genc182402;

import java.util.Arrays;
import java.util.Scanner;

public class ArreglosFijos {
    //Los arrays en Java tienen una longitud fija por naturaleza, esto quiere decir, que no puedo aumentar su longitud

    public static void main(String[] args) {
        //Declaramos un arreglo de números
        int[] numerosDelUnoAlDiez = {1,2,3,4,5,6,7,8,9,10};

        //Si intentamos imprimir un arreglo fijo, me imprime una refencia a donde está en memoria
        System.out.println("Mis números del uno al diez son: " + numerosDelUnoAlDiez);

        //Para imprimir el contenido de un arreglo fijo, llamamos a la clase Arrays y su método .toString()
        System.out.println("Los números del uno al diez son: " + Arrays.toString(numerosDelUnoAlDiez));

        //Para acceder a un índice dentro del arreglo, puedo referirme a él por su posición
        System.out.println("El elemento en el índice 5 es " + numerosDelUnoAlDiez[5]);

        int[] numerosVacio = new int[5];
        System.out.println("Mi arreglo de números vacío, tiene los siguientes elementos " + Arrays.toString(numerosVacio));

        //Cambiar un valor en un índice, sólo tengo que llamar a la posición y asignarle valor con el operador =
        numerosVacio[0] = 1;
        numerosVacio[1] = 2;

        System.out.println("Ahora mi arreglo tiene estos elementos " + Arrays.toString(numerosVacio));

        //Al tratar de acceder a una  posición que no existe en el arreglo nos va a lanzar una excepción
        //System.out.println("El elemento en la posición 5 " + numerosVacio[5]);

        //Cómo puedo recorrer un arreglo?
        //Principalmente con bucles
        //Al iterar sobre un arreglo, usamos su propiedad length (longitud)
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numerosVacio.length; i++) {
            System.out.println("Ingresa un valor para el elemento en la posición " + i);
            numerosVacio[i] = sc.nextInt();
            sc.nextLine();
            System.out.println("El elemento en la posición " + i + " ahora es " + numerosVacio[i]);
        }

        /**Calcular la suma de los números en el arreglo numerosVacío
        int suma = 0;
        for (int i = 0; i < numerosVacio.length; i++) {
            System.out.println("En este momento, la suma va en " + suma);
            suma += numerosVacio[i];
        }
        System.out.println("La suma total es " + suma);
         */

        //Llamo nuevamente al arreglo, con los elementos ingresados en el bucle
        System.out.println("El arreglo tiene los siguientes valores " + Arrays.toString(numerosVacio));

        //ForEach, es un tipo de bucle para trabajar con estructuras de datos
        for (int elemento : numerosVacio ) {
            System.out.println("El elemento en este moemento tiene un valor de " + elemento);
        }

        //El forEach lleva en su sintaxis: for (variable con la que voy a referirme a cada elemento : nombre del arreglo) { }
        int suma = 0;
        for (int numero : numerosVacio) {
            suma += numero;
        }
        System.out.println("La suma total es " + suma);




    }
}
