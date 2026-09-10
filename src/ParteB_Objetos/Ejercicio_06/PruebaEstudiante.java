package ParteB_Objetos.Ejercicio_06;

import ParteA_Clases.Ejercicio_01.Estudiante;

public class PruebaEstudiante {
    public static void main(String[] args) {

        Estudiante est = new Estudiante();


        est.nombre = "Carlos Andrés Gómez";
        est.codigo = "20242005";
        est.semestre = 2;


        System.out.println("--- Información del Estudiante ---");
        est.mostrarInfo();
    }
}
