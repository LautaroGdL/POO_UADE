package Models;

public class Factura {
    private Usuario usuario;
    private int consumo;
    private float montoTotal;

    public Factura(Usuario usuario, int consumo, float montoTotal) {
        this.usuario = usuario;
        this.consumo = consumo;
        this.montoTotal = montoTotal;
    }

    public int getConsumo() { return consumo; }
    public float getMontoTotal() { return montoTotal; }
}