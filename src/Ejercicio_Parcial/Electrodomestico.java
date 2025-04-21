package Ejercicio_Parcial;

public class Electrodomestico {

    private String nombre;
    private double precioBase = 100;
    private String color = "gris plata";
    private double consumoEnergetico = 10;
    private double peso = 2;

    public Electrodomestico(String nombre) {
        this.nombre = nombre;
    }

    public Electrodomestico(String nombre, double precioBase) {
        this(nombre);
        this.precioBase = precioBase;
    }

    public Electrodomestico(String nombre, double precioBase, String color, double consumoEnergetico, double peso) {
        this(nombre, precioBase);
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public String getNombre() { return nombre; }
    public double getPrecioBase() { return precioBase; }
    public String getColor() { return color; }
    public double getConsumoEnergetico() { return consumoEnergetico; }
    public double getPeso() { return peso; }

    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setPrecioBase(double precioBase) { this.precioBase = precioBase; }
    public void setColor(String color) { this.color = color; }
    public void setConsumoEnergetico(double consumoEnergetico) { this.consumoEnergetico = consumoEnergetico; }
    public void setPeso(double peso) { this.peso = peso; }

    public boolean esBajoConsumo() {
        return consumoEnergetico < 45;
    }

    public double calcularBalance() {
        return precioBase / peso;
    }

    public boolean esAltaGama() {
        return calcularBalance() > 3;
    }

}
