
package proyectofinalp2_davidcastro;

public class Invitado extends Usuario {

    public Invitado(String nombre, String contrasena) {
        super(nombre, contrasena);
    }

    @Override
    public String toString() {
        return "Invitado: " + nombre;
    }
    
}
