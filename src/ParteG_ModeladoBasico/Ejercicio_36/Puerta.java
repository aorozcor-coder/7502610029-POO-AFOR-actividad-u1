package ParteG_ModeladoBasico.Ejercicio_36;

public class Puerta {
    String material;
    boolean abierta;

    public Puerta(String material) {
        this.material = material;
        this.abierta = false;
    }

    public void abrir() {
        this.abierta = true;
    }

    public void cerrar() {
        this.abierta = false;
    }

    public void mostrarEstado() {
        System.out.println("Puerta de " + material + " | Abierta: " + (abierta ? "Sí" : "No"));
    }
}
