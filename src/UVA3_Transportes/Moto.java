package UVA3_Transportes;

public class Moto extends VehiculoMotorizado {
    private boolean tieneSidecar;

    public Moto(String marca, double velocidad, String tipoDeMotor, boolean tieneSidecar) {
        super(marca, velocidad, tipoDeMotor);
        this.tieneSidecar = tieneSidecar;
    }

    @Override
    public String desplazar() {
        return "Moto " + marca + " desplazándose a " + velocidad + " km/h";
    }

    public boolean tieneSidecar() {
        return tieneSidecar;
    }
} 