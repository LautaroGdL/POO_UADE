package BibliotecaSwing.modelo;

import java.io.Serializable;
import java.time.LocalDate;

public class Trasanccion implements Serializable {
    private Libro libro;
    private Usuario usuario;
    private LocalDate fecha;
    private boolean esPrestamo;

    public Trasanccion(Libro libro, Usuario usuario, boolean esPrestamo) {
        this.libro = libro;
        this.usuario = usuario;
        this.esPrestamo = esPrestamo;
        this.fecha = LocalDate.now();
    }

    // Getters y Setters


    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public boolean isEsPrestamo() {
        return esPrestamo;
    }

    public void setEsPrestamo(boolean esPrestamo) {
        this.esPrestamo = esPrestamo;
    }
}

