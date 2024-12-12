
package proyectofinalp2_davidcastro;

import java.awt.Color;
import java.io.Serializable;

public class Usuario implements Serializable{
    protected String nombre;
    protected String contrasena;
    
    protected int tamanoLabel;
    protected int estiloLabel;
    protected String fuenteLabel;
    protected Color colorLabel;
    
    protected int tamanoLabelTitulo;
    protected int estiloLabelTitulo;
    protected String fuenteLabelTitulo;
    protected Color colorLabelTitulo;
    
    protected Color colorNavbar;
    protected Color colorLetraNavbar;
    protected Color colorFondo;
    protected String rutaImagen = "";

    public Usuario(String nombre, String contrasena, int tamanoLabel, int estiloLabel, String fuenteLabel, Color colorLabel, int tamanoLabelTitulo, int estiloLabelTitulo, String fuenteLabelTitulo, Color colorLabelTitulo, Color colorNavbar, Color colorLetraNavbar, Color colorFondo, String rutaImagen) {
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.tamanoLabel = tamanoLabel;
        this.estiloLabel = estiloLabel;
        this.fuenteLabel = fuenteLabel;
        this.colorLabel = colorLabel;
        this.tamanoLabelTitulo = tamanoLabelTitulo;
        this.estiloLabelTitulo = estiloLabelTitulo;
        this.fuenteLabelTitulo = fuenteLabelTitulo;
        this.colorLabelTitulo = colorLabelTitulo;
        this.colorNavbar = colorNavbar;
        this.colorLetraNavbar = colorLetraNavbar;
        this.colorFondo = colorFondo;
        this.rutaImagen = rutaImagen;
    }
    
    
    public Usuario(String nombre, String contrasena) {
        this.nombre = nombre;
        this.contrasena = contrasena;
    }

    public Usuario() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public int getTamanoLabel() {
        return tamanoLabel;
    }

    public void setTamanoLabel(int tamanoLabel) {
        this.tamanoLabel = tamanoLabel;
    }

    public int getEstiloLabel() {
        return estiloLabel;
    }

    public void setEstiloLabel(int estiloLabel) {
        this.estiloLabel = estiloLabel;
    }

    public String getFuenteLabel() {
        return fuenteLabel;
    }

    public void setFuenteLabel(String fuenteLabel) {
        this.fuenteLabel = fuenteLabel;
    }

    public Color getColorLabel() {
        return colorLabel;
    }

    public void setColorLabel(Color colorLabel) {
        this.colorLabel = colorLabel;
    }

    public int getTamanoLabelTitulo() {
        return tamanoLabelTitulo;
    }

    public void setTamanoLabelTitulo(int tamanoLabelTitulo) {
        this.tamanoLabelTitulo = tamanoLabelTitulo;
    }

    public int getEstiloLabelTitulo() {
        return estiloLabelTitulo;
    }

    public void setEstiloLabelTitulo(int estiloLabelTitulo) {
        this.estiloLabelTitulo = estiloLabelTitulo;
    }

    public String getFuenteLabelTitulo() {
        return fuenteLabelTitulo;
    }

    public void setFuenteLabelTitulo(String fuenteLabelTitulo) {
        this.fuenteLabelTitulo = fuenteLabelTitulo;
    }

    public Color getColorLabelTitulo() {
        return colorLabelTitulo;
    }

    public void setColorLabelTitulo(Color colorLabelTitulo) {
        this.colorLabelTitulo = colorLabelTitulo;
    }

    public Color getColorNavbar() {
        return colorNavbar;
    }

    public void setColorNavbar(Color colorNavbar) {
        this.colorNavbar = colorNavbar;
    }

    public Color getColorLetraNavbar() {
        return colorLetraNavbar;
    }

    public void setColorLetraNavbar(Color colorLetraNavbar) {
        this.colorLetraNavbar = colorLetraNavbar;
    }

    public Color getColorFondo() {
        return colorFondo;
    }

    public void setColorFondo(Color colorFondo) {
        this.colorFondo = colorFondo;
    }

    public String getRutaImagen() {
        return rutaImagen;
    }

    public void setRutaImagen(String rutaImagen) {
        this.rutaImagen = rutaImagen;
    }
}
