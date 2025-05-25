package BibliotecaSwing.vista;

import BibliotecaSwing.controlador.ControladorBiblioteca;
import BibliotecaSwing.modelo.Libro;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class VentanaAdmin extends JFrame {
    public VentanaAdmin(ControladorBiblioteca controlador) {
        setTitle("Administrar Libros");
        setSize(600, 450);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new BorderLayout());

        DefaultTableModel modelo = new DefaultTableModel(new String[]{"Título", "Autor", "Categoría", "Prestado"}, 0);
        JTable tabla = new JTable(modelo);

        // Cargar libros existentes en la tabla
        for (Libro l : controlador.getLibros()) {
            modelo.addRow(new Object[]{l.getTitulo(), l.getAutor(), l.getCategoria(), l.isPrestado() ? "Sí" : "No"});
        }

        JPanel formulario = new JPanel(new GridLayout(4, 2, 5, 5));
        JTextField titulo = new JTextField();
        JTextField autor = new JTextField();
        JTextField categoria = new JTextField();
        JButton btnAgregar = new JButton("Agregar Libro");
        JButton btnEliminar = new JButton("Eliminar Libro");

        formulario.add(new JLabel("Título:"));
        formulario.add(titulo);
        formulario.add(new JLabel("Autor:"));
        formulario.add(autor);
        formulario.add(new JLabel("Categoría:"));
        formulario.add(categoria);
        formulario.add(btnAgregar);
        formulario.add(btnEliminar);

        // Acción para agregar libro
        btnAgregar.addActionListener(e -> {
            String t = titulo.getText().trim();
            String a = autor.getText().trim();
            String c = categoria.getText().trim();

            if (t.isEmpty() || a.isEmpty() || c.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            Libro nuevoLibro = new Libro(t, a, c);
            controlador.agregarLibro(nuevoLibro);
            modelo.addRow(new Object[]{t, a, c, "No"});
            titulo.setText("");
            autor.setText("");
            categoria.setText("");
        });

        // Acción para eliminar libro
        btnEliminar.addActionListener(e -> {
            int filaSeleccionada = tabla.getSelectedRow();
            if (filaSeleccionada == -1) {
                JOptionPane.showMessageDialog(this, "Seleccione un libro para eliminar", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Confirmar eliminación
            int confirmar = JOptionPane.showConfirmDialog(this, "¿Está seguro de eliminar el libro seleccionado?", "Confirmar eliminación", JOptionPane.YES_NO_OPTION);
            if (confirmar != JOptionPane.YES_OPTION) return;

            // Obtener datos del libro seleccionado
            String tituloEliminar = (String) modelo.getValueAt(filaSeleccionada, 0);
            String autorEliminar = (String) modelo.getValueAt(filaSeleccionada, 1);
            String categoriaEliminar = (String) modelo.getValueAt(filaSeleccionada, 2);

            // Llamar al controlador para eliminar el libro
            controlador.eliminarLibro(tituloEliminar, autorEliminar, categoriaEliminar);

            // Quitar fila de la tabla
            modelo.removeRow(filaSeleccionada);
        });

        panel.add(new JScrollPane(tabla), BorderLayout.CENTER);
        panel.add(formulario, BorderLayout.SOUTH);

        add(panel);
        setVisible(true);
    }
}
