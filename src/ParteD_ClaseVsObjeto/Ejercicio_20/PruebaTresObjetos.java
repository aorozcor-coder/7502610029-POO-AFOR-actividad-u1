package ParteD_ClaseVsObjeto.Ejercicio_20;

public class PruebaTresObjetos {
    public static void main(String[] args) {
        Celular c1 = new Celular("Apple", "IPhone 15", 128);
        Celular c2 = new Celular("Samsung", "Galaxy S24", 256);
        Celular c3 = new Celular("Xiaomi", "Redmi Note 13", 256);
        /*
         * EXPLICACIÓN EJERCICIO 20:
         *
         * ¿QUÉ COMPARTEN?
         * Comparten la misma estructura (los atributos marca, modelo y almacenamientoGB)
         * definida dentro del molde/plantilla que es la clase Celular.
         *
         * ¿EN QUÉ SE DIFERENCIAN?
         * Se diferencian en su identidad (cada objeto c1, c2 y c3 ocupa un lugar distinto en memoria RAM)
         * y en su ESTADO, que son los valores específicos guardados en sus atributos (ej: marca, modelo y capacidad).
         */
        System.out.println("Celular 1: " + c1.marca + " " + c1.modelo + " (" + c1.almacenamiento + "GB)");
        System.out.println("Celular 2: " + c2.marca + " " + c2.modelo + " (" + c2.almacenamiento + "GB)");
        System.out.println("Celular 3: " + c3.marca + " " + c3.modelo + " (" + c3.almacenamiento + "GB)");
    }
}
