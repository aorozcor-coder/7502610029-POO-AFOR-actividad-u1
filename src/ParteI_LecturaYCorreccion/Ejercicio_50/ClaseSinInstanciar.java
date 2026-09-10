package ParteI_LecturaYCorreccion.Ejercicio_50;


    /*
     * 1. CÓDIGO ERRADO:
     *
     * public class ClaseSinInstanciar {
     *     public void ejecutarTarea() {
     *         System.out.println("Tarea ejecutada con éxito.");
     *     }
     *
     *     public static void main(String[] args) {
     *         // El método main está vacío o solo tiene comentarios.
     *         // Nunca se crea el objeto ni se llaman sus métodos.
     *     }
     * }
     *
     * 2. EXPLICACIÓN DEL ERROR LÓGICO / DE EJECUCIÓN:
     * El programa compila sin errores, pero al ejecutarse finaliza de inmediato sin realizar
     * ninguna acción ni mostrar nada en pantalla. Las clases son solo planos; si no se instancian
     * dentro de un punto de entrada activo, no existe objeto en memoria que pueda ejecutar la lógica.
     */

    // 3. CÓDIGO CORREGIDO:
    public class ClaseSinInstanciar {
        public void ejecutarTarea() {
            System.out.println("Tarea ejecutada con éxito.");
        }

        public static void main(String[] args) {
            // Se construye el objeto dentro de main y se invoca su funcionalidad
            ClaseSinInstanciar instancia = new ClaseSinInstanciar();
            instancia.ejecutarTarea();
        }
}
