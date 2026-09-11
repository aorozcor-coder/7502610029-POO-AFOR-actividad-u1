package ParteK_DisenoAntesDelCodigo.Ejercicio_63;

/*
 * DISEÑO PREVIO DE LA CLASE Hospital:
 *
 * 1. ATRIBUTOS:
 *    - nombre (String): Identificador del centro médico.
 *    - camasDisponibles (int): Capacidad de hospitalización libre.
 *    - urgenciasAbiertas (boolean): Estado del servicio de urgencias.
 *
 * 2. MÉTODOS:
 *    - ingresarPaciente(): Reduce en 1 las camas disponibles.
 *    - darAltaPaciente(): Incrementa en 1 las camas disponibles.
 *    - mostrarReporte(): Muestra la capacidad del hospital.
 *
 * 3. OBJETOS REALES POSIBLES:
 *    - Hospital 1: Hospital San Juan de Dios | 50 camas | Urgencias: Abiertas
 *    - Hospital 2: Clínica del Norte | 12 camas | Urgencias: CERRADAS
 */

    public class Hospital {
        String nombre;
        int camasDisponibles;
        boolean urgenciasAbiertas;

        public Hospital(String nombre, int camasDisponibles) {
            this.nombre = nombre;
            this.camasDisponibles = camasDisponibles;
            this.urgenciasAbiertas = true;
        }

        public void ingresarPaciente() {
            if (camasDisponibles > 0) {
                camasDisponibles--;
                System.out.println("Paciente ingresado en " + nombre);
            } else {
                System.out.println("Sin camas disponibles en " + nombre);
            }
        }

        public void mostrarReporte() {
            System.out.println("Hospital: " + nombre + " | Camas Libres: " + camasDisponibles + " | Urgencias: " + (urgenciasAbiertas ? "Abiertas" : "Cerradas"));
        }

        public static void main(String[] args) {
            Hospital h1 = new Hospital("San Juan de Dios", 50);
            h1.mostrarReporte();
            h1.ingresarPaciente();
            h1.mostrarReporte();
        }
}
