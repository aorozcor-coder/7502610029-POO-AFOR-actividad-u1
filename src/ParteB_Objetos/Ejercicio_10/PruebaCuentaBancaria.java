package ParteB_Objetos.Ejercicio_10;

import ParteA_Clases.Ejercicio_04.CuentaBancaria;

public class PruebaCuentaBancaria {
    public static void main(String[] args) {
        CuentaBancaria c1 = new CuentaBancaria();
        c1.numero = "100-001";
        c1.titular = "Ana Martínez";
        c1.saldo = 500000.0;

        CuentaBancaria c2 = new CuentaBancaria();
        c2.numero = "100-002";
        c2.titular = "Roberto Gómez";
        c2.saldo = 1200000.0;

        System.out.println("--- Cuenta 1 ---");
        c1.mostrarCuenta();

        System.out.println("\n--- Cuenta 2 ---");
        c2.mostrarCuenta();
    }
}



