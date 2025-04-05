package UVA3_Transportes;

public class Principal {
    public static void main(String[] args) {
        // Crear instancias de cada tipo de vehículo
        Auto auto = new Auto("Toyota", 120.0, "Nafta", 4);
        Moto moto = new Moto("Honda", 100.0, "Nafta", false);
        Bicicleta bicicleta = new Bicicleta("Trek", 25.0, 21);

        System.out.println("Demo:");
        
        // 
        System.out.println("\nAuto:");
        auto.encenderMotor();
        System.out.println(auto.desplazar());
        System.out.println(auto.desplazar("automático"));
        auto.repostarCombustible();
        auto.apagarMotor();

        // Moto - Demostrar métodos heredados
        System.out.println("\nMoto:");
        moto.encenderMotor();
        System.out.println(moto.desplazar());
        moto.repostarCombustible();
        moto.apagarMotor();

        // Bicicleta - Demostrar sobrescritura del método desplazar
        System.out.println("\nBicicleta:");
        System.out.println(bicicleta.desplazar());
    }
} 