public class Camion extends Vehiculo{


    @Override
    public void encender() {
        System.out.println("El camion se encendio");
    }

    @Override
    public void apagar() {
        System.out.println("El camion se apago");
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Marca: "+getMarca()+" ,Modelo: "+getModelo()
                +",Combustible: "+getCombustible());

    }

    public Camion() {
    }

    public Camion(String marca, String modelo, String combustible) {
        super(marca, modelo, combustible);
    }

    @Override
    public void setNivelCombustible(int nivelCombustible) {
        super.setNivelCombustible(nivelCombustible);
    }
}
