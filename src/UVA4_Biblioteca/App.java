package UVA4_Biblioteca;

import UVA4_Biblioteca.biblioteca.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        List<Libro> listaLibros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int opcion = -1;

        while (opcion != 0) {
            System.out.println("\n--- MENÚ DE BIBLIOTECA ---");
            System.out.println("1. Agregar libro");
            System.out.println("2. Eliminar libro por ISBN");
            System.out.println("3. Buscar libro por título");
            System.out.println("4. Mostrar todos los libros");
            System.out.println("5. Ordenar por título");
            System.out.println("6. Ordenar por autor");
            System.out.println("7. Ordenar por año");
            System.out.println("0. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            if (opcion == 1) {
                System.out.print("Título: ");
                String titulo = scanner.nextLine();
                System.out.print("Autor: ");
                String autor = scanner.nextLine();
                System.out.print("Año de publicación: ");
                int anio = scanner.nextInt();
                System.out.print("ISBN: ");
                int isbn = scanner.nextInt();
                scanner.nextLine();

                Libro nuevoLibro = new Libro(titulo, autor, anio, isbn);
                listaLibros.add(nuevoLibro);
                System.out.println("Libro agregado.");

            } else if (opcion == 2) {
                System.out.print("Ingrese el ISBN del libro a eliminar: ");
                int isbnEliminar = scanner.nextInt();
                scanner.nextLine();

                boolean eliminado = false;
                int i = 0;

                while (i < listaLibros.size()) {
                    Libro l = listaLibros.get(i);
                    if (l.getIsbn() == isbnEliminar) {
                        listaLibros.remove(i);
                        eliminado = true;
                        System.out.println("Libro eliminado: " + l);
                    } else {
                        i++;
                    }
                }

                if (!eliminado) {
                    System.out.println("Libro no encontrado.");
                }

            } else if (opcion == 3) {
                System.out.print("Ingrese el título del libro a buscar: ");
                String tituloBuscar = scanner.nextLine();
                boolean encontrado = false;

                int i = 0;
                while (i < listaLibros.size()) {
                    Libro l = listaLibros.get(i);
                    if (l.getTitulo().equalsIgnoreCase(tituloBuscar)) {
                        System.out.println("Libro encontrado: " + l);
                        encontrado = true;
                    }
                    i++;
                }

                if (!encontrado) {
                    System.out.println("Libro no encontrado.");
                }

            } else if (opcion == 4) {
                if (listaLibros.size() == 0) {
                    System.out.println("No hay libros cargados.");
                } else {
                    int i = 0;
                    while (i < listaLibros.size()) {
                        System.out.println(listaLibros.get(i));
                        i++;
                    }
                }

            } else if (opcion == 5) {
                Collections.sort(listaLibros, new ComparadorTitulo());
                System.out.println("Lista ordenada por título.");

            } else if (opcion == 6) {
                Collections.sort(listaLibros, new ComparadorAutor());
                System.out.println("Lista ordenada por autor.");

            } else if (opcion == 7) {
                Collections.sort(listaLibros, new ComparadorAnio());
                System.out.println("Lista ordenada por año.");

            } else if (opcion == 0) {
                System.out.println("Fin del programa.");

            } else {
                System.out.println("Opción inválida.");
            }
        }
    }
}
