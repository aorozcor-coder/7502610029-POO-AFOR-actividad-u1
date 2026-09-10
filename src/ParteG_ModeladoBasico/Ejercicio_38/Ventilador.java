package ParteG_ModeladoBasico.Ejercicio_38;

public class Ventilador {
    String marca;
    int velocidad;
    boolean encendido;

    public Ventilador(String marca) {
        this.marca = marca;
        this.velocidad = 0;
        this.encendido = false;
    }

    public void encender() {
        this.encendido = true;
        if (this.velocidad == 0) {
            this.velocidad = 1;
        }
    }

    public void apagar() {
        this.encendido = false;
        this.velocidad = 0;
    }

    public void subirVelocidad() {
        if (encendido) {
            this.velocidad++;
        }
    }
}
