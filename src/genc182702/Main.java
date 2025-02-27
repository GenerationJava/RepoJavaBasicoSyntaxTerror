package genc182702;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ConcurrentLinkedDeque;

public class Main {
    //Lista de clientes del banco
    static List<Cliente> listaClientes = new ArrayList<>();
    static Random random = new Random();

    public static void main(String[] args) {
        //Creación de nuevo cliente
        Scanner sc = new Scanner(System.in);
        //Inicializando con constructor vacío
        Cliente clienteVacio = new Cliente();
        //Inicializando con constructor lleno
        Cliente clienteLleno = new Cliente("Martin", "1111111-k", LocalDate.of(2001,3,9), 1);

        System.out.println(clienteVacio);
        System.out.println(clienteLleno);

        //Probamos Getter y Setter
        /*
        System.out.println(clienteLleno.getNombreCompleto());//Imprime "Martin"
        clienteLleno.setNombreCompleto("Gabriel");//Cambia el nombre completo
        System.out.println(clienteLleno.getNombreCompleto());//Imprime Gabriel


        //Creamos una cuenta corriente probando el límite de sobregiro
        CuentaCorriente cuentaCorriente = new CuentaCorriente("00001231245");
        cuentaCorriente.setLimiteSobregiro(20000);
        cuentaCorriente.depositar(1000000.00);
        cuentaCorriente.retirar(1030000);

        CuentaAhorros cuentaAhorros = new CuentaAhorros("0000756754664");
        cuentaAhorros.depositar(50000);
        cuentaAhorros.retirar(60000);
        */


        //Menú
        if (listaClientes.isEmpty()) {
            Cliente nuevoCliente = new Cliente();
            System.out.println("Ingresa tu nombre");
            String nombre = sc.nextLine();
            nuevoCliente.setNombreCompleto(nombre);
            nuevoCliente.setId(random.nextInt());
            sc.nextLine();
            System.out.println("Ingresa tu RUT");
            nuevoCliente.setRut(sc.nextLine());
            System.out.println("Indica el formato: año-mes-día de nacimiento");
            String fechaNacimiento = sc.nextLine();
            nuevoCliente.setFechaNacimiento(LocalDate.parse(fechaNacimiento));
            System.out.println("Se creó tu perfil de cliente");
            listaClientes.add(nuevoCliente);
            menuBanco();
        } else {
            System.out.println("El cliente ya existe");
        }
        }


        public static void menuBanco() {
            int opcion = 0;
            Scanner sc = new Scanner(System.in);

            while (true) {
                System.out.println("**** Menú ****" +
                        "\n 1. Crear cuenta corriente" +
                        "\n 2. Crear cuenta de ahorro" +
                        "\n 3. Consultar saldo" +
                        "\n 4. Depositar" +
                        "\n 5. Transferir" +
                        "\n 6. Salir" +
                        "\n Indica una opción");
                opcion = sc.nextInt();
                String rut;
                Cliente clienteSeleccionado;
                switch (opcion) {
                    case 1:
                        System.out.println("Ingrese su RUT");
                        rut = sc.nextLine();
                        for (Cliente cliente : listaClientes) {
                            if (cliente.getRut().equals(rut)) {
                                clienteSeleccionado = cliente;
                                System.out.println("Su cuenta corriente ha sido creada");
                                CuentaCorriente nuevaCuentaCorriente = new CuentaCorriente(String.valueOf(random.nextInt()));
                                System.out.println("Su número de cuenta es " + nuevaCuentaCorriente);
                                nuevaCuentaCorriente.setClienteCuenta(clienteSeleccionado);
                            } else {
                                System.out.println("El cliente no existe");
                            }
                        }
                        break;
                    case 2:
                        System.out.println("Ingrese su RUT");
                        rut = sc.nextLine();
                        for (Cliente cliente : listaClientes) {
                            if (cliente.getRut().equals(rut)) {
                                clienteSeleccionado = cliente;
                                System.out.println("Su cuenta de ahorro ha sido creada");
                                CuentaAhorros nuevaCuentaAhorros = new CuentaAhorros(String.valueOf(random.nextInt()));
                                System.out.println("Su número de cuenta es " + nuevaCuentaAhorros);
                                nuevaCuentaAhorros.setClienteCuenta(clienteSeleccionado);
                            } else {
                                System.out.println("El cliente no existe");
                            }
                        }
                    case 3:
                        System.out.println("Ingrese su RUT");
                        rut = sc.nextLine();
                        for (Cliente cliente : listaClientes) {
                            if (cliente.getRut() == rut) {
                                clienteSeleccionado = cliente;
                                for (CuentaBancaria cuenta : cliente.getCuentas()) {
                                    System.out.println(cuenta.verSaldo());
                                };
                            } else {
                                System.out.println("El cliente no existe");
                            }
                        }
                        break;
                    case 4:
                        CuentaAhorros cuentaAhorros = new CuentaAhorros();
                        cuentaAhorros.getSaldo();
                    default:

                        return;
                }
        }









    }
}
