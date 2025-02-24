package genc182102;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MetodosJava {

    //Método que trabaja con los métodos de la clase Math
    public static void llamadoMetodosMath() {
        double numero = 16;
        System.out.println("El número con el que vamos a trabajar es: " + numero);
        //Llamamos a la clase Math y accedemos a su método random
        System.out.println("Un número al azar entre 0 y 1 es " + Math.random());
        //LLamamos a la clase Math y al método pow
        System.out.println("16 elevado a 2 es " + Math.pow(16, 2));
        //LLamamos a la clase Math y al método max
        System.out.println("Entre estos dos valores, el máximo es " + Math.max(numero, 20.0));
        //LLamamos a la clase Math y al método min
        System.out.println("Entre estos dos valores, el mínimo es " + Math.min(5.00, numero));
    }

    //Método que llame a métodos para los String
    public static void llamadoMetodosString(String nombreUno, String nombreDos) {
        System.out.println("Hola, bienvenidos al programa " + nombreUno + " y " + nombreDos);
        //Llamamos al método .equals() para comparar entre Strings, esto porque estamos comparando dos objetos de tipo String y ningún objeto es igual a otro
        System.out.println("Los nombres " + nombreUno + " y " + nombreDos + " son iguales? La respuesta es " + (nombreUno.equals(nombreDos)));
        //LLamamos al método .length() para conocer la longitud de un String
        System.out.println("Los nombres " + nombreUno + " y " + nombreDos + " suman una cantidad de " + (nombreUno.length() + nombreDos.length()) + " caracteres");
        //Llamamos al método .upperCase() para "convertir" el String a mayúsculas
        System.out.println("El primer nombre en mayúscula sería " + nombreUno.toUpperCase());
        //Llamamos al método .toLowerCase() para "convertir" el String en minúscula
        System.out.println("El segundo nombre en minúscula sería " + nombreDos.toLowerCase());
    }

    //Método que llame a métodos para trabajar con Fechas
    public static void llamadoMetodosFechas() {
        //Clase para almacenar fecha, inicializamos con fecha actual
        LocalDate fechaDeHoy = LocalDate.now();
        System.out.println("La fecha de hoy es " + fechaDeHoy);
        //Llamamos al método .getYear() para obtener el año de una fecha
        System.out.println("El año actual es " + fechaDeHoy.getYear());
        //Llamamos al método .getMonth() para obtener el mes de la fecha
        System.out.println("El mes actual es " + fechaDeHoy.getMonth());
        //Llamamos al método .getDay() para obtener el día de la fecha
        System.out.println("El día de hoy es " + fechaDeHoy.getDayOfWeek());
        //System.out.println("El resultado de comparar el DayOfTheWeek con el String MONDAY " + ("MONDAY".equals(String.valueOf(fechaDeHoy.getDayOfWeek()))));
        //Llamamos al método .format() y al método ofPattern() de la clase DateTimeFormatter para formatear la fecha actual
        System.out.println("Formato de la fecha: (dd/MM/yyyy) " + fechaDeHoy.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

    }



    public static void main(String[] args) {
        llamadoMetodosMath();
        llamadoMetodosString("Maria", "MARIA");
        llamadoMetodosFechas();
    }
}
