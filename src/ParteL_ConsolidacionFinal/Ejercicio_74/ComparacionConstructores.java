package ParteL_ConsolidacionFinal.Ejercicio_74;

public class ComparacionConstructores {
    public static void main(String[] args) {
        /*
         * COMPARACIÓN ARGUMENTATIVA DE FORMAS DE CONSTRUCCIÓN - EJERCICIO 74:
         *
         * 1. Constructor Vacío:
         *    - Ventaja: Simple de entender inicialmente.
         *    - Desventaja: Deja el objeto con atributos 'null' o en 0, obligando a asignar valor
         *      atributo por atributo posteriormente, lo que incrementa el riesgo de dejar objetos inconsistentes.
         *
         * 2. Constructor con Parámetros:
         *    - Ventaja: Garantiza la integridad total del objeto desde su nacimiento en una sola línea.
         *    - ARGUMENTO PARA PRINCIPIANTES: Es la forma MÁS CLARA y RECOMENDABLE, ya que refleja
         *      la idea de que un objeto nace completo y listo para operar sin pasos intermedios.
         *
         * 3. Constructor Copia:
         *    - Ventaja: Útil para duplicar estados de objetos existentes sin afectar al original.
         *    - Desventaja: Requiere un objeto previo existente, por lo que su caso de uso es más específico.
         */
        System.out.println("Argumentación de comparación de constructores lista.");
    }
}
