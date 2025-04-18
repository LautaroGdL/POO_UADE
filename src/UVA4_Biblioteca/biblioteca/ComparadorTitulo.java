package UVA4_Biblioteca.biblioteca;
import UVA4_Biblioteca.biblioteca.Libro;

import java.util.Comparator;

public class ComparadorTitulo implements Comparator<Libro> {
    
    @Override
    public int compare(Libro l1, Libro l2) {
        return l1.getTitulo().compareTo(l2.getTitulo());
    }
}
