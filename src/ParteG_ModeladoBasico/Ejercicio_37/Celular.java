package ParteG_ModeladoBasico.Ejercicio_37;

public class Celular {
    String marca;
    int bateria;
    boolean prendido;

    public Celular(String marca, int bateria) {
        this.marca = marca;
        this.bateria = bateria;
        this.prendido = false;
    }

    public void encender() {
        if (bateria > 0) {
            this.prendido = true;
        }
    }

    public void apagar() {
        this.prendido = false;
    }

    public void cargarBateria(int cantidad) {
        if (cantidad > 0) {
            this.bateria = Math.min(100, this.bateria + cantidad);
        }
    }
}
