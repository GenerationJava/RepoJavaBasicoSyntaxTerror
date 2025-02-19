package genc181902;

import java.util.Scanner;

public class ControlDeFlujo {
    //Control de flujo hace referencia a las condiciones que permiten controlar el flujo del programa

    public static void main(String[] args) {
        //If equivale un "Si" ...
        //Else equivale a "Si no" ...
        //Else if equivale "O si" ...

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa tu nombre");
        String nombre =  teclado.nextLine();
        System.out.println("Ingresa tu edad");
        Integer edad = teclado.nextInt();
        teclado.nextLine();
        System.out.println("¿Tienes tu carnet en mano?");
        String respuestaCarnet = teclado.nextLine();

        //Verificar si la edad de la persona cumple con ciertos requisitos para poder entrar
        //Mi condicion inicial
        if (respuestaCarnet.equalsIgnoreCase("si")) {
            if ((edad > 18)) {
                System.out.println("Perfecto, " +  nombre + " puedes pasar. Diviertete!");
            } else if (edad == 18) {
                System.out.println("Estas en la edad justa " + nombre + " puedes pasar pero te portas bien");
            } else {
                //Este bloque de código se va a ejecutar en caso de que todo lo demás resulte falso
                System.out.println("Lo sentimos " + nombre + ", todavía no");
            }
        } else {
            System.out.println("No puede entrar sin carnet");
        }

        //En ocasiones vamos a tener muchos posibles escenarios según algún valor
        System.out.println("¿Qué día de la semana es? responde con un número");
        Integer diaSemana = teclado.nextInt();
        teclado.nextLine();

        /*
        if (diaSemana == 1) {
            System.out.println("Hoy es lunes");
        } else if (diaSemana == 2) {
            System.out.println("Hoy es martes");
        } else if (diaSemana == 3) {
            System.out.println("Hoy es miercoles");
        } else if (diaSemana == 4) {
            System.out.println("Hoy es jueves");
        } else if (diaSemana == 5) {
            System.out.println("Hoy es viernes");
        } else if (diaSemana == 6) {
            System.out.println("Hoy es sabado");
        } else  {
            System.out.println("Es domingo");
        }*/

        //Una alternativa puede ser el switch-case
        switch (diaSemana) {
            case 1:
                System.out.println("Hoy es lunes, recién comienza la semana. Mucho ánimo!");
                break;
            case 2:
                System.out.println("Hoy es martes, aún falta para el fin de semana. Ánimo");
                break;
            case 3:
                System.out.println("Hoy es miercoles, estamos a la mitad");
                break;
            case 4:
                System.out.println("Hoy es jueves, falta poco");
                break;
            case 5:
                System.out.println("Ya es viernes y el cuerpo lo sabe");
                break;
            case 6:
                System.out.println("Es sabado, al fin es fin de semana!");
                break;
            case 7:
                System.out.println("Es domingo, toca descansar");
                break;
            default:
                System.out.println("Ese día de la semana no existe");
        }

        System.out.println("Ingrese el nombre del estudiante");
        String nombreEstudiante = teclado.nextLine();

        switch (nombreEstudiante) {
            case "Gabriel":
                System.out.println("Es de la cohorte 18");
                break;
            case "Belen":
                System.out.println("Es de la cohorte 14");
                break;
            default:
                System.out.println("Ingrese un nombre válido");
        }

        /*
        boolean comparacionDeStrings = nombreEstudiante.equalsIgnoreCase("Martin");
        System.out.println("La comparacion entre nombres resultó " + comparacionDeStrings);*/




    }

}
