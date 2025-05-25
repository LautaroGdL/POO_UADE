package BibliotecaSwing.controlador;

import BibliotecaSwing.modelo.Libro;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ControladorBiblioteca {
    private List<Libro> libros;
    private final String archivoDatos = "libros.dat";

    public ControladorBiblioteca() {
        libros = new ArrayList<>();
        cargarDatos();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
        guardarDatos();
    }

    public String prestarLibro(String titulo, String usuario) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                if (!libro.isPrestado()) {
                    libro.setPrestado(true);
                    libro.setUsuarioPrestamo(usuario);
                    guardarDatos();
                    return "Libro prestado correctamente.";
                } else {
                    return "El libro ya está prestado.";
                }
            }
        }
        return "Libro no encontrado.";
    }

    public String devolverLibro(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                if (libro.isPrestado()) {
                    libro.setPrestado(false);
                    libro.setUsuarioPrestamo(null);
                    guardarDatos();
                    return "Libro devuelto correctamente.";
                } else {
                    return "El libro no estaba prestado.";
                }
            }
        }
        return "Libro no encontrado.";
    }

    public List<Libro> buscarLibro(String texto) {
        String consulta = texto.toLowerCase();
        return libros.stream()
                .filter(l -> l.getTitulo().toLowerCase().contains(consulta)
                        || l.getAutor().toLowerCase().contains(consulta)
                        || l.getCategoria().toLowerCase().contains(consulta))
                .collect(Collectors.toList());
    }

    public List<Libro> getLibros() {
        return new ArrayList<>(libros);
    }

    private void cargarDatos() {
        File archivo = new File(archivoDatos);
        if (archivo.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
                Object obj = ois.readObject();
                if (obj instanceof List<?>) {
                    List<?> lista = (List<?>) obj;
                    if (!lista.isEmpty() && lista.get(0) instanceof Libro) {
                        libros = new ArrayList<>();
                        for (Object item : lista) {
                            libros.add((Libro) item);
                        }
                    }
                }
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    public void guardar() {
        guardarDatos();
    }

    private void guardarDatos() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("libros.dat"))) {
            oos.writeObject(libros); // 'libros' debe ser una lista de objetos Libro
            System.out.println("Datos guardados correctamente.");
        } catch (IOException e) {
            System.err.println("Error al guardar los datos: " + e.getMessage());
        }
    }


    public void eliminarLibro(String titulo, String autor, String categoria) {
        libros.removeIf(l -> l.getTitulo().equals(titulo) && l.getAutor().equals(autor) && l.getCategoria().equals(categoria));
    }

}

