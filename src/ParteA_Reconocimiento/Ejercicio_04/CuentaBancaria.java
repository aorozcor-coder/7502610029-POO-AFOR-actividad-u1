package ParteA_Reconocimiento.Ejercicio_04;

public class CuentaBancaria {
    public String numero;
    public String titular;
    public double saldo;

    public void mostrarCuenta() {
        System.out.println("Número de Cuenta: " + numero);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: $" + saldo);
    }
}
