package Models;

public class Medicion {
    private int año;
    private int bimestre;
    private int lectura;

    public Medicion(int año, int bimestre, int lectura) {
        this.año = año;
        this.bimestre = bimestre;
        this.lectura = lectura;
    }

    public int getLectura() { return lectura; }
    public int getAño() { return año; }
    public int getBimestre() { return bimestre; }
}
