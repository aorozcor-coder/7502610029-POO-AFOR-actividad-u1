package ParteL_ConsolidacionFinal.Ejercicio_69;

import ParteL_ConsolidacionFinal.Ejercicio_66.AsignaturaUni;
import ParteL_ConsolidacionFinal.Ejercicio_67.Electrodomestico;
import ParteL_ConsolidacionFinal.Ejercicio_68.PedidoRestaurante;

public class ConsolidacionObjetos {
    public static void main(String[] args) {
        // Ejercicio 69: 5 objetos de AsignaturaUni
        System.out.println("--- 5 OBJETOS ASIGNATURA UNI ---");
        AsignaturaUni a1 = new AsignaturaUni("Programación Orientada a Objetos", "POO-01", 3);
        AsignaturaUni a2 = new AsignaturaUni("Cálculo Integral", "MAT-02", 4);
        AsignaturaUni a3 = new AsignaturaUni("Estructura de Datos", "ED-03", 3);
        AsignaturaUni a4 = new AsignaturaUni("Bases de Datos", "BD-04", 3);
        AsignaturaUni a5 = new AsignaturaUni("Ingeniería de Software", "IS-05", 3);
        a1.mostrarInfo(); a2.mostrarInfo(); a3.mostrarInfo(); a4.mostrarInfo(); a5.mostrarInfo();

        // Ejercicio 69: 5 objetos de Electrodomestico
        System.out.println("\n--- 5 OBJETOS DISPOSITIVO HOGAR ---");
        Electrodomestico d1 = new Electrodomestico("Televisor", "Sala", true);
        Electrodomestico d2 = new Electrodomestico("Aire Acondicionado", "Habitación", false);
        Electrodomestico d3 = new Electrodomestico("Lámpara de Noche", "Dormitorio", true);
        Electrodomestico d4 = new Electrodomestico("Cafetera", "Cocina", false);
        Electrodomestico d5 = new Electrodomestico("Ventilador", "Estudio", true);
        d1.mostrarEstado(); d2.mostrarEstado(); d3.mostrarEstado(); d4.mostrarEstado(); d5.mostrarEstado();

        // Ejercicio 69: 5 objetos de PedidoRestaurante
        System.out.println("\n--- 5 OBJETOS PEDIDO RESTAURANTE ---");
        PedidoRestaurante p1 = new PedidoRestaurante(101, "Hamburguesa Doble", 25000.0);
        PedidoRestaurante p2 = new PedidoRestaurante(102, "Pizza Hawaiana", 30000.0);
        PedidoRestaurante p3 = new PedidoRestaurante(103, "Perro Caliente Especial", 18000.0);
        PedidoRestaurante p4 = new PedidoRestaurante(104, "Ensalada César", 22000.0);
        PedidoRestaurante p5 = new PedidoRestaurante(105, "Desgranado de Pollo", 28000.0);
        p1.mostrarDetalle(); p2.mostrarDetalle(); p3.mostrarDetalle(); p4.mostrarDetalle(); p5.mostrarDetalle();
    }
}
