package Models;

import java.util.*;

public class Medidor {
    private int nroMedidor;
    private List<Medicion> mediciones = new ArrayList<>();

    public void registrarMedicion(int año, int bimestre, int lectura) {
        mediciones.add(new Medicion(año, bimestre, lectura));
    }

    public Medicion getUltimaMedicion(int año, int bimestre) {
        return mediciones.stream()
                .filter(m -> m.getAño() == año && m.getBimestre() == bimestre)
                .findFirst()
                .orElse(null);
    }

    public Medicion getMedicionAnterior(int año, int bimestre) {
        return mediciones.stream()
                .filter(m -> (m.getAño() < año) || (m.getAño() == año && m.getBimestre() < bimestre))
                .max(Comparator.comparing(Medicion::getAño)
                        .thenComparing(Medicion::getBimestre))
                .orElse(null);
    }
}
