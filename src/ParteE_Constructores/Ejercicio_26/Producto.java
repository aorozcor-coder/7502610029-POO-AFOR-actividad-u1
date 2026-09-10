package ParteE_Constructores.Ejercicio_26;

public class Producto {
        String nombre;
        double precio;
        int stock;

        // Constructor vacío
        public Producto() {
        }

        // Constructor con parámetros
        public Producto(String nombre, double precio, int stock) {
            this.nombre = nombre;
            this.precio = precio;
            this.stock = stock;
        }

        public void mostrarProducto() {
            System.out.println("Producto: " + nombre + " | Precio: $" + precio + " | Stock: " + stock);
        }
}
