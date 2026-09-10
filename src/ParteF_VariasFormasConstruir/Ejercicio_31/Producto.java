package ParteF_VariasFormasConstruir.Ejercicio_31;

public class Producto {
    String nombre;
    double precio;
    int stock;

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
    // Metodo fábrica estático
    public static Producto crearProductoBasico(String nombre, double precio) {
        return new Producto(nombre, precio, 0);
    }

    public void mostrarProducto() {
        System.out.println("Producto: " + nombre + " | Precio: $" + precio + " | Stock: " + stock);
    }
}