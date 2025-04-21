package Ejercicio_Parcial;

public class Libro {

    private String titulo;
    private String autor;
    private int numeroEjemplares;
    private int numeroEjemplaresPrestados;

    public Libro(String titulo, String autor, int numeroEjemplares) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroEjemplares = numeroEjemplares;
    }

    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public int getNumeroEjemplares() { return numeroEjemplares; }
    public int getNumeroEjemplaresPrestados() { return numeroEjemplaresPrestados; }

    public boolean prestar() {
        if (numeroEjemplaresPrestados < numeroEjemplares) {
            numeroEjemplaresPrestados++;
            return true;
        }
        return false;
    }

    public boolean devolver() {
        if (numeroEjemplaresPrestados > 0) {
            numeroEjemplaresPrestados--;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("%s por %s - Disponibles: %d - Prestados: %d",
                titulo, autor, numeroEjemplares - numeroEjemplaresPrestados, numeroEjemplaresPrestados);
    }

}
