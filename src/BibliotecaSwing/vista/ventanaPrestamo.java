package BibliotecaSwing.vista;

import BibliotecaSwing.controlador.ControladorBiblioteca;

import javax.swing.*;
import java.awt.*;

class VentanaPrestamo extends JFrame {
    public VentanaPrestamo(ControladorBiblioteca controlador) {
        setTitle("Prestar Libro");
        setSize(400, 200);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(3, 2));
        JTextField campoTitulo = new JTextField();
        JTextField campoUsuario = new JTextField();
        JButton btnPrestar = new JButton("Prestar");

        panel.add(new JLabel("Título del libro:"));
        panel.add(campoTitulo);
        panel.add(new JLabel("Nombre del usuario:"));
        panel.add(campoUsuario);
        panel.add(btnPrestar);

        btnPrestar.addActionListener(e -> {
            String titulo = campoTitulo.getText();
            String usuario = campoUsuario.getText();
            String mensaje = controlador.prestarLibro(titulo, usuario);
            JOptionPane.showMessageDialog(this, mensaje);
        });

        add(panel);
        setVisible(true);
    }
}
