package ParteE_Constructores.Ejercicio_28;

import ParteE_Constructores.Ejercicio_27.CuentaBancaria;

public class PruebaCuentaBancaria {
    public static void main(String[] args) {
        // Creación de tres cuentas con el constructor parametrizado
        CuentaBancaria cuenta1 = new CuentaBancaria("001-123", "Carlos Gómez", 500000.0);
        CuentaBancaria cuenta2 = new CuentaBancaria("001-456", "Ana Martínez", 1200000.0);
        CuentaBancaria cuenta3 = new CuentaBancaria("001-789", "Luis Rodríguez", 250000.0);

        cuenta1.mostrarCuenta();
        cuenta2.mostrarCuenta();
        cuenta3.mostrarCuenta();
    }
}
