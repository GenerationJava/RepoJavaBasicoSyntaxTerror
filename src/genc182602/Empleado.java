package genc182602;

import java.time.LocalTime;
import java.util.Map;

public class Empleado extends Persona{

    //Atributo
    String cargo;
    Integer sueldo;
    Map<LocalTime, LocalTime> horario;

    //Métodos
    public void trabajar() {
        System.out.println("Trabaja 8 horas al día");
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "cargo='" + cargo + '\'' +
                ", sueldo=" + sueldo +
                ", horario=" + horario +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
