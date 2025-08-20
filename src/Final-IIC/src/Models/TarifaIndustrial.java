package Models;

public class TarifaIndustrial extends Tarifa {
    private float iibb;

    public TarifaIndustrial(float valorKwh, float iva, float iibb) {
        super(valorKwh, iva);
        this.iibb = iibb;
    }

    @Override
    public float calcularTarifa(int consumo) {
        float base = consumo * valorKwh;
        return base + base * iva + base * iibb;
    }
}