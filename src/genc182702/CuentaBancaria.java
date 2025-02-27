package genc182702;

public interface CuentaBancaria {
    //Las interfaces se utilizan comunmente para declarar métodos en común para todas sus implementaciones
    void depositar(double monto);
    void transferir(double monto);
    void retirar(double monto);
    double verSaldo();


}
