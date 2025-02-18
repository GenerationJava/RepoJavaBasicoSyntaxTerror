package genc181802;

public class Operadores {

    public static void main(String[] args) {
        /*Operadores aritméticos
            + Suma
            - Resta
            * Multiplicación
            / División
            % Resto
         */

        int a = 10;
        int b = 5;
        final int c = 15; //La palabra reservada final permite crear una constante

        int resultado = 10 + 5; //Suma
        System.out.println("El resultado de la suma es " + resultado);

        resultado = resultado - a;//Resta
        System.out.println("Ahora que le restamos " + a + " equivale a " + resultado);

        resultado = resultado * b;
        System.out.println("Ahora que lo multiplicamos por " + b + " equivale a " + resultado);

        resultado = c/b;
        System.out.println("Ahora que dividimos " + c + " entre " + b + " el resultado equivale a " + resultado);

        resultado = 10 % 2;
        System.out.println("El resto de dividir 10 entre 2 es " + resultado);

        /********************************/



    }
}
