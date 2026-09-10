package ParteG_ModeladoBasico.Ejercicio_40;

public class Pelicula {
    String nombre;
    String genero;
    int minutos;

    public Pelicula(String nombre, String genero, int minutos) {
        this.nombre = nombre;
        this.genero = genero;
        this.minutos = minutos;
    }

    public void mostrarFicha() {
        System.out.println("Película: " + nombre + " | Género: " + genero + " | Duración: " + minutos + " mins");
    }
}
