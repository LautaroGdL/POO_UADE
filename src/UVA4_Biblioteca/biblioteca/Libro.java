package UVA4_Biblioteca.biblioteca;

public class Libro implements Comparable<Libro> {
    private String titulo;
    private String autor;
    private int anioDePublicacion;
    private int isbn;

    public Libro(String titulo, String autor, int anioDePublicacion, int isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioDePublicacion = anioDePublicacion;
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioDePublicacion() {
        return anioDePublicacion;
    }

    public void setAnioDePublicacion(int anioDePublicacion) {
        this.anioDePublicacion = anioDePublicacion;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return titulo + " - " + autor + " - " + anioDePublicacion + " - " + isbn;
    }

    @Override
    public int compareTo(Libro otroLibro) {
        return this.titulo.compareTo(otroLibro.getTitulo());
    }
}
