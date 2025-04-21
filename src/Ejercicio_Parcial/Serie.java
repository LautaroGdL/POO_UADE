package Ejercicio_Parcial;

public class Serie {

    private String titulo;
    private int cantidadTemporadas = 1;
    private boolean entregado = false;
    private String genero = "Drama";
    private String creador;

    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
    }

    public Serie(String titulo, int cantidadTemporadas, String genero, String creador) {
        this.titulo = titulo;
        this.cantidadTemporadas = cantidadTemporadas;
        this.genero = genero;
        this.creador = creador;
    }

    public String getTitulo() { return titulo; }
    public int getCantidadTemporadas() { return cantidadTemporadas; }
    public boolean isEntregado() { return entregado; }
    public String getGenero() { return genero; }
    public String getCreador() { return creador; }

    public void setTitulo(String titulo) { this.titulo = titulo; }
    public void setCantidadTemporadas(int cantidadTemporadas) { this.cantidadTemporadas = cantidadTemporadas; }
    public void setGenero(String genero) { this.genero = genero; }
    public void setCreador(String creador) { this.creador = creador; }

    public void entregar() {
        this.entregado = true;
    }

    public void devolver() {
        this.entregado = false;
    }

    public boolean estaEntregado() {
        return entregado;
    }

    public boolean tieneMasTemporadasQue(Serie otra) {
        return this.cantidadTemporadas > otra.cantidadTemporadas;
    }

}
