package ParteF_VariasFormasConstruir.Ejercicio_30;

import ParteF_VariasFormasConstruir.Ejercicio_29.Estudiante;

public class PruebaEstudiante {
    public static void main(String[] args) {
        // Uso del constructor vacío
        Estudiante e1 = new Estudiante();

        // Uso del constructor con nombre y código
        Estudiante e2 = new Estudiante("Laura Perez", "1526");

        // Uso del constructor con nombre, código y semestre
        Estudiante e3 = new Estudiante("Mateo Rios", "5846", 4);

        e1.mostrarInfo();
        e2.mostrarInfo();
        e3.mostrarInfo();
    }
}
