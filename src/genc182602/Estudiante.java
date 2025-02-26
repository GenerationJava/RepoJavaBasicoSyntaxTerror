package genc182602;

public class Estudiante extends Persona {

    //Atributos
    String curso;
    Double promedio;

    //Métodos
    public void estudiar() {
        System.out.println("Estudia 8 horas al día");
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "curso='" + curso + '\'' +
                ", promedio=" + promedio +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
