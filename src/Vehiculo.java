import java.util.Scanner;

public abstract class Vehiculo {
    private String marca;
    private String patente;
    protected Combustible combustible;

    public Vehiculo(String marca, String patente, Combustible combustible) {
        this.marca = marca;
        this.patente = patente;
        this.combustible =  combustible;
    }

    public Vehiculo() {
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public Combustible getCombustible() {
        return combustible;
    }

    public void setCombustible(Combustible combustible) {
        this.combustible = combustible;
    }
    Scanner sc = new Scanner(System.in);

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", patente='" + patente + '\'' +
                ", combustible=" + combustible +
                '}';
    }

    public abstract void datosVehiculo();
    public abstract double calcularCostoDeCombustible(double distanciaEntreCiudades);
    public abstract Combustible crearCombustible();


}
