package UVA3_Transportes;

public class Bicicleta extends Vehiculo {
    private int numeroMarchas;

    public Bicicleta(String marca, double velocidad, int numeroMarchas) {
        super(marca, velocidad);
        this.numeroMarchas = numeroMarchas;
    }

    @Override
    public String desplazar() {
        return "Bicicleta " + marca + " pedaleando a " + velocidad + " km/h";
    }

    public int getNumeroMarchas() {
        return numeroMarchas;
    }
} 