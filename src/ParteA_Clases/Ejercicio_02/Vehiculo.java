package ParteA_Clases.Ejercicio_02;

public class Vehiculo {
    public String marca;
    public String modelo;
    public int velocidadActual;

    public void mostrarEstado() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidad Actual: " + velocidadActual);
    }

    //ParteC: Ejercicio 11
    public void acelerar() {
        this.velocidadActual += 10;
    }

    //ParteC: Ejercicio 12
    public void frenar() {
        if (this.velocidadActual - 10 >= 0) {
            this.velocidadActual -= 10;
        } else {
            this.velocidadActual = 0;
        }
    }
}