package BibliotecaSwing;

import BibliotecaSwing.controlador.ControladorBiblioteca;
import BibliotecaSwing.vista.*;

public class Main {
    public static void main(String[] args) {
        ControladorBiblioteca controlador = new ControladorBiblioteca();

        Runtime.getRuntime().addShutdownHook(new Thread(controlador::guardar));

        javax.swing.SwingUtilities.invokeLater(() -> new VentanaPrincipal(controlador));
    }
}

