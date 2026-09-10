package ParteI_LecturaYCorreccion.Ejercicio_48;


    /*
     * 1. CÓDIGO ERRADO:
     *
     * public class AtributoVsVariableLocal {
     *     String usuario;
     *
     *     public void registrar() {
     *         String usuario = "Juan"; // Variable local opaca al atributo
     *     }
     *
     *     public void mostrar() {
     *         System.out.println("Usuario: " + usuario); // Imprime 'null'
     *     }
     * }
     *
     * 2. EXPLICACIÓN DEL ERROR DEL COMPILADOR / LÓGICO:
     * Aunque puede compilar, existe un error de ocultamiento (shadowing). Declarar 'String usuario'
     * dentro del método 'registrar()' crea una nueva variable local en el stack que muere al terminar
     * el método, dejando el atributo de instancia 'this.usuario' con su valor por defecto ('null').
     */

    // 3. CÓDIGO CORREGIDO:
    public class AtributoVsVariableLocal {
        String usuario; // Atributo de la clase

        public void registrar(String usuario) {
            // Se usa 'this' para asignar directamente el valor al atributo del objeto
            this.usuario = usuario;
        }

        public void mostrar() {
            System.out.println("Usuario: " + usuario);
        }

        public static void main(String[] args) {
            AtributoVsVariableLocal app = new AtributoVsVariableLocal();
            app.registrar("Juan");
            app.mostrar();
        }
}
