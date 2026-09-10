package ParteE_Constructores.Ejercicio_26;

public class PruebaProducto {
    public static void main(String[] args) {
        // Objeto con constructor vacío
        Producto p1 = new Producto();

        // Objeto con constructor parametrizado
        Producto p2 = new Producto("Teclado Mecánico", 120000.0, 15);

        p1.mostrarProducto();
        p2.mostrarProducto();
    }
}
