package Views;

import Controllers.ConsultaConsumoController;
import Services.EmpresaElectricaService;

import javax.swing.*;
import java.awt.*;

public class ConsultaConsumoView extends JFrame {
    private JTextField txtUsuario = new JTextField(5);
    private JTextField txtAnio = new JTextField(5);
    private JTextField txtBimestre = new JTextField(5);
    private JTextArea txtResultado = new JTextArea(5, 20);
    private JButton btnConsultar = new JButton("Consultar");

    public ConsultaConsumoView(ConsultaConsumoController controller) {
        setTitle("Consulta de Consumo");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        add(new JLabel("Nro Usuario:"));
        add(txtUsuario);
        add(new JLabel("Año:"));
        add(txtAnio);
        add(new JLabel("Bimestre:"));
        add(txtBimestre);
        add(btnConsultar);
        add(new JScrollPane(txtResultado));

        btnConsultar.addActionListener(e -> {
            int nroUsuario = Integer.parseInt(txtUsuario.getText());
            int año = Integer.parseInt(txtAnio.getText());
            int bimestre = Integer.parseInt(txtBimestre.getText());
            String resultado = controller.consultarConsumo(nroUsuario, año, bimestre);
            txtResultado.setText(resultado);
        });
    }

    public static void main(String[] args) {
        EmpresaElectricaService service = EmpresaElectricaService.getInstance();
        int nro = service.crearUsuarioResidencial("Juan Perez", 12345678, "Av Siempre Viva", 742, 0, "A", 1000, "Springfield", "BsAs");
        service.registrarMedicion(nro, 2025, 1, 1000);
        service.registrarMedicion(nro, 2025, 2, 1150);

        ConsultaConsumoController controller = new ConsultaConsumoController(service);
        ConsultaConsumoView vista = new ConsultaConsumoView(controller);
        vista.setVisible(true);
    }
}