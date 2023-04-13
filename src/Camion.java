public class Camion extends Vehiculo{

    public Camion(String marca, String patente, Combustible combustible) {
        super(marca, patente, combustible);
    }

    public Camion() {
    }

    public Combustible crearCombustible(){
        Combustible combustible1= new Combustible();
        System.out.println("tipo");
        combustible1.setTipoCombustible(sc.next());
        System.out.println("precio");
        combustible1.setPrecioCombustible(sc.nextDouble());
        return combustible1;
    }

    public void datosVehiculo() {
        System.out.print("Ingrese la marca del vehiculo: ");
        setMarca(sc.next());
        System.out.print("Ingrese la patente del vehiculo: ");
        setPatente(sc.next());
    }

    @Override
    public double calcularCostoDeCombustible(double distanciaEntreCiudades) {
        double consumo= ((distanciaEntreCiudades*12)/100);
        double costoCamion= crearCombustible().getPrecioCombustible() * consumo;
        System.out.println("costo de viajar en camion es " );
        return  costoCamion;
    }
}
