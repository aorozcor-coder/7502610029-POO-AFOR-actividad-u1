package ParteI_LecturaYCorreccion.Ejercicio_46;


    /*
     * 1. CÓDIGO ERRADO:
     *
     * public class {
     *     String titulo;
     *
     *     public void mostrar() {
     *         System.out.println(titulo);
     *     }
     * }
     *
     * 2. EXPLICACIÓN DEL ERROR DEL COMPILADOR:
     * El compilador de Java genera el error: "<identifier> expected".
     * La palabra reservada 'class' exige inmediatamente después un nombre o identificador válido
     * que defina la plantilla. Sin este nombre, Java no puede registrar el tipo de dato ni el
     * constructor de la entidad.
     */

    // 3. CÓDIGO CORREGIDO:
    public class FaltaNombreClase { // Se asigna el identificador explícito 'FaltaNombreClase'
        String titulo;

        public void mostrar() {
            System.out.println("Título: " + titulo);
        }

        public static void main(String[] args) {
            FaltaNombreClase objeto = new FaltaNombreClase();
            objeto.titulo = "Aprendiendo Java";
            objeto.mostrar();
        }
}
