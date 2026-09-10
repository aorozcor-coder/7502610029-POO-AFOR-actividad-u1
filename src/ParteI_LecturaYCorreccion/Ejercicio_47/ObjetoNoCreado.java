package ParteI_LecturaYCorreccion.Ejercicio_47;


    /*
     * 1. CÓDIGO ERRADO:
     *
     * public class ObjetoNoCreado {
     *     String mensaje = "Hola Mundo";
     *
     *     public static void main(String[] args) {
     *         ObjetoNoCreado obj;
     *         System.out.println(obj.mensaje);
     *     }
     * }
     *
     * 2. EXPLICACIÓN DEL ERROR DEL COMPILADOR:
     * El compilador arroja el error: "variable obj might not have been initialized".
     * Se declaró la variable de referencia 'obj', pero no apunta a ninguna dirección de memoria
     * porque jamás se utilizó la palabra clave 'new' para construir el objeto. Si la variable
     * fuera un atributo de clase con valor 'null', al ejecutar arrojaría un 'NullPointerException'.
     */

    // 3. CÓDIGO CORREGIDO:
    public class ObjetoNoCreado {
        String mensaje = "Hola Mundo";

        public static void main(String[] args) {
            // Se construye formalmente la instancia con 'new'
            ObjetoNoCreado obj = new ObjetoNoCreado();
            System.out.println(obj.mensaje);
        }
}
