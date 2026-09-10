package ParteB_Objetos.Ejercicio_08;

import ParteA_Clases.Ejercicio_03.Producto;

public class PruebaProducto {
    public static void main(String[] args) {
        Producto p1 = new Producto();
        p1.nombre = "Teclado Mecánico";
        p1.precio = 85.00;
        p1.stock = 20;

        Producto p2 = new Producto();
        p2.nombre = "Mouse Inalámbrico";
        p2.precio = 35.50;
        p2.stock = 50;

        Producto p3 = new Producto();
        p3.nombre = "Monitor 4K";
        p3.precio = 320.00;
        p3.stock = 8;

        System.out.println("--- Producto 1 ---");
        p1.mostrarProducto();

        System.out.println("\n--- Producto 2 ---");
        p2.mostrarProducto();

        System.out.println("\n--- Producto 3 ---");
        p3.mostrarProducto();
    }
}
