import java.util.Scanner;

public class CarroElectrico implements VehiculoElectrico{
    Scanner teclado = new Scanner(System.in);
    private int cargaBateria = 10;
    private int nuevaCarga;

    @Override
    public void cargarbateria() {

        System.out.println("Bateria actual: "+ getCargaBateria());
        System.out.println("Ingresar carga: ");
        setNuevaCarga(teclado.nextInt());
        if (getNuevaCarga()>=1) {
            System.out.println("Se cargo correctamente");
        } else if (getNuevaCarga()<1) {
            System.out.println("Carga insuficiente");
        }
    }

    @Override
    public void niveldecarga() {
        if (getNuevaCarga()>=1) {
            System.out.println("Nivel de bateria: " + (getCargaBateria() + getNuevaCarga()));
        } else if (getNuevaCarga()<1) {
            System.out.println("No se a cargado");
        }
    }

    public CarroElectrico(int cargaBateria, int nuevaCarga) {
        this.cargaBateria = cargaBateria;
        this.nuevaCarga = nuevaCarga;
    }

    public CarroElectrico() {
    }

    public int getCargaBateria() {
        return cargaBateria;
    }

    public void setCargaBateria(int cargaBateria) {
        this.cargaBateria = cargaBateria;
    }

    public int getNuevaCarga() {
        return nuevaCarga;
    }

    public void setNuevaCarga(int nuevaCarga) {
        this.nuevaCarga = nuevaCarga;
    }

}
