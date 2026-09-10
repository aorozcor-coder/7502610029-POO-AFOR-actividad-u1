package ParteG_ModeladoBasico.Ejercicio_35;

public class Lampara {
    String marca;
    boolean encendida;

    public Lampara(String marca){
        this.marca = marca;
        this.encendida = false;
    }
    public void encender() {
        this.encendida = true;
    }

    public void apagar() {
        this.encendida = false;
    }

    public void mostrarEstado() {
        System.out.println("Lámpara Marca: " + marca + " | Encendida: " + (encendida ? "Sí" : "No"));
    }
}
