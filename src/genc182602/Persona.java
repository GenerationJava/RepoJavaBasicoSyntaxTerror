package genc182602;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

//Definimos una clase, como molde o plano que describe a la persona
public class Persona {

    //Atributos o características
    String nombre;
    //int edad;
    LocalDate fechaNacimiento;
    String genero;
    double altura;
    double peso;
    boolean tieneAlgunaDiscapacidad;
    //Constante en Java
    String rut;
    //Podemos indicar un atributo como lista o set o map
    List<Persona> listaCompaneros = new ArrayList<>();

    //Acciones o métodos
    public void desplazarse(int velocidadMovimiento, String direccion) {
        System.out.println("La persona " + this.nombre + " se movio " + velocidadMovimiento + " mts, hacia la " + direccion);
    }

    public void saludar() {
        System.out.println("Hola, soy " + this.nombre);
    }

    //Podemos recibir recibir como argumento una instancia de una clase
    public void conversar(Persona interlocutor) {
        //A través de la palabra reserva this accedo a atributos o métodos de la instancia actual
        this.saludar();
        //A través del argumeto de tipo Persona, accedo a los métodos del interlocutor
        interlocutor.saludar();
        System.out.println("Por casualidad naciste el " + interlocutor.fechaNacimiento + "?");
    }


    //Anotación @Override permite sobrescribir un método de una clase padre
    //Mediante la sobrescritura y la sobrecarga de métodos, demostramos polimorfismo
    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", genero='" + genero + '\'' +
                ", altura=" + altura +
                ", peso=" + peso +
                ", tieneAlgunaDiscapacidad=" + tieneAlgunaDiscapacidad +
                ", rut='" + rut + '\'' +
                ", listaCompaneros=" + listaCompaneros +
                '}';
    }


}
