package BibliotecaSwing.vista;

import BibliotecaSwing.controlador.ControladorBiblioteca;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class VentanaPrincipal extends JFrame {
    private ControladorBiblioteca controlador;

    public VentanaPrincipal(ControladorBiblioteca controlador) {
        this.controlador = controlador;

        setTitle("Gestión de Biblioteca");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(4, 1));

        JButton buscar = new JButton("Buscar Libro");
        JButton prestar = new JButton("Prestar Libro");
        JButton devolver = new JButton("Devolver Libro");
        JButton admin = new JButton("Administrar Libros");

        add(buscar);
        add(prestar);
        add(devolver);
        add(admin);

        buscar.addActionListener(e -> new VentanaBusqueda(controlador));
        prestar.addActionListener(e -> new VentanaPrestamo(controlador));
        devolver.addActionListener(e -> new VentanaDevolucion(controlador));
        admin.addActionListener(e -> new VentanaAdmin(controlador));

        setVisible(true);
    }
}