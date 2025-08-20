package Models;

public abstract class Tarifa {
    protected float valorKwh;
    protected float iva;

    public Tarifa(float valorKwh, float iva) {
        this.valorKwh = valorKwh;
        this.iva = iva;
    }

    public abstract float calcularTarifa(int consumo);
}