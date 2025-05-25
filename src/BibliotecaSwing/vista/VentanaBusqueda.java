package BibliotecaSwing.vista;

import BibliotecaSwing.controlador.ControladorBiblioteca;
import BibliotecaSwing.modelo.Libro;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;

public class VentanaBusqueda extends JFrame {

    public VentanaBusqueda(ControladorBiblioteca controlador) {
        setTitle("Buscar Libros");
        setSize(600, 400);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new BorderLayout());

        // Panel superior con campo de búsqueda y selector
        JPanel panelSuperior = new JPanel(new BorderLayout());
        JTextField campoBusqueda = new JTextField();
        String[] criterios = {"Título", "Autor", "Categoría"};
        JComboBox<String> comboCriterio = new JComboBox<>(criterios);
        JButton btnBuscar = new JButton("Buscar");

        JPanel panelBusqueda = new JPanel(new BorderLayout());
        panelBusqueda.add(comboCriterio, BorderLayout.WEST);
        panelBusqueda.add(campoBusqueda, BorderLayout.CENTER);

        panelSuperior.add(panelBusqueda, BorderLayout.CENTER);
        panelSuperior.add(btnBuscar, BorderLayout.EAST);

        JTable tabla = new JTable();
        JScrollPane scrollPane = new JScrollPane(tabla);

        btnBuscar.addActionListener(e -> {
            String texto = campoBusqueda.getText().toLowerCase().trim();
            String criterio = (String) comboCriterio.getSelectedItem();
            ArrayList<Libro> resultados = new ArrayList<>();

            for (Libro l : controlador.getLibros()) {
                switch (criterio) {
                    case "Título":
                        if (l.getTitulo().toLowerCase().contains(texto)) resultados.add(l);
                        break;
                    case "Autor":
                        if (l.getAutor().toLowerCase().contains(texto)) resultados.add(l);
                        break;
                    case "Categoría":
                        if (l.getCategoria().toLowerCase().contains(texto)) resultados.add(l);
                        break;
                }
            }

            DefaultTableModel modelo = new DefaultTableModel(new String[]{"Título", "Autor", "Categoría", "Prestado"}, 0);
            for (Libro l : resultados) {
                modelo.addRow(new Object[]{l.getTitulo(), l.getAutor(), l.getCategoria(), l.isPrestado() ? "Sí" : "No"});
            }
            tabla.setModel(modelo);
        });

        panel.add(panelSuperior, BorderLayout.NORTH);
        panel.add(scrollPane, BorderLayout.CENTER);

        add(panel);
        setVisible(true);
    }
}
