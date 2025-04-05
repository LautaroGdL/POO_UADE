package UVA3_Transportes;

public class Auto extends VehiculoMotorizado {
    private int numeroPuertas;

    public Auto(String marca, double velocidad, String tipoDeMotor, int numeroPuertas) {
        super(marca, velocidad, tipoDeMotor);
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public String desplazar() {
        return "Auto " + marca + " desplazándose a " + velocidad + " km/h";
    }

    public String desplazar(String modo) {
        if (modo.equalsIgnoreCase("automático")) {
            return "Auto " + marca + " desplazándose en modo automático a " + velocidad + " km/h";
        } else {
            return "Auto " + marca + " desplazándose en modo normal a " + velocidad + " km/h";
        }
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }
} 
