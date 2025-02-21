package genc182002;

import genc182102.Funciones;

import java.util.Random;
import java.util.Scanner;

public class Bucles {

    public static void main(String[] args) {

        //Bucle While
        //Contador de despegue
        int contador = 10;
        System.out.println("Contador de despegue");

        //Mientras (esta condicion) se cumpla { Haz esto }
        while (contador > 0) {
            contador--;
            System.out.println(contador);
        }
        System.out.println("Despegue!");

        //Bucle Do-While
        //Este permite que aunque la condición sea falsa, se ejecute por lo menos una vez
        //Juego de adivinanzas, un número del 1 al 10
        Scanner sc = new Scanner(System.in);
        Integer numeroMisterioso = (int) (Math.random() * 10) + 1;
        Integer numeroElegido;
        Integer contadorDeIntentos = 0;

        //Lo que indiquemos en el bloque do va a suceder por lo menos una vez
        do {
            System.out.println("Ingresa un número del 1 al 10");
            numeroElegido = Integer.parseInt(sc.nextLine());
            contadorDeIntentos++;

            if (numeroElegido > numeroMisterioso) {
                System.out.println("Muy alto");
            } else if (numeroElegido < numeroMisterioso) {
                System.out.println("Muy bajo");
            } else {
                System.out.println("Adivinaste, felicidades!");
            }
            System.out.println("Llevas " + contadorDeIntentos + " intentos");

        } while (numeroMisterioso != numeroElegido);


        /*
        //Do-while para crear el menu de la calculadora
        Integer opcion;

        do {
            //Lo que está en este bloque se ejecuta antes de realizar la evaluación por lo menos una vez
            System.out.println("Indica la opción \n 1: Sumar \n 2: Restar \n 3:Multiplicar \n 4:Dividir");
            System.out.println("Ingresa una opción");
            opcion = sc.nextInt();
            if (opcion < 0 || opcion > 4) {
                System.out.println("Opción invalida, intenta de nuevo");
            }
        } while (opcion < 0 || opcion > 4);


        //Al bucle Do-while le indicamos primero lo que va a hacer en bloque do {haz esto} y luego, la condición a evaluar en el while ()
        //Lo que esté en e bloque do { se va a ejecutar por lo menos una vez } aunque la condición no se cumpla
        //Primero ejecuta el bloque do -> después hace la evaluación

        int numero;

        do {
            System.out.println("Ingresa un número positivo: ");
            //Le asignamos el valor del número ingresado por el usuario
            numero = sc.nextInt();
            //Condición de error
            if (numero <= 0) {
                System.out.println("Ingresaste un número negativo, vuelve a intentar");
            }
        }
        while (numero <= 0);
        */

        /***** BUCLE FOR *****/
        //"Para" (i igual a 0; mientras i sea menor o iguala  100; súmale +1 a i)
        /*for (int i = 0; i <= 100; i++) {
            System.out.println(i);
        }*/

        //Programa de despegue en bucle for
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        System.out.println("Despegue");

        //Programa para obtener tabla de multiplicar de un número
        System.out.println("Ingresa un número para conocer su tabla de multiplicar");
        Integer numero = sc.nextInt();


        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }


        sc.close();

        //Funciones.saludo();




    }
}
