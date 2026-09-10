package ParteJ_MiniRetos.Ejercicio_54;

public class Semaforo {
    String colorActual;

    public Semaforo() {
        this.colorActual = "Rojo"; // Estado inicial por defecto
    }

    public void cambiarColor(String nuevoColor) {
        if (nuevoColor.equalsIgnoreCase("Rojo") ||
                nuevoColor.equalsIgnoreCase("Amarillo") ||
                nuevoColor.equalsIgnoreCase("Verde")) {
            this.colorActual = nuevoColor;
        } else {
            System.out.println("Color no válido para un semáforo.");
        }
    }

    public void mostrarEstado() {
        System.out.println("Semáforo en luz: " + colorActual);
    }

    public static void main(String[] args) {
        Semaforo s = new Semaforo();
        s.mostrarEstado();
        s.cambiarColor("Verde");
        s.mostrarEstado();
        s.cambiarColor("Amarillo");
        s.mostrarEstado();
    }
}
