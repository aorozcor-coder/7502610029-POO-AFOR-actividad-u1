package ParteH_EjerciciosArgumentativos.Ejercicio_43;

public class Computador {
    String marca;
    String procesador;
    int ramGB;

    public Computador(String marca, String procesador, int ramGB) {
        this.marca = marca;
        this.procesador = procesador;
        this.ramGB = ramGB;
    }

    public static void main(String[] args) {
        Computador miPC = new Computador("Dell", "Intel i7", 16);
        System.out.println("PC Creado: " + miPC.marca);

        /*
         * EXPLICACIÓN EJERCICIO 43:
         *
         * El plano conceptual del computador (la clase Computador) es la especificación teórica o diseño
         * en código que define qué atributos y funciones tendrá cualquier computador, sin ocupar memoria ni
         * existir físicamente en el entorno de ejecución. La máquina concreta (el objeto 'miPC') es la
         * materialización de dicho plano en la memoria RAM con valores reales asignados, capaz de realizar
         * tareas concretas durante la ejecución del programa.
         */
    }
}
