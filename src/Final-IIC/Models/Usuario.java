package Models;

import java.util.*;

public abstract class Usuario {
    protected int nroUsuario;
    protected String calle;
    protected int altura;
    protected int piso;
    protected String depto;
    protected int codigoPostal;
    protected String localidad;
    protected String provincia;
    protected Medidor medidor;

    public Usuario(int nroUsuario, String calle, int altura, int piso, String depto, int cp, String local, String pcia) {
        this.nroUsuario = nroUsuario;
        this.calle = calle;
        this.altura = altura;
        this.piso = piso;
        this.depto = depto;
        this.codigoPostal = cp;
        this.localidad = local;
        this.provincia = pcia;
        this.medidor = new Medidor();
    }

    public int getNroUsuario() { return nroUsuario; }
    public Medidor getMedidor() { return medidor; }
}