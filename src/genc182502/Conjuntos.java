package genc182502;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Conjuntos {

    public static void main(String[] args) {
        //Los conjuntos tienen como característica principal, que no permiten duplicados
        Set<String> seriesFavoritas = new HashSet<>();

        //Agregar a un set
        seriesFavoritas.add("Vikingos");
        seriesFavoritas.add("The Walking Dead");
        seriesFavoritas.add("The Big Bang Theory");
        seriesFavoritas.add("Malcolm");
        seriesFavoritas.add("Peaky Blinders");
        seriesFavoritas.add("The Office");
        seriesFavoritas.add("Grey's Anatomy");

        System.out.println("Mis series favoritas son: " + seriesFavoritas);

        //Agregar un duplicado al set
        seriesFavoritas.add("Malcolm");//No permite agregar al duplicado
        System.out.println("Ahora mis series favoritas son: " + seriesFavoritas);

        //Eliminar un elemento
        seriesFavoritas.remove("Malcolm");
        System.out.println(seriesFavoritas);

        Object[] listaDeSeriesFija = seriesFavoritas.toArray();
        System.out.println(Arrays.toString(listaDeSeriesFija));


        /*
        List<Integer> series = seriesFavoritas.stream()
                .filter(n -> n % 2 == 0)  // Filtra números pares
                .map(n -> n * 2)          // Multiplica cada número por 2
                .sorted();    // Ordena los números
        //Verificar si existe un elemento en el conjunto
        System.out.println(seriesFavoritas.contains("The Office"));*/




    }
}
