package genc182502;

import java.util.ArrayList;
import java.util.List;

public class ListasDinamicas {

    public static void main(String[] args) {
        //ArrayList es una implementación de la interfaz list, que permite añadir duplicados
        List<String> listaPeliculas = new ArrayList<>();

        //Imprimiendo lista de peliculas
        System.out.println(listaPeliculas);

        //Agregar elementos a la lista
        listaPeliculas.add("Shrek");
        listaPeliculas.add("Interestelar");
        listaPeliculas.add("El Alpinista");
        listaPeliculas.add("Pollitos en fuga");
        listaPeliculas.add("Oppenheimer");
        listaPeliculas.add("Volver al futuro");

        System.out.println(listaPeliculas);

        //Remover un elemento
        listaPeliculas.remove(0);//Podemos remover indicando el índice o nombre del objeto también
        System.out.println(listaPeliculas);
        //listaPeliculas.addFirst("Shrek");

        //Obtener un elemento
        System.out.println(listaPeliculas.get(1));

        //Obtener el tamaño de la lista (longitud), símil del .length()
        System.out.println("La longitud de la lista es de " + listaPeliculas.size() + " peliculas");

        //Verificar si un elemento está en la lista
        System.out.println(listaPeliculas.contains("Interestelar"));

        //Verificar si la lista está vacía
        System.out.println(listaPeliculas.isEmpty());

        //Recorrer la lista de películas
        //Bucle for
        /*
        for (int i = 0; i < listaPeliculas.size(); i++ ) {
            System.out.println(listaPeliculas.get(i));
        }*/

        //Bucle forEach
        for (String pelicula : listaPeliculas) {
            System.out.println(pelicula);
        }










    }
}
