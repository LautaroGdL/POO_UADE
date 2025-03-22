package UVA2_Televisores;

public class Televisor {

    private String marca;
    private String modelo;
    private int año;
    private Boolean esSmart;
    private int tamaño;
    private String resolucion;
    private Boolean prendido;
    private Tipo tipo;

    public Televisor(String marca, String modelo, int año, Boolean esSmart, String resolucion, int tamaño, Tipo tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.esSmart = esSmart;
        this.resolucion = resolucion;
        this.tamaño = tamaño;
        this.tipo = tipo;
        this.prendido = false; // La tele esta apagada al comienzo siempre
    }

    // Getters

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAñoFabricacion() {
        return año;
    }

    public Tipo geTipo() {
        return this.tipo;
    }

    // Setters

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setTamaño(int tamañoPantalla) {
        this.tamaño = tamañoPantalla;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }


    // Encender y apagar

    public void encenderTelevisor() {
        if (this.prendido == false) {
            this.prendido = true;
        } else {
            System.out.println("El televisor ya esta prendido");
        }

    }

    public void apagarTelevisor() {
        if (this.prendido == true) {
            this.prendido = false;
        } else {
            System.out.println("El televisor ya esta apagado");
        }

    }

    // Imprimir datos del televisor

    public void imprimirDatos() {
        String esInteligente = "No Smart";
        if (esSmart) {
            esInteligente = "Smart";
        }
        System.out.println(
                this.marca + " -- " + this.tamaño + " -- " + this.resolucion + " -- " + esInteligente);
    }

    public void preguntarEstadoTelevisor() {
        if (prendido) {
            System.out.println("La tele está encendida");
        } else {
            System.out.println("La tele está apagada");
        }
    }

}
