package Services;

import Models.*;
import java.util.*;

public class EmpresaElectricaService {
    private Map<Integer, Usuario> usuarios = new HashMap<>();
    private int contadorUsuarios = 1;
    private TarifaResidencial tarifaResidencial = new TarifaResidencial(120, 0.21f, 0.08f);
    private TarifaIndustrial tarifaIndustrial = new TarifaIndustrial(110, 0.21f, 0.035f);

    public int crearUsuarioResidencial(String nom, int dni, String calle, int altura, int piso,
                                       String dpto, int cp, String loca, String pcia) {
        int nro = contadorUsuarios++;
        UsuarioResidencial u = new UsuarioResidencial(nro, calle, altura, piso, dpto, cp, loca, pcia, nom, dni);
        usuarios.put(nro, u);
        return nro;
    }

    public int crearUsuarioIndustrial(String razon, String cuit, String iibb, String condFiscal,
                                      String calle, int altura, int piso, String dpto, int cp, String loca, String pcia) {
        int nro = contadorUsuarios++;
        UsuarioIndustrial u = new UsuarioIndustrial(nro, calle, altura, piso, dpto, cp, loca, pcia,
                razon, cuit, iibb, condFiscal);
        usuarios.put(nro, u);
        return nro;
    }

    public void registrarMedicion(int nroUsuario, int año, int bimestre, int lectura) {
        Usuario u = usuarios.get(nroUsuario);
        if (u != null) {
            u.getMedidor().registrarMedicion(año, bimestre, lectura);
        }
    }

    public Factura consultarConsumo(int nroUsuario, int año, int bimestre) {
        Usuario u = usuarios.get(nroUsuario);
        if (u == null) throw new RuntimeException("Usuario no encontrado");

        Medicion actual = u.getMedidor().getUltimaMedicion(año, bimestre);
        Medicion anterior = u.getMedidor().getMedicionAnterior(año, bimestre);

        if (actual == null || anterior == null) throw new RuntimeException("Faltan mediciones");

        int consumo = actual.getLectura() - anterior.getLectura();
        if (consumo < 0) throw new RuntimeException("Lectura inválida");

        float total = (u instanceof UsuarioResidencial) ?
                tarifaResidencial.calcularTarifa(consumo) :
                tarifaIndustrial.calcularTarifa(consumo);

        return new Factura(u, consumo, total);
    }
}
