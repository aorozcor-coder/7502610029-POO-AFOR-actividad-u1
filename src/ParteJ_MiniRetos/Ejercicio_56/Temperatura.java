package ParteJ_MiniRetos.Ejercicio_56;

public class Temperatura {
        double celsius;

        public Temperatura(double celsius) {
            this.celsius = celsius;
        }

        public double obtenerFahrenheit() {
            return (this.celsius * 9 / 5) + 32;
        }

        public void mostrarConversion() {
            System.out.println(celsius + " °C equivalen a " + obtenerFahrenheit() + " °F");
        }

        public static void main(String[] args) {
            Temperatura t = new Temperatura(25.0);
            t.mostrarConversion();
        }
}
