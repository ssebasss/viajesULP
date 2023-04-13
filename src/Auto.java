public class Auto extends Vehiculo{

    public Auto(String marca, String patente, Combustible combustible) {
        super(marca, patente, combustible);
    }

    public Auto() {
    }


    public void datosVehiculo() {
        System.out.print("Ingrese la marca del vehiculo: ");
        setMarca(sc.next());
        System.out.print("Ingrese la patente del vehiculo: ");
        setPatente(sc.next());
    }


    public Combustible crearCombustible(){
        Combustible combustible1= new Combustible();
        System.out.println("tipo combustible");
        combustible1.setTipoCombustible(sc.next());
        System.out.println("precio en ypf");
        combustible1.setPrecioCombustible(sc.nextDouble());
        return combustible1;
    }


    public double calcularCostoDeCombustible(double distanciaEntreCiudades) {
            double consumo= ((distanciaEntreCiudades*7)/100);
            double costoAuto= crearCombustible().getPrecioCombustible() * consumo;
            return  costoAuto;
    }

}
