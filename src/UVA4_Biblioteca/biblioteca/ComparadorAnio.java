package UVA4_Biblioteca.biblioteca;
import UVA4_Biblioteca.biblioteca.Libro;

import java.util.Comparator;

public class ComparadorAnio implements Comparator<Libro> {
    
    @Override
    public int compare(Libro l1, Libro l2) {
        return Integer.compare(l1.getAnioDePublicacion(), l2.getAnioDePublicacion());
    }
}