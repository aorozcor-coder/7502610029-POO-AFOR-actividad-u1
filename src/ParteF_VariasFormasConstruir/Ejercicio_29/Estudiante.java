package ParteF_VariasFormasConstruir.Ejercicio_29;

public class Estudiante {
    String nombre;
    String codigo;
    int semestre;

    //Constructor vacio
    public Estudiante() {
    }

    //Constructor con dos parametros
    public Estudiante(String nombre, String codigo){
        this.nombre = nombre;
        this.codigo = codigo;
    }

    //Constructor con tres parametros y uso de this()
    public Estudiante(String nombre, String codigo, int semestre){
        this(nombre, codigo);
        this.semestre = semestre;
    }

    //Mostrar
    public void mostrarInfo() {
        System.out.println("Estudiante: " + nombre + " | Código: " + codigo + " | Semestre: " + semestre);
    }
}
