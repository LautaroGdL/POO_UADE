package Models;

public class UsuarioResidencial extends Usuario {
    private String nombre;
    private int dni;

    public UsuarioResidencial(int nroUsuario, String calle, int altura, int piso, String dpto, int cp,
                              String local, String pcia, String nom, int dni) {
        super(nroUsuario, calle, altura, piso, dpto, cp, local, pcia);
        this.nombre = nom;
        this.dni = dni;
    }

    public String getNombre() { return nombre; }
    public int getDni() { return dni; }
}