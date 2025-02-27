package genc182702;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.concurrent.ConcurrentLinkedDeque;

public class Main {

    public static void main(String[] args) {
        //Creación de nuevo cliente
        Scanner sc = new Scanner(System.in);
        //Inicializando con constructor vacío
        Cliente clienteVacio = new Cliente();
        //Inicializando con constructor lleno
        Cliente clienteLleno = new Cliente("Martin", "1111111-k", LocalDate.of(2001,3,9), 1);

        System.out.println(clienteVacio);
        System.out.println(clienteLleno);

        //Probamos Getter y Setter
        System.out.println(clienteLleno.getNombreCompleto());//Imprime "Martin"
        clienteLleno.setNombreCompleto("Gabriel");//Cambia el nombre completo
        System.out.println(clienteLleno.getNombreCompleto());//Imprime Gabriel





    }
}
