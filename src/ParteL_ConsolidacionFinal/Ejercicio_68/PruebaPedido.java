package ParteL_ConsolidacionFinal.Ejercicio_68;

public class PruebaPedido {
    public static void main(String[] args) {
        System.out.println("\n--- 5 OBJETOS PEDIDO RESTAURANTE ---");
        PedidoRestaurante p1 = new PedidoRestaurante(101, "Hamburguesa Doble", 25000.0);
        PedidoRestaurante p2 = new PedidoRestaurante(102, "Pizza Hawaiana", 30000.0);
        PedidoRestaurante p3 = new PedidoRestaurante(103, "Perro Caliente Especial", 18000.0);
        PedidoRestaurante p4 = new PedidoRestaurante(104, "SalchiPaPas", 22000.0);
        PedidoRestaurante p5 = new PedidoRestaurante(105, "Desgranado de Pollo", 28000.0);
        p1.mostrarDetalle(); p2.mostrarDetalle(); p3.mostrarDetalle(); p4.mostrarDetalle(); p5.mostrarDetalle();
    }
}
