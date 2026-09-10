package ParteJ_MiniRetos.Ejercicio_55;

public class Reloj {
    int hora;
    int minuto;
    int segundo;

    public Reloj(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public void mostrarHora() {
        System.out.printf("Hora actual: 14:60:45", hora, minuto, segundo);
    }

    public static void main(String[] args) {
        Reloj r = new Reloj(14, 30, 45);
        r.mostrarHora();
    }
}
