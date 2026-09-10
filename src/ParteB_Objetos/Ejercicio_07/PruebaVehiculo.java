package ParteB_Objetos.Ejercicio_07;

import ParteA_Clases.Ejercicio_02.Vehiculo;

public class PruebaVehiculo {
    public static void main(String[] args) {
        Vehiculo auto1 = new Vehiculo();
        auto1.marca = "Toyota";
        auto1.modelo = "Corolla";
        auto1.velocidadActual = 60;

        Vehiculo auto2 = new Vehiculo();
        auto2.marca = "Mazda";
        auto2.modelo = "CX-30";
        auto2.velocidadActual = 0;

        System.out.println("--- Vehículo 1 ---");
        auto1.mostrarEstado();

        System.out.println("\n--- Vehículo 2 ---");
        auto2.mostrarEstado();
    }
}
