package ParteH_EjerciciosArgumentativos.Ejercicio_42;

public class Curso {
    String nombre;
    String codigo;
    int creditos;

    public Curso(String nombre, String codigo, int creditos) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.creditos = creditos;
    }

    public static void main(String[] args) {
        Curso curso1 = new Curso("Programación Orientada a Objetos", "POO-101", 3);
        Curso curso2 = new Curso("Estructura de Datos", "ED-202", 4);

        System.out.println("Curso 1: " + curso1.nombre);
        System.out.println("Curso 2: " + curso2.nombre);

        /*
         * EXPLICACIÓN EJERCICIO 42:
         *
         * Ambos objetos pertenecen a la misma clase 'Curso' porque comparten exactamente la misma
         * estructura conceptual, las mismas reglas y la misma firma de atributos (nombre, código, créditos)
         * definida en la plantilla. El hecho de que 'curso1' y 'curso2' posean valores específicos distintos
         * en sus atributos solo significa que tienen ESTADOS diferentes, pero responden al mismo tipo de entidad.
         */
    }
}
