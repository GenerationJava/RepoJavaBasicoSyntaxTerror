package genc182702;

public class CuentaAhorros implements CuentaBancaria {
    //Atributos
    private String numeroDeCuenta;
    private double saldo;

    //Constructores
    public CuentaAhorros() {
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

    //Métodos
    @Override
    public void depositar(double monto) {

    }

    @Override
    public void transferir(double monto) {

    }

    @Override
    public void retirar(double monto) {

    }

    @Override
    public double verSaldo() {
        return 0;
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
