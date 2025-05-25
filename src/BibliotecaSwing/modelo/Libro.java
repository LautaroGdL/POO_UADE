package BibliotecaSwing.modelo;

import java.io.Serializable;

public class Libro implements Serializable {
    private static final long serialVersionUID = 1L;

    private String titulo;
    private String autor;
    private String categoria;
    private boolean prestado;
    private String usuarioPrestamo;

    public Libro(String titulo, String autor, String categoria) {
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.prestado = false;
        this.usuarioPrestamo = null;
    }

    // Getters y Setters

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getUsuarioPrestamo() {
        return usuarioPrestamo;
    }

    public void setUsuarioPrestamo(String usuarioPrestamo) {
        this.usuarioPrestamo = usuarioPrestamo;
    }

    @Override
    public String toString() {
        return String.format("Título: %s, Autor: %s, Categoría: %s, Prestado: %s%s",
                titulo, autor, categoria,
                prestado ? "Sí" : "No",
                prestado && usuarioPrestamo != null ? ", A: " + usuarioPrestamo : "");
    }
}
