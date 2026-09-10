package ParteF_VariasFormasConstruir.Ejercicio_33;

public class Libro {
    String titulo;
    String autor;
    int numPaginas;

    // Constructor parametrizado
    public Libro(String titulo, String autor, int numPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    // Constructor copia
    public Libro(Libro otroLibro) {
        this.titulo = otroLibro.titulo;
        this.autor = otroLibro.autor;
        this.numPaginas = otroLibro.numPaginas;
    }
    public void mostrarDetalles() {
        System.out.println("Libro: " + titulo + " | Autor: " + autor + " | Páginas: " + numPaginas);
    }
}