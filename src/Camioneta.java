public class Camioneta extends Vehiculo {

    public Camioneta(String marca, String patente, Combustible combustible) {
        super(marca, patente, combustible);
    }

    public Camioneta() {
    }

    public void datosVehiculo() {
        System.out.print("Ingrese la marca del vehiculo: ");
        setMarca(sc.next());
        System.out.print("Ingrese la patente del vehiculo: ");
        setPatente(sc.next());
    }

    public Combustible crearCombustible(){
        Combustible combustible1= new Combustible();
        System.out.println("tipo de combustible");
        combustible1.setTipoCombustible(sc.next());
        System.out.println("precio combustible");
        combustible1.setPrecioCombustible(sc.nextDouble());
        return combustible1;
    }


    @Override
    public double calcularCostoDeCombustible(double distanciaEntreCiudades) {
        double consumo= ((distanciaEntreCiudades*10)/100);
        double costoCamioneta= crearCombustible().getPrecioCombustible() * consumo;
        System.out.println("costo de viajar en camioneta es " );
        return  costoCamioneta;
    }


}
