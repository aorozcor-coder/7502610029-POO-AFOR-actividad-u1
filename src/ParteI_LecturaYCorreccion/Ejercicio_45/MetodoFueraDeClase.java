package ParteI_LecturaYCorreccion.Ejercicio_45;

    /*
     * 1. CÓDIGO ERRADO:
     *
     * public class Persona {
     *     String nombre;
     * }
     *
     * public void saludar() {
     *     System.out.println("Hola");
     * }
     *
     * 2. EXPLICACIÓN DEL ERROR DEL COMPILADOR:
     * El compilador de Java arroja el error: "class, interface, enum, or record expected".
     * Esto ocurre porque en Java todo el código ejecutable y la definición de métodos DEBEN
     * estar dentro de los bloques de delimitación {} de una clase o interfaz. Ningún método
     * puede existir huérfano en el nivel raíz del archivo fuente.
     */

    // 3. CÓDIGO CORREGIDO:
    public class MetodoFueraDeClase {
        String nombre;

        // El metodo se coloca dentro del cuerpo de la clase
        public void saludar() {
            System.out.println("Hola, mi nombre es " + nombre);
        }

        public static void main(String[] args) {
            MetodoFueraDeClase p = new MetodoFueraDeClase();
            p.nombre = "Carlos";
            p.saludar();
        }
    }

