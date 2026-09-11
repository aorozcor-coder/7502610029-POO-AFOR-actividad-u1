package ParteK_DisenoAntesDelCodigo.Ejercicio_64;

    /*
     * DISEÑO PREVIO DE LA CLASE Tienda:
     *
     * 1. ATRIBUTOS:
     *    - nombre (String): Razon social del establecimiento.
     *    - direccion (String): Ubicación física.
     *    - cajaChica (double): Dinero en efectivo disponible.
     *
     * 2. MÉTODOS:
     *    - registrarVenta(double monto): Suma dinero a la caja chica.
     *    - realizarPago(double monto): Resta dinero de la caja chica.
     *    - mostrarBalance(): Muestra el saldo actual disponible.
     *
     * 3. OBJETOS REALES POSIBLES:
     *    - Tienda 1: Tienda Don Pedro | Calle 10 # 5-20 | Caja: $150000.0
     *    - Tienda 2: Minimarket La Esquina | Carrera 4 # 12-30 | Caja: $400000.0
     */

    public class Tienda {
        String nombre;
        String direccion;
        double caja;

        public Tienda(String nombre, String direccion, double caja) {
            this.nombre = nombre;
            this.direccion = direccion;
            this.caja = caja;
        }

        public void registrarVenta(double monto) {
            if (monto > 0) {
                caja += monto;
                System.out.println("Venta de $" + monto + " registrada en " + nombre);
            }
        }

        public void mostrarBalance() {
            System.out.println("Tienda: " + nombre + " | Saldo en Caja: $" + caja);
        }

        public static void main(String[] args) {
            Tienda t1 = new Tienda("Don Pedro", "Calle 10 # 5-20", 150000.0);
            t1.mostrarBalance();
            t1.registrarVenta(25000.0);
            t1.mostrarBalance();
        }
}
