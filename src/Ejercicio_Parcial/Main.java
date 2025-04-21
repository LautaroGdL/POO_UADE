package Ejercicio_Parcial;

import java.time.*;
import java.util.*;

public class Main {

    // --- DEMO CLASSES ---

//    class Main {
//        public static void main(String[] args) {
//            DemoPersona.main(null);
//            DemoElectrodomestico.main(null);
//            DemoSerie.main(null);
//            DemoLibro.main(null);
//            DemoVideojuego.main(null);
//            DemoPassword.main(null);
//            DemoCuentaBancaria.main(null);
//        }
//    }

    class DemoPersona {
        public static void main(String[] args) {
            Persona p = new Persona("12345678X", "Ana", "García", LocalDate.of(1995, 5, 15));
            p.setAltura(1.65);
            p.setPeso(60);
            System.out.println(p);
            System.out.println("¿Está en forma?: " + p.estaEnForma());
            System.out.println("¿Cumple años hoy?: " + p.cumpleAnios());
            System.out.println("¿Puede votar?: " + p.puedeVotar());
        }
    }

    class DemoElectrodomestico {
        public static void main(String[] args) {
            Electrodomestico e = new Electrodomestico("Heladera", 500, "blanco", 30, 50);
            System.out.println("¿Es bajo consumo?: " + e.esBajoConsumo());
            System.out.println("¿Es alta gama?: " + e.esAltaGama());
        }
    }

    class DemoSerie {
        public static void main(String[] args) {
            Serie s1 = new Serie("Dark", 3, "Ciencia Ficción", "Baran bo Odar");
            Serie s2 = new Serie("Friends", 10, "Comedia", "David Crane");
            s1.entregar();
            System.out.println("¿Dark entregada?: " + s1.estaEntregado());
            System.out.println("¿Friends tiene más temporadas que Dark?: " + s2.tieneMasTemporadasQue(s1));
        }
    }

    class DemoLibro {
        public static void main(String[] args) {
            Libro l = new Libro("1984", "George Orwell", 3);
            l.prestar();
            l.prestar();
            System.out.println(l);
            l.devolver();
            System.out.println("Después de devolver uno: " + l);
        }
    }

    class DemoVideojuego {
        public static void main(String[] args) {
            Videojuego v1 = new Videojuego("Zelda", 40, "Aventura", "Nintendo");
            Videojuego v2 = new Videojuego("Tetris", 5, "Puzzle", "Alexey Pajitnov");
            v1.entregar();
            System.out.println("¿Zelda entregado?: " + v1.estaEntregado());
            System.out.println("¿Zelda tiene más horas que Tetris?: " + v1.tieneMasHorasQue(v2));
        }
    }

    class DemoPassword {
        public static void main(String[] args) {
            Password p = new Password();
            System.out.println("Clave generada: " + p.getClave());
            System.out.println("¿Es fuerte?: " + p.esFuerte());
        }
    }

    class DemoCuentaBancaria {
        public static void main(String[] args) {
            CuentaBancaria cuenta = new CuentaBancaria("Juan Pérez", 1000);
            cuenta.ingresar(500);
            cuenta.retirar(300);
            System.out.println("Titular: " + cuenta.getTitular() + ", Saldo final: $" + cuenta.getSaldo());
        }
    }

    class DemoEmpleado {
        public static void main(String[] args) {
            List<Empleado> empleados = new ArrayList<>();

            empleados.add(new EmpleadoAsalariado("María", 3000));
            empleados.add(new EmpleadoPorHora("Pedro", 160, 15));
            empleados.add(new EmpleadoComision("Lucía", 2000, 5000, 0.1));

            for (Empleado emp : empleados) {
                System.out.println(emp.mostrarInfo());
            }
        }

    }
}
