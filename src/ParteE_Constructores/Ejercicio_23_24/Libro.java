package ParteE_Constructores.Ejercicio_23_24;

    public class Libro {
        String titulo;
        String autor;
        int numPaginas;

        // Ejercicio 23: Constructor vacío
        public Libro() {
        }

        // Ejercicio 24: Constructor con parámetros
        public Libro(String titulo, String autor, int numPaginas) {
            this.titulo = titulo;
            this.autor = autor;
            this.numPaginas = numPaginas;
        }

        public void mostrarDetalles() {
            System.out.println("Libro: " + titulo + " | Autor: " + autor + " | Páginas: " + numPaginas);
        }
}
