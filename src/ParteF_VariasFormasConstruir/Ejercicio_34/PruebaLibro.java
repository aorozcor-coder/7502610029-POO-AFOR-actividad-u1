package ParteF_VariasFormasConstruir.Ejercicio_34;

import ParteF_VariasFormasConstruir.Ejercicio_33.Libro;

public class PruebaLibro {
    public static void main(String[] args) {
        // Ejercicio 34: Libro original
        Libro original = new Libro("El Principito", " Antoine de Saint-Exupéry", 100);

        // Copia a partir del original
        Libro copia = new Libro(original);

        System.out.print("Original -> ");
        original.mostrarDetalles();

        System.out.print("Copia -> ");
        copia.mostrarDetalles();
    }
}
