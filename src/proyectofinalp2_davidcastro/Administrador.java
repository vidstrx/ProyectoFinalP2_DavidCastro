
package proyectofinalp2_davidcastro;

public class Administrador extends Usuario {

    public Administrador(String nombre, String contrasena) {
        super(nombre, contrasena);
    }

    @Override
    public String toString() {
        return "Administrador: " + nombre;
    }
    
}
