package ParteA_Clases.Ejercicio_03;

public class Producto {
    public String nombre;
    public double precio;
    public int stock;

    public void mostrarProducto() {
        System.out.println("Producto: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Stock: " + stock);
    }

    //ParteC: Ejercicio 15
    public void vender(int cantidad) {
        if (cantidad > 0 && this.stock >= cantidad) {
            this.stock -= cantidad;
        }
    }
}
