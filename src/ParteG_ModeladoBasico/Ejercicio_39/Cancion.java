package ParteG_ModeladoBasico.Ejercicio_39;

public class Cancion {
    String titulo;
    String artista;
    double duracion;

    public Cancion(String titulo, String artista, double duracion) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracion = duracion;
    }

    public void mostrarInfo() {
        System.out.println("Título: " + titulo + " | Artista: " + artista + " | Duración: " + duracion + " min");
    }
}
