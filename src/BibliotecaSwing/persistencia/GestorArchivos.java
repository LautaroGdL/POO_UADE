package BibliotecaSwing.persistencia;
import java.io.*;
import java.util.ArrayList;
import BibliotecaSwing.modelo.Libro;


public class GestorArchivos {
    private static final String RUTA = "libros.dat";

    public static void guardarLibros(ArrayList<Libro> libros) throws IOException {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(RUTA))) {
            out.writeObject(libros);
        }
    }

    public static ArrayList<Libro> cargarLibros() throws IOException, ClassNotFoundException {
        File archivo = new File(RUTA);
        if (!archivo.exists()) return new ArrayList<>();

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(RUTA))) {
            return (ArrayList<Libro>) in.readObject();
        }
    }
}
