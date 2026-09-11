package ParteL_ConsolidacionFinal.Ejercicio_71;

public class CarroReescrito {
    String marca;
    String modelo;
    int anio;


    public CarroReescrito(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    public void mostrarFicha() {
        System.out.println("Carro: " + marca + " " + modelo + " (" + anio + ")");
    }

    public static void main(String[] args) {
        CarroReescrito miCarro = new CarroReescrito("Toyota", "Corolla", 2024);
        miCarro.mostrarFicha();
    }
}
