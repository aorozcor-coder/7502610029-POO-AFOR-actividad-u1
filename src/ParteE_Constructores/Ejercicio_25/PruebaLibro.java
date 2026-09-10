package ParteE_Constructores.Ejercicio_25;

import ParteE_Constructores.Ejercicio_23_24.Libro;

public class PruebaLibro {
        public static void main(String[] args) {
            // Objeto usando el constructor vacío
            Libro libro1 = new Libro();

            // Objeto usando el constructor con parámetros
            Libro libro2 = new Libro("Fahrenheit 451", "Ray Bradbury", 249);

            libro1.mostrarDetalles();
            libro2.mostrarDetalles();
        }
}
