package ParteJ_MiniRetos.Ejercicio_59;

public class UsuarioSistema {
    String nombreUsuario;
    String clave;
    boolean activo;

    public UsuarioSistema(String nombreUsuario, String clave) {
        this.nombreUsuario = nombreUsuario;
        this.clave = clave;
        this.activo = true;
    }

    public void activar() {
        this.activo = true;
    }

    public void desactivar() {
        this.activo = false;
    }

    public void mostrarEstado() {
        System.out.println("Usuario: " + nombreUsuario + " | Estado: " + (activo ? "Activo" : "Inactivo"));
    }

    public static void main(String[] args) {
        UsuarioSistema user = new UsuarioSistema("admin_juan", "12345");
        user.mostrarEstado();
        user.desactivar();
        user.mostrarEstado();
        user.activar();
        user.mostrarEstado();
    }
}
