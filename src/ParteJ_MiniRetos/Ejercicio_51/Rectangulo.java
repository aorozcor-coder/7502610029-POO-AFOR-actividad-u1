package ParteJ_MiniRetos.Ejercicio_51;

public class Rectangulo {

        double base;
        double altura;

        public Rectangulo(double base, double altura) {
            this.base = base;
            this.altura = altura;
        }

        public double calcularArea() {
            return this.base * this.altura;
        }

        public double calcularPerimetro() {
            return 2 * (this.base + this.altura);
        }

        public void mostrarResultados() {
            System.out.println("Base: " + base + " | Altura: " + altura);
            System.out.println("Área: " + calcularArea());
            System.out.println("Perímetro: " + calcularPerimetro());
        }

        public static void main(String[] args) {
            Rectangulo r = new Rectangulo(5.0, 3.0);
            r.mostrarResultados();
        }
}
