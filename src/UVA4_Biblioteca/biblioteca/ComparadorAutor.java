package UVA4_Biblioteca.biblioteca;
import UVA4_Biblioteca.biblioteca.Libro;

import java.util.Comparator;

public class ComparadorAutor implements Comparator<Libro> {
    
    @Override
    public int compare(Libro l1, Libro l2) {
        return l1.getAutor().compareTo(l2.getAutor());
    }
}