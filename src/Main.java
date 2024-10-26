import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random nAleatorio = new Random();

        int n,n2,n3,n4;
        n = nAleatorio.nextInt(1,99);
        n2 = nAleatorio.nextInt(1,99);
        n3 = nAleatorio.nextInt(1,99);
        n4 = nAleatorio.nextInt(1,99);


        Carro carro1 = new Carro("Toyota","2020","Diesel");
        carro1.encender();
        carro1.setNivelCombustible(n);
        carro1.abastecerCombustible();
        carro1.apagar();
        carro1.mostrarInformacion();
        System.out.println("_____________________________");



        Camion camion1 = new Camion("Ford","1990","Diesel");

        camion1.encender();
        camion1.setNivelCombustible(n2);
        camion1.abastecerCombustible();
        camion1.apagar();
        camion1.mostrarInformacion();
        System.out.println("_____________________________");

        Moto moto1 = new Moto("Yamaha", "2025","Extra");

        moto1.encender();
        moto1.setNivelCombustible(n3);
        moto1.apagar();
        moto1.abastecerCombustible();
        moto1.mostrarInformacion();
        System.out.println("_____________________________");


        CarroElectrico carroElectrico1 = new CarroElectrico();

        carroElectrico1.setCargaBateria(n4);
        carroElectrico1.cargarbateria();
        carroElectrico1.niveldecarga();
        System.out.println("_____________________________");


    }
}