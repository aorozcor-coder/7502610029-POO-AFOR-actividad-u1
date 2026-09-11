package ParteJ_MiniRetos.Ejercicio_60;

public class Avion {
    String aerolinea;
    String destino;
    int pasajeros;

    public Avion(String aerolinea, String destino) {
        this.aerolinea = aerolinea;
        this.destino = destino;
        this.pasajeros = 0;
    }

    public void abordar(int cantidad) {
        if (cantidad > 0) {
            this.pasajeros += cantidad;
        }
    }

    public void mostrarInfo() {
        System.out.println("Aerolínea: " + aerolinea + " | Destino: " + destino + " | Pasajeros a bordo: " + pasajeros);
    }

    public static void main(String[] args) {
        Avion av = new Avion("Avianca", "Bogotá");
        av.mostrarInfo();
        av.abordar(45);
        av.mostrarInfo();
        av.abordar(30);
        av.mostrarInfo();
    }
}
