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

        /************** OPERADORES DE ASIGNACIÓN ******************/
        /*
         =
         +=
         -=
         *=
         /=
        * */

        //Le suma el valor y se lo asigna a la variable
        resultado += 1;
        System.out.println("El resultado ahora, equivale a " + resultado);

        /*****************   OPERADORES UNARIOS ******************/
        /*
         ++
         --
        * */

        //resultado++;
        System.out.println("El resultado ahora, equivale a " + resultado++);
        System.out.println("El resultado ahora, equivale a " + resultado);

        ++resultado;
        System.out.println("El resultado ahora, equivale a " + resultado);

        /***********   OPERADORES DE COMPARACIÖN **************/
        /*  RETORNAN UN TRUE o FALSE
         == igual que
         <  menor que
         >  mayor que
         <= menor o igual
         >= mayor o igual
         != es distinto de
        * */

        boolean esVerdadero = resultado == a;
        a = 10;
        b = 15;
        System.out.println(a + " ¿es igual a " + resultado + "? = " + esVerdadero);
        System.out.println(a + " ¿es menor que " + b + "? = " + (a < b));
        System.out.println(a + " ¿es mayor que " + b + "? = " + (a > b));
        System.out.println(a + " ¿es distinto de " + b + "? = " + (a != b));

        /************** OPERADORES LÓGICOS ***************/
        /* COMBINAR MÚLTIPLES EXPRESIONES
            && "doble ampersand y lógico"
            || "pipe o lógico"
            ! "not o negación"
        * */

        boolean expresionUno = (a < b) && (a == a);//¿a es menor que b? y ¿a es igual a a? v + v = v
        System.out.println("El resultado de la primera expresion es " + expresionUno);

        boolean expresionDos = (a < b) && (a > b);//¿a es menor que b? y ¿a es mayor que b? v + f =
        System.out.println("El resultado de la segunda expresión es " + expresionDos);

        boolean expresionTres = (a > b) || (a != b);//¿a es mayor que b? o ¿a es distinto de b? f + v
        System.out.println("El resultado de la tercera expresión es " + expresionTres);

        boolean expresionCuatro = (a == b) || (b > a);//¿a es igual a b? o ¿b es mayor que a?
        System.out.println("El resultado de la cuarta expresión es " + expresionCuatro);


    }
}
