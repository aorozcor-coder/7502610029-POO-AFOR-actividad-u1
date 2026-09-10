package ParteJ_MiniRetos.Ejercicio_53;

public class Reserva {
    String nombreCliente;
    String fecha;
    boolean activa;

    public Reserva(String nombreCliente, String fecha) {
        this.nombreCliente = nombreCliente;
        this.fecha = fecha;
        this.activa = false; // Inicia inactiva por defecto
    }

    public void confirmar() {
        this.activa = true;
    }

    public void cancelar() {
        this.activa = false;
    }

    public void mostrarEstado() {
        System.out.println("Reserva de: " + nombreCliente + " | Fecha: " + fecha + " | Activa: " + (activa ? "Sí" : "No"));
    }

    public static void main(String[] args) {
        Reserva r = new Reserva("Carlos Ruiz", "2026-10-15");
        r.mostrarEstado();
        r.confirmar();
        r.mostrarEstado();
        r.cancelar();
        r.mostrarEstado();
    }
}
