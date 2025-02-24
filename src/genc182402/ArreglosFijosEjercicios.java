package genc182402;

/*
1. **Dados un arreglo de números y un arreglo de Strings, te corresponde llevar a cabo lo siguiente:
    a. En el arreglo de números:
        - Obtener el máximo y el mínimo
        - Contar elementos pares e impares dentro del arreglo
        - Ordenar el arreglo en orden ascendente
        - Buscar duplicados dentro del arreglo
    b. En el arreglo de String:
        - Contar las vocales de cada texto
        - Ordenar alfabéticamente
        - Encontrar el texto más largo
        - Concatenar todos los textos sin usar +
2. **Ejecución y Pruebas:** Ejecuta el programa y verifica lo solicitado mediante impresiones en consola.
*/

import java.util.Arrays;

public class ArreglosFijosEjercicios {




    public static void main(String[] args) {
        //Arreglo de enteros
        int[] numeros = {10, 5, 20, 15, 25, 10, 30, 15, 5, 40};

        //Arreglo de String
        String[] mascotas = {"Perro", "Cabra", "Caballo", "Pez", "Gato", "Loro", "Araña", "Capibara", "Hamster", "Vaca", "Cocodrilo"};

        //Cantidad de vocales
        for (String palabra : mascotas ) {
            int numeroDeVocalesDeMascotas = 0;
            for (int i = 0; i < palabra.length(); i++) {
                char vocal = palabra.charAt(i);
                if (("aeiou".indexOf(vocal) != -1)) {
                    numeroDeVocalesDeMascotas++;
                }
            }
            System.out.println("El número de vocales de la palabra " + palabra + " es " + numeroDeVocalesDeMascotas );
        }

        //Ordenar alfabéticamente
        Arrays.sort(mascotas);
        System.out.println(Arrays.toString(mascotas));

        //Encontrar el texto más largo
        String[] textoMasLargo = {""};
        for (String palabra : mascotas) {
            //for (int i = 0; i < palabra.length(); i++) {
                if (textoMasLargo[0].length() < palabra.length() ) {
                    textoMasLargo[0] = palabra;
                }
            //}
        }
        System.out.println("El texto más largo es " + textoMasLargo[0]);

        //Concatenar sin usar el +
        StringBuilder sb = new StringBuilder();
        //String resultado ;
        for (String palabra : mascotas) {
            sb.append(palabra);
            //resultado= sb.toString();
        }
        System.out.println("Concatenación de las palabras " + sb);

    }

}
