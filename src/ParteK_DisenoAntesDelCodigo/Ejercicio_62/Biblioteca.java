package ParteK_DisenoAntesDelCodigo.Ejercicio_62;

    /*
     * DISEÑO PREVIO DE LA CLASE Biblioteca:
     *
     * 1. ATRIBUTOS:
     *    - nombre (String): Nombre de la institución.
     *    - ciudad (String): Ubicación de la biblioteca.
     *    - totalLibros (int): Cantidad de ejemplares disponibles.
     *
     * 2. MÉTODOS:
     *    - prestarLibro(): Reduce la cantidad de libros disponibles si hay inventario.
     *    - recibirLibro(): Incrementa la cantidad de libros disponibles.
     *    - mostrarEstado(): Muestra los datos y el stock de libros.
     *
     * 3. OBJETOS REALES POSIBLES:
     *    - Biblioteca 1: Biblioteca Luis Ángel Arango | Bogotá | 10000 libros
     *    - Biblioteca 2: Biblioteca Departamental | Cali | 4500 libros
     */

    public class Biblioteca {
        String nombre;
        String ciudad;
        int totalLibros;

        public Biblioteca(String nombre, String ciudad, int totalLibros) {
            this.nombre = nombre;
            this.ciudad = ciudad;
            this.totalLibros = totalLibros;
        }

        public void prestarLibro() {
            if (totalLibros > 0) {
                totalLibros--;
                System.out.println("Libro prestado con éxito de la biblioteca " + nombre);
            } else {
                System.out.println("No hay libros disponibles en " + nombre);
            }
        }

        public void mostrarEstado() {
            System.out.println("Biblioteca: " + nombre + " (" + ciudad + ") | Stock Libros: " + totalLibros);
        }

        public static void main(String[] args) {
            Biblioteca b1 = new Biblioteca("Juan de Dios Amador", "Cartagena", 10000);
            b1.mostrarEstado();
            b1.prestarLibro();
            b1.mostrarEstado();
        }
}
