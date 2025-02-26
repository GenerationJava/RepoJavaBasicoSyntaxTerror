package genc182602;

import java.util.HashMap;
import java.util.Map;

//Palabra reservada extends indica una relación de herencia
public class Deportista extends Persona {

    //Atributos
    Map<String, String> deporteLiga = new HashMap<>();
    String condicionFisica;

    //Métodos
    public void ejercitar() {
        System.out.println("Ejercita 8 horas al día");
    }

    @Override
    public void saludar() {
        System.out.println("Hola, soy " + this.nombre + " y practico " + deporteLiga.get("Nombre de deporte"));
    }

    //Sobrescribe el comportamiento del método como lo tenía su clase padre
    @Override
    public String toString() {
        return "Deportista{" +
                "deporteLiga=" + deporteLiga +
                ", condicionFisica='" + condicionFisica + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
