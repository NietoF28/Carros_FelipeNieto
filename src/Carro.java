

public class Carro extends Vehiculo{

    @Override
    public void encender() {
        System.out.println("El carro se encendio");
    }

    @Override
    public void apagar() {
        System.out.println("El carro se apago");
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Marca: "+getMarca()+" ,Modelo: "+getModelo()
        +",Combustible: "+getCombustible());

    }

    @Override
    public void setNivelCombustible(int nivelCombustible) {
        super.setNivelCombustible(nivelCombustible);
    }

    public Carro(String marca, String modelo, String combustible) {
        super(marca, modelo, combustible);
    }

    public Carro() {
    }

    @Override
    public String toString() {
        return "Carro{}";
    }
}
