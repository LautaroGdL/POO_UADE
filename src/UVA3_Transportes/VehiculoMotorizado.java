package UVA3_Transportes;

public abstract class VehiculoMotorizado extends Vehiculo {
    protected String tipoDeMotor;
    protected boolean motorEncendido;

    public VehiculoMotorizado(String marca, double velocidad, String tipoDeMotor) {
        super(marca, velocidad);
        this.tipoDeMotor = tipoDeMotor;
        this.motorEncendido = false;
    }

    public void encenderMotor() {
        motorEncendido = true;
        System.out.println("Motor encendido");
    }

    public void apagarMotor() {
        motorEncendido = false;
        System.out.println("Motor apagado");
    }

    public void repostarCombustible() {
        System.out.println("Repostando combustible");
    }

    public String getTipoDeMotor() {
        return tipoDeMotor;
    }

    public boolean isMotorEncendido() {
        return motorEncendido;
    }
} 