package Models;

public class TarifaResidencial extends Tarifa {
    private float contribMunicipal;

    public TarifaResidencial(float valorKwh, float iva, float contribMunicipal) {
        super(valorKwh, iva);
        this.contribMunicipal = contribMunicipal;
    }

    @Override
    public float calcularTarifa(int consumo) {
        float base = consumo * valorKwh;
        return base + base * iva + base * contribMunicipal;
    }
}