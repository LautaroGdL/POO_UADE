package Controllers;

import Models.Factura;
import Services.EmpresaElectricaService;

public class ConsultaConsumoController {
    private EmpresaElectricaService service;

    public ConsultaConsumoController(EmpresaElectricaService service) {
        this.service = service;
    }

    public String consultarConsumo(int nroUsuario, int año, int bimestre) {
        try {
            Factura f = service.consultarConsumo(nroUsuario, año, bimestre);
            return "Consumo: " + f.getConsumo() + " Kwh\nTotal: $" + f.getMontoTotal();
        } catch (Exception e) {
            return "Error: " + e.getMessage();
        }
    }
}