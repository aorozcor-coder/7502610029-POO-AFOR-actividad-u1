package ParteD_ClaseVsObjeto.Ejercicio_22;

public class Libro {
    String titulo;
    String autor;
    int numPaginas;

    public Libro(String titulo, String autor, int numPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }
    public void mostrarDetalles() {
        System.out.println("Libro: '" + titulo + "' por " + autor + " (" + numPaginas + " pág.)");
    }
}
