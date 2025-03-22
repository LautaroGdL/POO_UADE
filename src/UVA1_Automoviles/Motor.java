package UVA1_Automoviles;
public class Motor {

    private boolean encendido;
    private int hp;
    private String tipo;

    public Motor(String tipo, int hp) {

        this.tipo = tipo;
        this.encendido = false;
        this.hp = hp;

    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void encender() {
        encendido = true;
    }

    public void apagar() {
        if (encendido)
            encendido = false;
        else
            System.out.println("El motor esta apagado");
            // No imprimir la variable sin usar el toString 
    }

    

}
