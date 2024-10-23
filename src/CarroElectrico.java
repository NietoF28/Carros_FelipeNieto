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
        System.out.println("Carga actual: "+ ( getCargaBateria()+getNuevaCarga() ));

    }

    @Override
    public void niveldecarga() {
        System.out.println(getCargaBateria()+getNuevaCarga());

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
