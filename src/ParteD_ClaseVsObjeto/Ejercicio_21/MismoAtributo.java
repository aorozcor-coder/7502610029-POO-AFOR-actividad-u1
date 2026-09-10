package ParteD_ClaseVsObjeto.Ejercicio_21;

public class MismoAtributo {
    public static void main(String[] args) {

        Computador pc1 = new Computador("Lenovo", "Intel Core i7", 16);
        Computador pc2 = new Computador("ASUS", "AMD Ryzen 5", 16);

        // pc1 y pc2 comparten ÚNICAMENTE el mismo valor en 'ram' (16 GB)

        System.out.println("PC 1: " + pc1.marca + " | Procesador: " + pc1.procesador + " | RAM: " + pc1.ram + "GB");
        System.out.println("PC 2: " + pc2.marca + " | Procesador: " + pc2.procesador + " | RAM: " + pc2.ram + "GB");
    }
}
