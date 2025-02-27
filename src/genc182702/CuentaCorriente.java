package genc182702;

public class CuentaCorriente implements CuentaBancaria {
    //Atributo
    private String numeroDeCuenta;
    private double saldo;
    private double limiteSobregiro;


    //Constructores
    public CuentaCorriente(String numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public CuentaCorriente() {
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

    public double getLimiteSobregiro() {
        return limiteSobregiro;
    }

    public void setLimiteSobregiro(double limiteSobregiro) {
        this.limiteSobregiro = limiteSobregiro;
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
        if (monto > 0 && (saldo - monto) >= -limiteSobregiro) {
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
        return "CuentaCorriente{" +
                "numeroDeCuenta='" + numeroDeCuenta + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
