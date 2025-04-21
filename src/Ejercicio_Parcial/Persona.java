package Ejercicio_Parcial;

import java.util.*;
import java.time.LocalDate;
import java.time.Period;

public class Persona {

    private String nombre = "N";
    private String apellido = "N";
    private int edad;
    private LocalDate fechaNacimiento = LocalDate.of(2000, 1, 1);
    private final String dni;
    private String sexo = "Femenino";
    private double peso = 1.0;
    private double altura = 1.0;

    public Persona(String dni) {
        this.dni = dni;
    }

    public Persona(String dni, String nombre, String apellido) {
        this(dni);
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Persona(String dni, String nombre, String apellido, LocalDate fechaNacimiento) {
        this(dni, nombre, apellido);
        this.fechaNacimiento = fechaNacimiento;
        this.edad = calcularEdad();
    }

    public int calcularEdad() {
        return Period.between(this.fechaNacimiento, LocalDate.now()).getYears();
    }

    public double calcularIMC() {
        return peso / (altura * altura);
    }

    public boolean estaEnForma() {
        double imc = calcularIMC();
        return imc >= 18.5 && imc <= 25;
    }

    public boolean cumpleAnios() {
        LocalDate hoy = LocalDate.now();
        return hoy.getDayOfMonth() == fechaNacimiento.getDayOfMonth() && hoy.getMonth() == fechaNacimiento.getMonth();
    }

    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

    public boolean puedeVotar() {
        return edad >= 16;
    }

    public boolean esCoherente() {
        return edad == calcularEdad();
    }

    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getDni() {
        return dni;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return String.format("%s %s - DNI: %s - Edad: %d - Nacimiento: %s - Sexo: %s - Peso: %.2f - Altura: %.2f",
                nombre, apellido, dni, edad, fechaNacimiento.toString(), sexo, peso, altura);
    }

}
