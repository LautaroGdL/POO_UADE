package Ejercicio_Parcial;

// Clase base
abstract class Empleado {
    protected String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public abstract double calcularSalario();

    public String mostrarInfo() {
        return toString() + " - Salario: $" + calcularSalario();
    }

    @Override
    public String toString() {
        return "Empleado: " + nombre;
    }
}

// Empleado Asalariado
class EmpleadoAsalariado extends Empleado {
    private final double salarioFijo;

    public EmpleadoAsalariado(String nombre, double salarioFijo) {
        super(nombre);
        this.salarioFijo = salarioFijo;
    }

    @Override
    public double calcularSalario() {
        return salarioFijo;
    }

    @Override
    public String toString() {
        return "Empleado Asalariado - " + nombre;
    }
}

// Empleado por Hora
class EmpleadoPorHora extends Empleado {
    private int horasTrabajadas;
    private double pagoPorHora;

    public EmpleadoPorHora(String nombre, int horasTrabajadas, double pagoPorHora) {
        super(nombre);
        this.horasTrabajadas = horasTrabajadas;
        this.pagoPorHora = pagoPorHora;
    }

    @Override
    public double calcularSalario() {
        return horasTrabajadas * pagoPorHora;
    }

    @Override
    public String toString() {
        return "Empleado por Hora - " + nombre;
    }
}

// Empleado por Comisión
class EmpleadoComision extends Empleado {
    private double salarioBase;
    private double ventas;
    private double porcentajeComision;

    public EmpleadoComision(String nombre, double salarioBase, double ventas, double porcentajeComision) {
        super(nombre);
        this.salarioBase = salarioBase;
        this.ventas = ventas;
        this.porcentajeComision = porcentajeComision;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + (ventas * porcentajeComision);
    }

    @Override
    public String toString() {
        return "Empleado por Comisión - " + nombre;
    }
}
