package Ejercicio_Parcial;

public class CuentaBancaria {

    private String titular;
    private double saldo;

    public CuentaBancaria(String titular) {
        this.titular = titular;
        this.saldo = 0.0;
    }

    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public String getTitular() { return titular; }
    public double getSaldo() { return saldo; }

    public void ingresar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
        }
    }

    public void retirar(double cantidad) {
        saldo -= cantidad;
        if (saldo < 0) saldo = 0;
    }

    @Override
    public String toString() {
        return String.format("Titular: %s - Saldo: %.2f", titular, saldo);
    }

}
