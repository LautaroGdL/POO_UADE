package UVA1_Automoviles;
public class Auto {

    private String marca;

    private String modelo;

    private Motor motor; // Relación de composición

    private Rueda[] ruedas; // Como manejar listados y colecciones.
    // Se suelen usar opciones mas dinámicas que arreglos en Java

    public Auto(String marca, String modelo, Motor motor, Rueda[] ruedas) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.ruedas = ruedas;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    // El this es un puntero apuntando al objeto que esta instanciado, puntero a si
    // mismo

    public void encenderAuto() {
        this.motor.encender();
        System.out.println("Auto endencido");
    }

    public void inflarRuedas() {

        for (Rueda r : ruedas) {
            r.inflar();
        }
    }

}
