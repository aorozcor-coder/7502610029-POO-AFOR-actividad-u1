package ParteH_EjerciciosArgumentativos.Ejercicio_44;

public class Paciente {
    String nombre;
    int edad;
    String diagnostico;

    public Paciente(String nombre, int edad, String diagnostico) {
        this.nombre = nombre;
        this.edad = edad;
        this.diagnostico = diagnostico;
    }

    public static void main(String[] args) {
        Paciente paciente1 = new Paciente("Carlos Ruiz", 45, "Hipertensión");
        System.out.println("Paciente: " + paciente1.nombre);

        /*
         * EXPLICACIÓN EJERCICIO 44:
         *
         * "Crear un paciente" es una idea del MUNDO REAL (lenguaje de la vida cotidiana):
         * se refiere al acto de admitir a un ser humano como usuario en un centro médico.
         *
         * "Instanciar la clase Paciente" es un concepto TÉCNICO DE SOFTWARE (lenguaje del programador):
         * se refiere a la orden que le damos al sistema (usando 'new Paciente()') para que reserve
         * un espacio en la memoria RAM del computador y cree la estructura de datos correspondiente.
         *
         * Se relacionan porque el software intenta representar la realidad, pero no son lo mismo:
         * la instancia en memoria es solo una representación digital, no el paciente real.
         */
    }
}