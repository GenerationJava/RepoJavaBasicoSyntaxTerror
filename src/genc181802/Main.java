package genc181802;

//Importamos la clase Scanner de la librería java.util
import java.util.Scanner;

//Que todos nuestros programas van a estar compuestos por clases, las clases con como las celulas de nuestro programa
//Las clases se nombran con Mayúscula
public class Main {
    //Comentario es texto que agregamos para indicar información ya sea para nosotros o para otros desarrolladores
    //Comentarios de línea
    /* Comentarios de bloque
        Un texto más largo
        Que ocupa varias
        lineas
     */
    /*****COMENTARIOS*****/

    //Dentro de la clase Main, tengo un método main que va a ser el punto de entrada al programa, por eso el método main siempre tiene que estar presente
    public static void main(String[] args) {

        //Métodos que permiten la entrada y salida en consola
        //System.out o "sout" permite imprimir en consola
        System.out.println("Hola Cohorte 18, este es nuestro primer programa");

        //Scanner.next() nos va a permitir recibir un input en cosola
        //Instanciar una clase
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa tu nombre");

        String nombre = teclado.nextLine();
        System.out.println("Hola " + nombre);

    }
}
