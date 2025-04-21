package Ejercicio_Parcial;

public class Videojuego {

    private String titulo;
    private int horasEstimadas = 10;
    private boolean entregado = false;
    private String genero;
    private String compania;

    public Videojuego(String titulo, String compania) {
        this.titulo = titulo;
        this.compania = compania;
    }

    public Videojuego(String titulo, int horasEstimadas, String genero, String compania) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.genero = genero;
        this.compania = compania;
    }

    public String getTitulo() { return titulo; }
    public int getHorasEstimadas() { return horasEstimadas; }
    public boolean isEntregado() { return entregado; }
    public String getGenero() { return genero; }
    public String getCompania() { return compania; }

    public void setTitulo(String titulo) { this.titulo = titulo; }
    public void setHorasEstimadas(int horasEstimadas) { this.horasEstimadas = horasEstimadas; }
    public void setGenero(String genero) { this.genero = genero; }
    public void setCompania(String compania) { this.compania = compania; }

    public void entregar() {
        this.entregado = true;
    }

    public void devolver() {
        this.entregado = false;
    }

    public boolean estaEntregado() {
        return entregado;
    }

    public boolean tieneMasHorasQue(Videojuego otro) {
        return this.horasEstimadas > otro.horasEstimadas;
    }

}
