import java.util.Scanner;

abstract public class Vehiculo   {
    Scanner teclado = new Scanner(System.in);
    private String marca;
    private String modelo;
    private String combustible;
    private int nivelCombustible=20;
    private int n=0;

    public abstract void encender ();

    public abstract void apagar ();

    public abstract void mostrarInformacion ();

    public void abastecerCombustible (){
        System.out.println("nivel de combustible: " + nivelCombustible );
        System.out.println("cuanto combustible desea cargar?");
        n = teclado.nextInt();
        if (n >= 1){
        System.out.println("nivel de combustible: "+(n+nivelCombustible));
        } if (n < 0){
            System.out.println("El nivel de combustible debe ser mayor a 0");
        }
    }


    public Vehiculo() {

    }

    public Vehiculo(String marca, String modelo, String combustible) {
        this.marca = marca;
        this.modelo = modelo;
        this.combustible = combustible;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public int getNivelCombustible() {
        return nivelCombustible;
    }

    public void setNivelCombustible(int nivelCombustible) {
        this.nivelCombustible = nivelCombustible;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "combustible='" + combustible + '\'' +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}

