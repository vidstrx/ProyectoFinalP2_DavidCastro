
package proyectofinalp2_davidcastro;

import java.awt.Color;
import java.awt.Image;

public class Invitado extends Usuario {

    public Invitado(String nombre, String contrasena) {
        super(nombre, contrasena);
    }

    public Invitado(String nombre, String contrasena, int tamanoLabel, int estiloLabel, String fuenteLabel, Color colorLabel, int tamanoLabelTitulo, int estiloLabelTitulo, String fuenteLabelTitulo, Color colorLabelTitulo, Color colorNavbar, Color colorLetraNavbar, Color colorFondo, String rutaImagen) {
        super(nombre, contrasena, tamanoLabel, estiloLabel, fuenteLabel, colorLabel, tamanoLabelTitulo, estiloLabelTitulo, fuenteLabelTitulo, colorLabelTitulo, colorNavbar, colorLetraNavbar, colorFondo, rutaImagen);
    }

    @Override
    public String toString() {
        return "Invitado: " + nombre;
    }
    
}
