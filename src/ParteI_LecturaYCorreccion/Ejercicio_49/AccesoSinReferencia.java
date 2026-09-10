package ParteI_LecturaYCorreccion.Ejercicio_49;


    /*
     * 1. CÓDIGO ERRADO:
     *
     * class Cuenta {
     *     double saldo = 1000;
     * }
     *
     * public class AccesoSinReferencia {
     *     public void transferir() {
     *         saldo -= 100; // Intenta acceder a saldo directamente sin decir de qué cuenta
     *     }
     * }
     *
     * 2. EXPLICACIÓN DEL ERROR DEL COMPILADOR:
     * El compilador arroja el error: "cannot find symbol: variable saldo".
     * Un objeto no puede manipular los miembros de otro de forma "mágica". Requiere
     * explícitamente recibir o poseer la referencia del objeto objetivo (ej: 'otraCuenta.saldo').
     */

    // 3. CÓDIGO CORREGIDO:
    class Cuenta {
        double saldo = 1000;
    }

    public class AccesoSinReferencia {
        public void transferir(Cuenta cuentaOrigen, double monto) {
            // Se accede al atributo a través de la referencia explícita 'cuentaOrigen'
            cuentaOrigen.saldo -= monto;
        }

        public static void main(String[] args) {
            Cuenta miCuenta = new Cuenta();
            AccesoSinReferencia servicio = new AccesoSinReferencia();

            servicio.transferir(miCuenta, 200);
            System.out.println("Saldo restante: $" + miCuenta.saldo);
        }
}
