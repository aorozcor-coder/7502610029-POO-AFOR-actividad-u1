package ParteK_DisenoAntesDelCodigo.Ejercicio_65;

    /*
     * DISEÑO PREVIO DE LA CLASE EquipoDeFutbol:
     *
     * 1. ATRIBUTOS:
     *    - nombre (String): Nombre del club deportivo.
     *    - ciudad (String): Sede principal del equipo.
     *    - puntos (int): Puntuación acumulada en el torneo.
     *
     * 2. MÉTODOS:
     *    - ganarPartido(): Suma 3 puntos a la tabla.
     *    - empatarPartido(): Suma 1 punto a la tabla.
     *    - mostrarTabla(): Muestra los puntos actuales del club.
     *
     * 3. OBJETOS REALES POSIBLES:
     *    - Equipo 1: Atlético Nacional | Medellín | Puntos: 12
     *    - Equipo 2: Real Cartagena | Cartagena | Puntos: 18
     */

    public class EquipoDeFutbol {
        String nombre;
        String ciudad;
        int puntos;

        public EquipoDeFutbol(String nombre, String ciudad) {
            this.nombre = nombre;
            this.ciudad = ciudad;
            this.puntos = 0;
        }

        public void ganarPartido() {
            this.puntos += 3;
        }

        public void empatarPartido() {
            this.puntos += 1;
        }

        public void mostrarTabla() {
            System.out.println("Equipo: " + nombre + " (" + ciudad + ") | Puntos: " + puntos);
        }

        public static void main(String[] args) {
            EquipoDeFutbol eq1 = new EquipoDeFutbol("Real Cartagena", "Cartagena");
            eq1.mostrarTabla();
            eq1.ganarPartido();
            eq1.empatarPartido();
            eq1.mostrarTabla();
        }
}
