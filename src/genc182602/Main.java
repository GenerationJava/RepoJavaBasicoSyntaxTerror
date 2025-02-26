package genc182602;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        //Crear una nueva instancia de persona
        Persona personaUno = new Persona();
        Persona personaDos = new Persona();

        //Si intentamos imprimir sin el método toString() nos imprime la dirección en memoria
        //System.out.println(LocalDate.now());

        //Setear los datos a la personaUno
        personaUno.nombre = "Jorge";
        personaUno.altura = 1.78;
        personaUno.fechaNacimiento = LocalDate.of(1993,8,9);

        personaDos.nombre = "Martin";
        personaDos.altura = 1.70;
        personaDos.fechaNacimiento = LocalDate.of(2001,3,9);

        //Hacemos un llamado al método conversar que recibe un objeto de tipo Persona como argumento
        personaUno.conversar(personaDos);
        personaUno.desplazarse(50, "Derecha");

        //Imprimir los datos de la persona
        System.out.println(personaUno);

        Deportista deportistaUno = new Deportista();
        deportistaUno.nombre = "Esteban";
        deportistaUno.deporteLiga.put("Nombre de deporte", "Escalada Deportiva");

        System.out.println(deportistaUno);
        deportistaUno.saludar();





    }
}
