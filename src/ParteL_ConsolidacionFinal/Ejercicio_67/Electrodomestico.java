package ParteL_ConsolidacionFinal.Ejercicio_67;

public class Electrodomestico {
    String nombre;
    String ubicacion;
    boolean encendido;

    public Electrodomestico(String nombre, String ubicacion, boolean encendido) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.encendido = encendido;
    }

    public void mostrarEstado() {
        System.out.println("Electrodomestico: " + nombre + " (" + ubicacion + ") -> " + (encendido ? "Encendido" : "Apagado"));
    }
}
