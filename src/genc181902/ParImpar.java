package genc181902;

import java.util.Scanner;

public class ParImpar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un número");
        int a = sc.nextInt();

        String mensaje = (a == 0) ? "El 0 ya es par" : (a%2==0) ? "Ese numero es par" : "Ese numero es impar";
        System.out.println(mensaje);

    }
}
