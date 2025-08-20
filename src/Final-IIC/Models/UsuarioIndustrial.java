package Models;

public class UsuarioIndustrial extends Usuario {
    private String razonSocial;
    private String cuit;
    private String iibb;
    private String condicionFiscal;

    public UsuarioIndustrial(int nroUsuario, String calle, int altura, int piso, String dpto, int cp, String local,
                             String pcia, String rs, String cuit, String iibb, String condicion) {
        super(nroUsuario, calle, altura, piso, dpto, cp, local, pcia);
        this.razonSocial = rs;
        this.cuit = cuit;
        this.iibb = iibb;
        this.condicionFiscal = condicion;
    }

    public String getRazonSocial() { return razonSocial; }
    public String getCuit() { return cuit; }
}
