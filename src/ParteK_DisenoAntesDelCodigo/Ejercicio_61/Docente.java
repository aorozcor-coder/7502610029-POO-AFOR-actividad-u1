package ParteK_DisenoAntesDelCodigo.Ejercicio_61;


    /*
     * DISEÑO PREVIO DE LA CLASE Docente:
     *
     * 1. ATRIBUTOS:
     *    - nombre (String): Nombre del docente.
     *    - especialidad (String): Área de conocimiento o asignatura principal.
     *    - horasSemanales (int): Carga horaria asignada por semana.
     *
     * 2. MÉTODOS:
     *    - impartirClase(): Muestra un mensaje indicando que el docente está enseñando.
     *    - registrarHoras(int horas): Incrementa o asigna horas de trabajo.
     *    - mostrarFicha(): Imprime la información básica del docente.
     *
     * 3. OBJETOS REALES POSIBLES:
     *    - Docente 1: John Arrieta | Especialidad: POO | Horas: 20
     *    - Docente 2: María Morales | Especialidad: Bases de Datos | Horas: 16
     */

    public class Docente {
        String nombre;
        String especialidad;
        int horasSemanales;

        public Docente(String nombre, String especialidad, int horasSemanales) {
            this.nombre = nombre;
            this.especialidad = especialidad;
            this.horasSemanales = horasSemanales;
        }

        public void impartirClase() {
            System.out.println("El docente " + nombre + " está impartiendo clase de " + especialidad);
        }

        public void mostrarFicha() {
            System.out.println("Docente: " + nombre + " | Área: " + especialidad + " | Horas/semana: " + horasSemanales);
        }

        public static void main(String[] args) {
            Docente d1 = new Docente("John Arrieta", "POO", 20);
            Docente d2 = new Docente("María Morales", "Bases de Datos", 16);

            d1.mostrarFicha();
            d1.impartirClase();
            d2.mostrarFicha();
        }
}
