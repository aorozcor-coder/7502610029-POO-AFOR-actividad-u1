package ParteJ_MiniRetos.Ejercicio_52;

public class FacturaSimple {
    String numero;
    String cliente;
    double valor;

    public FacturaSimple(String numero, String cliente, double valor) {
        this.numero = numero;
        this.cliente = cliente;
        this.valor = valor;
    }

    public void aplicarDescuento() {
        this.valor -= (this.valor * 0.10);
    }

    public void mostrarFactura() {
        System.out.println("Factura #: " + numero + " | Cliente: " + cliente + " | Valor: $" + valor);
    }

    public static void main(String[] args) {
        FacturaSimple f = new FacturaSimple("F-001", "María López", 100000.0);
        f.mostrarFactura();
        f.aplicarDescuento();
        System.out.print("Con 10% de descuento -> ");
        f.mostrarFactura();
    }
}
