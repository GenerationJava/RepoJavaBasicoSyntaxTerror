package genc182102;

/*
1. **Te corresponde llevar a cabo la creación de tales funciones y asegurarte de que realicen lo siguiente:
    - `printNameLength`: Debe imprimir la longitud de un String(nombre).
    - `printNameCharacters`: Debe imprimir cada carácter de un String(nombre).
    - `printFullName`:  Debe imprimir el nombre completo concatenando un nombre y un apellido.
    - `printReverseName`: Debe imprimir el nombre en orden inverso.
2. **Entrada de Usuario:** Verifica el funcionamiento de la clase `Scanner` para pedir al usuario que ingrese su nombre y apellido.
3. **Ejecución y Pruebas:** Ejecuta el programa y verifica que se imprima correctamente la longitud del nombre, los caracteres del nombre y el nombre completo.
4. **Pruebas Adicionales:** Modifica el programa para probar con al menos 5 combinaciones diferentes de nombres y apellidos.
* */

import java.util.Scanner;

public class FuncionesNombres {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese su nombre
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        // Pedir al usuario que ingrese su apellido
        System.out.print("Ingrese su apellido: ");
        String apellido = scanner.nextLine();

        /** Llamadas a las funciones
        printNameLength(nombre);
        printNameCharacters(nombre);
        printFullName(nombre, apellido);
        printReverseName(nombre);
         **/

        scanner.close();
    }
}
