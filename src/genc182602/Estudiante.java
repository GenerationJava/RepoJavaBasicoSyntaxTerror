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
    public void desplazarse(int velocidadMovimiento, String direccion) {
        System.out.println(this.nombre + " camina " + velocidadMovimiento + " km por hora, hacia " + direccion);
    }

    @Override
    public void saludar() {
        System.out.println("Hola, soy " + this.nombre + " y estoy cursando " + this.curso);
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
