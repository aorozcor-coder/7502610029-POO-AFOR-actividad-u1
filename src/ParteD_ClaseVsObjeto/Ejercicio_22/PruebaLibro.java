package ParteD_ClaseVsObjeto.Ejercicio_22;

public class PruebaLibro {
    public static void main(String[] args) {
        // Creación de cuatro objetos distintos a partir de la clase Libro
        Libro libro1 = new Libro("Cien Años de Soledad", "Gabriel García Márquez", 471);
        Libro libro2 = new Libro("Crónica de una muerte anunciada", "Gabriel García Márquez", 120);
        Libro libro3 = new Libro("El Principito", "Antoine de Saint-Exupéry", 96);
        Libro libro4 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 863);

        libro1.mostrarDetalles();
        libro2.mostrarDetalles();
        libro3.mostrarDetalles();
        libro4.mostrarDetalles();

        /*
         * CONCLUSIÓN EJERCICIO 22:
         *
         * La clase 'Libro' actúa como una plantilla porque únicamente especifica la estructura
         * y características generales (título, autor, número de páginas) que compartirá cualquier libro,
         * pero sin representar a uno en particular ni ocupar espacio en memoria para datos reales.
         *
         * Los objetos ('libro1', 'libro2', 'libro3' y 'libro4') son casos concretos porque son
         * ejemplares individuales creados a partir de esa plantilla, asignándoles valores específicos
         * a cada atributo para representar un libro real e independiente en el sistema.
         */
    }
}
