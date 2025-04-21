import UVA1_Automoviles.Auto;
import UVA1_Automoviles.Motor;
import UVA1_Automoviles.Rueda;
import UVA2_Televisores.Televisor;
import UVA2_Televisores.Tipo;

public class Main {
    public static void main(String[] args) throws Exception {

        Motor motor = new Motor("Gasolina", 150);

        Rueda[] ruedas = {
                new Rueda("Michelin", 16),
                new Rueda("Pirelli", 16),
                new Rueda("Michelin", 16),
                new Rueda("Michelin", 16)
        };

        Auto myAuto = new Auto("Ford", "Mustang", motor, ruedas);

        myAuto.encenderAuto();
        myAuto.inflarRuedas();

        Tipo tipo = new Tipo("LED");
        Televisor tele = new Televisor("LG", "M1", 2019, true, "4K", 60, tipo);

        tele.imprimirDatos();
        tele.encenderTelevisor();
        tele.preguntarEstadoTelevisor();

        // Creo una nueva tele de la misma marca
        Televisor tele2 = new Televisor("LG", "M2", 2021, true, "1080p", 65, tipo);
        tele2.imprimirDatos();
        tele2.setMarca("Samsung");
        tele2.imprimirDatos();

        tele.encenderTelevisor();
        tele.apagarTelevisor();
    }

}
