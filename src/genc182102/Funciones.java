package genc182102;

import java.util.Scanner;

public class Funciones {
    //Modificadores de acceso
    //Modificador de acceso privado encapsular para la clase actual
    private static String nombre;
    //Modificador de acceso public permite el acceso desde cualquier otro package o clase
    public static String primerApellido;
    //Modificador de acceso protected permite el acceso desde el mismo package o clases hijas
    protected static String segundoApellido;

    //Decarlo la función saludo
    public static void saludo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa tu nombre");
        nombre = sc.nextLine();
        System.out.println("Cuál es tu primer apellido?");
        primerApellido = sc.nextLine();
        System.out.println("Cuál es tu segundo apellido?");
        segundoApellido = sc.nextLine();
        System.out.println("Hola " + nombre + " " + primerApellido + " " + segundoApellido);
        sc.close();
    }

    //Funciones que no son estáticas requieren de instanciar la clase
    public int suma(int a, int b) {
        return a + b;
    }

    //Funciones que son estáticas le pertenecen a la clase, por tanto, no necesitan de una instancia para llamarlas
    public static int resta(int a, int b) {
        return a - b;
    }

    //Sobrecarga de métodos consiste en agregarle más argumentos o tipos de dato de retorno
    //Redeclarar un método volviendo a indicar sus argumentos o tipo de retorno, con distintos tipos de dato
    public double suma(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        //Llamado al método saludo
        saludo();
        saludo();

        //Llamado a una función de instancia
        //Creo primero la instancia
        Funciones miFuncion = new Funciones();
        int resultado = miFuncion.suma(10,10);
        System.out.println("Esta es la instancia que se creó " + miFuncion);
        System.out.println("Es es el resultado de la suma " + resultado);
        System.out.println("Este es el resultado de la suma con decimales " + miFuncion.suma(10.50, 5.50));
        //LLamado a una función estática
        System.out.println("El resultado de la función estática de resta es " + Funciones.resta(10,5));

        //Esto es un ejemplo de función estática porque le pertenece a la clase Math
        Math.random();

        Scanner miOtroScanner = new Scanner(System.in);
        //La función nextLine() viene a ser un ejemplo de función de instancia
        String nombre = miOtroScanner.nextLine();
        miOtroScanner.close();



    }


}
