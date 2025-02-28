package genc182702;

import java.util.Scanner;

public class SistemaBanco {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 6;
        //LLamamos a la interfaz CuentaBancaria, y la dejamos como nula
        CuentaBancaria cuenta = null;

        //Comenzamos con un bucle Do While para que el bloque de código se ejecute primero y después evalúe
        do {
            System.out.println("**** Menú ****" +
                    "\n 1. Crear cuenta corriente" +
                    "\n 2. Crear cuenta de ahorro" +
                    "\n 3. Consultar saldo" +
                    "\n 4. Depositar" +
                    "\n 5. Retirar" +
                    "\n 6. Salir" +
                    "\n Indica una opción");
            opcion = sc.nextInt(); //Seteamos la opción ingresada a la variable opción

            switch (opcion) {
                case 1:
                    //Creación de cuenta corriente
                    if(cuenta == null) {
                        //Inicializamos la cuenta que estaba vacía, como una cuenta Corriente con un Número generado aleatoriamente
                        cuenta = new CuentaCorriente(String.valueOf((int) (Math.random()* 1000)));
                        CuentaCorriente cuentaCorriente = (CuentaCorriente) cuenta;
                        //Agregar límite de sobregiro
                        cuentaCorriente.setLimiteSobregiro(50000);
                        System.out.println("Creada la cuenta corriente número: " + cuentaCorriente.getNumeroDeCuenta());
                    } else {
                        System.out.println("Ya existe una cuenta creada");
                    }
                    break;
                case 2:
                    if(cuenta == null) {
                        //Inicializamos la cuenta vacía, como cuenta de Ahorros con un número generado aleatoriamente
                        cuenta = new CuentaAhorros(String.valueOf((int) (Math.random() * 1000)));
                        CuentaAhorros cuentaAhorros = (CuentaAhorros) cuenta; 
                        System.out.println("Creada la cuenta de ahorros número: " + cuentaAhorros.getNumeroDeCuenta());
                    } else {
                        System.out.println("Ya existe una cuenta creada");
                    }
                    break;
                case 3:
                    //Ver saldo, para esto verificamos que la variable almacenada en cuenta no sea nula
                    if (cuenta != null) {
                        System.out.println("Su saldo actual es de $" + cuenta.verSaldo());
                    } else {
                        System.out.println("Primero, debes crear una cuenta");
                    }
                    break;
                case 4:
                    //Para depositar, de nuevo verificamos que la cuenta no sea nula
                    if (cuenta != null) {
                        System.out.println("Ingrese el monto a depositar");
                        //Solicitamos el monto al usuario
                        double monto = sc.nextDouble();
                        //Le pasamos el monto como argumento al método depositar()
                        cuenta.depositar(monto);
                    } else  {
                        System.out.println("Primero, debes crear una cuenta");
                    }
                    break;
                case 5:
                    //Para retirar, verificamos de nuevo que la cuenta no es nula
                    if(cuenta != null) {
                        System.out.println("Ingrese el monto que va a retirar");
                        //Solicitamos el monto al usuario
                        double monto = sc.nextDouble();
                        //Le pasamos el monto al método retirar, que lo va a ejecutar de manera distinta para cada cuenta(Polimorfismo)
                        cuenta.retirar(monto);
                    } else {
                        System.out.println("Primero, debes crear una cuenta");
                    }
                    break;
                case 6:
                    System.out.println("Saliendo del sistema, ¡muchas gracias!");
                    break;
                default:
                    System.out.println("Opción inválida, intente de nuevo");
            }

        } while (opcion != 6);




    }

}
