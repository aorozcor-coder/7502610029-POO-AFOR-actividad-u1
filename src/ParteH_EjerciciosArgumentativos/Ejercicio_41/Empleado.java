package ParteH_EjerciciosArgumentativos.Ejercicio_41;

public class Empleado {
    String nombre;
    String cargo;
    double salario;

    public Empleado(String nombre, String cargo, double salario) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
    }

    public void mostrarInfo() {
        System.out.println("Empleado: " + nombre + " | Cargo: " + cargo + " | Salario: $" + salario);
    }

    public static void main(String[] args) {
        Empleado emp1 = new Empleado("Ana Torres", "Desarrolladora", 4500000.0);
        emp1.mostrarInfo();

        /*
         * EXPLICACIÓN EJERCICIO 41:
         *
         * Modelar a un Empleado con POO (clase y objetos) es superior al uso de variables sueltas
         * en programación estructurada porque agrupa los datos (nombre, cargo, salario) y sus
         * comportamientos (mostrarInfo) en una sola unidad lógica encapsulada. Con variables sueltas
         * (ej. String nombre1, nombre2; double salario1, salario2), la información queda desvinculada,
         * el código se vuelve difícil de escalar cuando crecen los registros y se incrementa el riesgo
         * de inconsistencia de datos al manipularlos de forma aislada.
         */
    }
}
