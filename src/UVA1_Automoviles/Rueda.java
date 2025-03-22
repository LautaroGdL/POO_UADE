package UVA1_Automoviles;
public class Rueda {

    private String marca;
    private int tamaño;
    private boolean inflada;

    public Rueda(String marca, int tamaño) {
        this.marca = marca;
        this.tamaño = tamaño;
        this.inflada = false;
    }

    public void inflar() {
        this.inflada = true;
        System.out.println("La rueda está inflada");
    }

}
