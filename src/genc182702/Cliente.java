package genc182702;

import java.time.LocalDate;

public class Cliente {

    //Atributos
    String nombreCompleto;
    String rut;
    LocalDate fechaNacimiento;
    int id;
    //Relación entre esta clase y la clase cuentaBancaria


    //Constructores son métodos que me permiten inicializar la instacia con datos
    //Constructor vacío
    public Cliente() {
    }

    //Constructor lleno o con todos los atributos
    public Cliente(String nombreCompleto, String rut, LocalDate fechaNacimiento, int id) {
        this.nombreCompleto = nombreCompleto;
        this.rut = rut;
        this.fechaNacimiento = fechaNacimiento;
        this.id = id;
    }

    
    public Cliente(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }


    //Método ToString
    @Override
    public String toString() {
        return "Cliente{" +
                "nombreCompleto='" + nombreCompleto + '\'' +
                ", rut='" + rut + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", id=" + id +
                '}';
    }
}
