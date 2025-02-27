package genc182702;

public class CuentaAhorros implements CuentaBancaria {
    //Atributos
    private String numeroDeCuenta;
    private double saldo;
    private Cliente clienteCuenta;

    //Constructores
    public CuentaAhorros() {
    }

    public CuentaAhorros(String numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public CuentaAhorros(String numeroDeCuenta, double saldo) {
        this.numeroDeCuenta = numeroDeCuenta;
        this.saldo = saldo;
    }

    //Getter y Setter
    public String getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getClienteCuenta() {
        return clienteCuenta;
    }

    public void setClienteCuenta(Cliente clienteCuenta) {
        this.clienteCuenta = clienteCuenta;
    }

    //Métodos
    @Override
    public void depositar(double monto) {
        if (monto > 0) {
            this.saldo += monto;
            System.out.println("Se ha depositado un monto de $" + monto);
            System.out.println("Tiene un saldo " + saldo);
        } else {
            System.out.println("El monto ingresado es inválido");
        }
    }

    @Override
    public void transferir(double monto) {
        if (monto > 0 && monto <= saldo) {
            this.saldo -= monto;//Se Actualiza el saldo
            System.out.println("Se ha transferido un monto de $" + monto);
            System.out.println("Tiene un saldo " + saldo);
        } else {
            System.out.println("Fondos insuficientes");
        }
    }

    @Override
    public void retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            this.saldo -= monto;//Se Actualiza el saldo
            System.out.println("Ha retirado una cantida de $" + monto);
            System.out.println("Tiene un saldo " + saldo);
        } else {
            System.out.println("Límite excedido");
        }
    }

    @Override
    public double verSaldo() {
        return saldo;
    }



    //ToString
    @Override
    public String toString() {
        return "CuentaAhorros{" +
                "numeroDeCuenta='" + numeroDeCuenta + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
