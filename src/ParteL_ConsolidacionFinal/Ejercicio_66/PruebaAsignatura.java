package ParteL_ConsolidacionFinal.Ejercicio_66;

public class PruebaAsignatura {
    public static class Main {
        public static void main(String[] args) {

            System.out.println("--- 5 OBJETOS ASIGNATURA UNI ---");
            AsignaturaUni a1 = new AsignaturaUni("Programación Orientada a Objetos", "POO-01", 3);
            AsignaturaUni a2 = new AsignaturaUni("Cálculo Integral", "MAT-02", 4);
            AsignaturaUni a3 = new AsignaturaUni("Estructura de Datos", "ED-03", 3);
            AsignaturaUni a4 = new AsignaturaUni("Bases de Datos", "BD-04", 3);
            AsignaturaUni a5 = new AsignaturaUni("Ingeniería de Software", "IS-05", 3);
            a1.mostrarInfo();
            a2.mostrarInfo();
            a3.mostrarInfo();
            a4.mostrarInfo();
            a5.mostrarInfo();
        }
    }
}