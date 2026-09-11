package ParteL_ConsolidacionFinal.Ejercicio_66;

public class AsignaturaUni {
    String nombre;
    String codigo;
    int creditos;

    public AsignaturaUni(String nombre, String codigo, int creditos) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.creditos = creditos;
    }

    public void mostrarInfo() {
        System.out.println("Materia: " + nombre + " [" + codigo + "] - " + creditos + " Créditos");
    }
}


