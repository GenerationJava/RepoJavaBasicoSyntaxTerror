package genc182502;

import java.util.*;

public class LibretaDeNotas {

    public static void main(String[] args) {
        //Creamos un map para almacenar la lista de estudiantes con sus notas
        Map<String, Map<String, List<Double>>> listaNotasEstudiante = new HashMap<>();
        Map<String, List<Double>> notasDeDanileo = new HashMap<>();
        List<Double> notas = Arrays.asList(10.00, 7.00, 5.00);
        notasDeDanileo.put("SCRUM", notas);
        notasDeDanileo.put("Git", Arrays.asList(9.00, 4.00, 3.00));
        notasDeDanileo.put("Java", Arrays.asList(10.00, 10.00, 10.00));




        //Agregar registros a la libreta
        listaNotasEstudiante.put("Danileo", notasDeDanileo);

        System.out.println(listaNotasEstudiante);

    }

}
