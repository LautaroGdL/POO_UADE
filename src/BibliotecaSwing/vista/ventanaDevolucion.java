package BibliotecaSwing.vista;

import BibliotecaSwing.controlador.ControladorBiblioteca;

import javax.swing.*;
import java.awt.*;

class VentanaDevolucion extends JFrame {
    public VentanaDevolucion(ControladorBiblioteca controlador) {
        setTitle("Devolver Libro");
        setSize(400, 150);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(2, 2));
        JTextField campoTitulo = new JTextField();
        JButton btnDevolver = new JButton("Devolver");

        panel.add(new JLabel("Título del libro:"));
        panel.add(campoTitulo);
        panel.add(btnDevolver);

        btnDevolver.addActionListener(e -> {
            String titulo = campoTitulo.getText();
            String mensaje = controlador.devolverLibro(titulo);
            JOptionPane.showMessageDialog(this, mensaje);
        });

        add(panel);
        setVisible(true);
    }
}