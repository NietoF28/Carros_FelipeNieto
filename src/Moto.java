public class Moto extends Vehiculo{
    @Override
    public void encender() {
        System.out.println("La moto se encendio");
    }

    @Override
    public void apagar() {
        System.out.println("La moto se apago");
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Marca: "+getMarca()+" ,Modelo: "+getModelo()
                +",Combustible: "+getCombustible());

    }

    public Moto() {
    }

    public Moto(String marca, String modelo, String combustible) {
        super(marca, modelo, combustible);
    }

    @Override
    public void setNivelCombustible(int nivelCombustible) {
        super.setNivelCombustible(nivelCombustible);
    }
}
