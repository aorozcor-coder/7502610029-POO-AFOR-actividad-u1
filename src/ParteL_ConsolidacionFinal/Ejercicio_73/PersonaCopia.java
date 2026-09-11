package ParteL_ConsolidacionFinal.Ejercicio_73;

public class PersonaCopia {
    String nombre;
    int edad;

    // Constructor parametrizado
    public PersonaCopia(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Constructor Copia
    public PersonaCopia(PersonaCopia otraPersona) {
        this.nombre = otraPersona.nombre;
        this.edad = otraPersona.edad;
    }

    public void mostrarInfo() {
        System.out.println("Persona: " + nombre + " | Edad: " + edad);
    }

    public static void main(String[] args) {
        PersonaCopia original = new PersonaCopia("Carlos", 20);
        PersonaCopia duplicado = new PersonaCopia(original);

        original.mostrarInfo();
        duplicado.mostrarInfo();
    }
}
