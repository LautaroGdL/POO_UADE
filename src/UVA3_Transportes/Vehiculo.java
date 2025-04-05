package UVA3_Transportes;

public class Vehiculo {
    protected String marca;
    protected double velocidad;

    public Vehiculo(String marca, double velocidad) {
        this.marca = marca;
        this.velocidad = velocidad;
    }

    public String desplazar() {
        return "Vehículo desplazándose";
    }

    public String getMarca() {
        return marca;
    }

    public double getVelocidad() {
        return velocidad;
    }
} 