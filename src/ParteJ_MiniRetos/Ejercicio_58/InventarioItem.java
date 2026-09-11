package ParteJ_MiniRetos.Ejercicio_58;

public class InventarioItem {
    String nombre;
    int cantidad;
    double precioUnitario;

    public InventarioItem(String nombre, int cantidad, double precioUnitario) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    public double calcularValorTotal() {
        return this.cantidad * this.precioUnitario;
    }

    public void mostrarResumen() {
        System.out.println("Ítem: " + nombre + " | Cantidad: " + cantidad + " | Precio U.: $" + precioUnitario);
        System.out.println("Valor Total en Inventario: $" + calcularValorTotal());
    }

    public static void main(String[] args) {
        InventarioItem item = new InventarioItem("Monitor 24 pulgadas", 15, 650000.0);
        item.mostrarResumen();
    }
}
