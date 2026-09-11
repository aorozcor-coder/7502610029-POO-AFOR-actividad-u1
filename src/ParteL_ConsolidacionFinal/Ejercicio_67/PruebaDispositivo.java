package ParteL_ConsolidacionFinal.Ejercicio_67;

public class PruebaDispositivo {
    public static void main(String[] args) {
        System.out.println("\n--- 5 OBJETOS DISPOSITIVO HOGAR ---");
        Electrodomestico d1 = new Electrodomestico("Televisor", "Sala", true);
        Electrodomestico d2 = new Electrodomestico("Aire Acondicionado", "Habitación", false);
        Electrodomestico d3 = new Electrodomestico("Lámpara de Noche", "Dormitorio", true);
        Electrodomestico d4 = new Electrodomestico("Cafetera", "Cocina", false);
        Electrodomestico d5 = new Electrodomestico("Ventilador", "Estudio", true);
        d1.mostrarEstado();
        d2.mostrarEstado();
        d3.mostrarEstado();
        d4.mostrarEstado();
        d5.mostrarEstado();
    }
}