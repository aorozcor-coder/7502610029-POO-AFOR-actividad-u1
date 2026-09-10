package ParteA_Clases.Ejercicio_01;

public class Estudiante {
    public String nombre;
    public String codigo;
    public int semestre;

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Código: " + codigo);
        System.out.println("Semestre: " + semestre);
    }

    //ParteC: Ejercicio 17
    public void cambiarSemestre(int nuevoSemestre) {
        if (nuevoSemestre > 0) {
            this.semestre = nuevoSemestre;
        }
    }
}

