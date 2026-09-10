package ParteF_VariasFormasConstruir.Ejercicio_32;

import ParteF_VariasFormasConstruir.Ejercicio_31.Producto;

public class PruebaProducto {
    public static void main(String[] args) {
        Producto p1 = Producto.crearProductoBasico("Mouse Inalámbrico", 45000.0);
        Producto p2 = Producto.crearProductoBasico("Pad Mouse", 15000.0);

        p1.mostrarProducto();
        p2.mostrarProducto();
    }
}