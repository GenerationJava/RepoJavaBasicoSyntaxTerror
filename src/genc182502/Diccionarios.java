package genc182502;

import java.util.HashMap;
import java.util.Map;

public class Diccionarios {

    public static void main(String[] args) {
        //Los diccionarios almacenan los datos en pares llave:valor (key:value)
        Map<String, String> entrenadorYPokemon = new HashMap<>();

        //Agregar elementos al diccionario, para agregar es el método .put()
        entrenadorYPokemon.put("Francisca", "Chikorita");
        entrenadorYPokemon.put("Carolina", "Charmander");
        entrenadorYPokemon.put("Jorge", "Umbreon");
        entrenadorYPokemon.put("Danileo", "Alakazam");
        entrenadorYPokemon.put("Esteban", "Gengar");
        entrenadorYPokemon.put("Vicente", "Torterra");
        entrenadorYPokemon.put("Woodleine", "Pikachu");

        //Imprimimos el diccionario
        System.out.println(entrenadorYPokemon);

        //Remover un elemento
        entrenadorYPokemon.remove("Esteban");//Remueve por la key o llave
        System.out.println(entrenadorYPokemon);

        //Obtener un valor
        System.out.println(entrenadorYPokemon.get("Woodleine"));

        //Reemplazar un valor a una llave
        entrenadorYPokemon.replace("Danileo", "Mewtwo");
        System.out.println(entrenadorYPokemon);

        //Agregar de nuevo un par llave:valor
        entrenadorYPokemon.put("Danileo", "Mewtwo X");//No permite duplicados
        System.out.println(entrenadorYPokemon);

        //Agregar una llave con un valor vacío
        entrenadorYPokemon.put(null, null);
        System.out.println(entrenadorYPokemon);

        //Recorrer diccionario
        //Recorrer con EntrySet
        /*
        for (Map.Entry<String, String> entrada : entrenadorYPokemon.entrySet()) {
            //Método getKey() que me permite obtener la llave
            System.out.println("El entrenador en esta ronda es " + entrada.getKey());
            System.out.println("Su pokemon es " + entrada.getValue());
        }*/

        //Recorrer con KeySet
        for (String clave : entrenadorYPokemon.keySet()) {
            System.out.println("El entrenador en esta ronda es " + clave + " y su pokemon es " + entrenadorYPokemon.get(clave));
        }






    }
}
