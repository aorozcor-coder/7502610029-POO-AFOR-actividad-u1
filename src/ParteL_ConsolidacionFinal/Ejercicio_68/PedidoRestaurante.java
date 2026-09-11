package ParteL_ConsolidacionFinal.Ejercicio_68;

public class PedidoRestaurante {
    int idPedido;
    String plato;
    double precio;

    public PedidoRestaurante(int idPedido, String plato, double precio) {
        this.idPedido = idPedido;
        this.plato = plato;
        this.precio = precio;
    }

    public void mostrarDetalle() {
        System.out.println("Pedido #" + idPedido + ": " + plato + " - $" + precio);
    }
}
