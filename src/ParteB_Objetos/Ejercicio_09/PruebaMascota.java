package ParteB_Objetos.Ejercicio_09;

import ParteA_Clases.Ejercicio_05.Mascota;

public class PruebaMascota {
    public static void main(String[] args) {
        Mascota m = new Mascota();
        m.nombre = "Betun";
        m.especie = "Perro";
        m.edad = 1;

        System.out.println("--- Estado Inicial ---");
        m.mostrarMascota();

        m.edad = 2;
        System.out.println("\n--- Estado tras el primer año ---");
        m.mostrarMascota();

        m.edad = 3;
        System.out.println("\n--- Estado tras el segundo año ---");
        m.mostrarMascota();
    }
}
