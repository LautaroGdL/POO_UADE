public class Televisor {
    private String marca;
    private String modelo;
    private int anio;
    private String tipo;
    private int tamanio;
    private int resolucion;
    private boolean smart;

}

    public Televisor(String marca, String modelo, int anio, String tipo, int tamanio, int resolucion, boolean smart) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.tipo = tipo;
        this.tamanio = tamanio;
        this.resolucion = resolucion;
        this.smart = smart;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSmart() {
        return smart;
    }

    public void setSmart(boolean smart) {
        this.smart = smart;
    }

    public void encenderTelevisor() {
        System.out.println("Encendiendo televisor " + marca + " " + modelo + " - " + anio + " - Tipo: " + tipo + " - " + tamanio + " pulgadas - " + resolucion + "p - Smart: " + (smart ? "Sí" : "No"));
    }