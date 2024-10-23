public class Main {
    public static void main(String[] args) {

        Carro carro1 = new Carro("Toyota","2020","Diesel");

        carro1.encender();
        carro1.abastecerCombustible();
        carro1.apagar();
        carro1.mostrarInformacion();
        System.out.println("_____");


        Camion camion1 = new Camion("Ford","1990","Diesel");

        camion1.encender();
        camion1.abastecerCombustible();
        camion1.apagar();
        camion1.mostrarInformacion();
        System.out.println("_____");

        Moto moto1 = new Moto("Yamaha", "2025","Extra");

        moto1.encender();
        moto1.apagar();
        moto1.abastecerCombustible();
        moto1.mostrarInformacion();
        System.out.println("_____");

        CarroElectrico carroElectrico1 = new CarroElectrico();

        carroElectrico1.niveldecarga();
        carroElectrico1.cargarbateria();







    }
}