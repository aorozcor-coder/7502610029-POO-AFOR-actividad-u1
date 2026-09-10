package ParteA_Clases.Ejercicio_05;

public class Mascota {
    public String nombre;
    public String especie;
    public int edad;

    public void mostrarMascota() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad + " años");
    }

    //ParteC: Ejercicio 18
    public void cumplirAnios() {
        this.edad++;
    }
}
