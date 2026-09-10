package ParteA_Clases.Ejercicio_04;

public class CuentaBancaria {
    public String numero;
    public String titular;
    public double saldo;

    public void mostrarCuenta() {
        System.out.println("Número de Cuenta: " + numero);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: $" + saldo);
    }

    //ParteC: Ejercicio 13
    public void consignar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        }
    }
}