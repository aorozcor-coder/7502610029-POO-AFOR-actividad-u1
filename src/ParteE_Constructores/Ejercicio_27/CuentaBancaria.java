package ParteE_Constructores.Ejercicio_27;

public class CuentaBancaria {
    String numero;
    String titular;
    double saldo;

    public CuentaBancaria(String numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void mostrarCuenta() {
        System.out.println("Cuenta: " + numero + " | Titular: " + titular + " | Saldo: $" + saldo);
    }
}
