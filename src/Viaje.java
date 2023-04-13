import java.util.Scanner;

public class Viaje {
     private Ciudad ciudad;
     private double distanciaEntreCiudadesDistintasCiudades;
     private Vehiculo vehiculo;
     private int CantidadPeajes;
     private String ruta;


     public Viaje(Ciudad ciudad, double distanciaEntreCiudadesDistintasCiudades, Vehiculo vehiculo, int cantidadPeajes, String ruta) {
          this.ciudad = ciudad;
          this.distanciaEntreCiudadesDistintasCiudades = distanciaEntreCiudadesDistintasCiudades;
          this.vehiculo = vehiculo;
          CantidadPeajes = cantidadPeajes;
          this.ruta = ruta;
     }

     public Viaje(Ciudad ciudad, Vehiculo vehiculo, int cantidadPeajes, String ruta) {
          this.ciudad = ciudad;
          this.vehiculo = vehiculo;
          CantidadPeajes = cantidadPeajes;
          this.ruta = ruta;
     }

     public String getRuta() {
          return ruta;
     }

     public void setRuta(String ruta) {
          this.ruta = ruta;
     }

     public int getCantidadPeajes() {
          return CantidadPeajes;
     }

     public void setCantidadPeajes(int cantidadPeajes) {
          CantidadPeajes = cantidadPeajes;
     }

     public Viaje() {
     }

     public Ciudad getCiudad() {
          return ciudad;
     }

     public void setCiudad(Ciudad ciudad) {
          this.ciudad = ciudad;
     }

     public double getDistanciaEntreCiudadesDistintasCiudades() {
          return distanciaEntreCiudadesDistintasCiudades;
     }

     public void setDistanciaEntreCiudadesDistintasCiudades(double distanciaEntreCiudadesDistintasCiudades) {
          this.distanciaEntreCiudadesDistintasCiudades = distanciaEntreCiudadesDistintasCiudades;
     }

     public Vehiculo getVehiculo() {
          return vehiculo;
     }

     public void setVehiculo(Vehiculo vehiculo) {
          this.vehiculo = vehiculo;
     }

     Scanner sc = new Scanner(System.in).useDelimiter("\n");

     public Ciudad crearCiudad(){
          Ciudad ciudad= new Ciudad();
          System.out.println("ingrese ciudad de origen");
          ciudad.setCiudadOrigen(sc.next());
          System.out.println("ingrese km de la ciudad de origen");
          ciudad.setKmOrigen(sc.nextDouble());
          System.out.println("ingrese ciudad de destino");
          ciudad.setCiudadDestino(sc.next());
          System.out.println("ingrese km de la ciudad de destino");
          ciudad.setKmDestino(sc.nextDouble());
          System.out.println("estan las ciudades sobre la misma ruta??");
          setRuta(sc.next());
          setCiudad(ciudad);
          if (getRuta().equalsIgnoreCase("si")){
             calculoDistancia();
          }
          else {
               System.out.println("ingrese los kms que separan la ciudad de origen y la de destino");
               setDistanciaEntreCiudadesDistintasCiudades(sc.nextDouble());
          }
          return ciudad;
     }



     private double calculoDistancia(){
          double kmCiudadesMismaRuta =Math.abs(this.ciudad.getKmDestino() - this.ciudad.getKmOrigen()) ;
          System.out.println("las ciudad se hayan a : "+kmCiudadesMismaRuta+ " kms de distancia");
          return kmCiudadesMismaRuta;
     }




     private Vehiculo iniciarViaje() {
          Scanner scanner = new Scanner(System.in);
          System.out.println("Elija el tipo de vehículo:");
          System.out.println("1. Auto");
          System.out.println("2. Camioneta");
          System.out.println("3. Camión");
          int opcion = scanner.nextInt();
          Vehiculo vehiculoo = null;
          switch (opcion) {
               case 1:
                    vehiculoo = new Auto();
                    break;
               case 2:
                    vehiculoo = new Camioneta();
                    break;
               case 3:
                    vehiculoo = new Camion();
                    break;
               default:
                    System.out.println("Opción inválida");
          }
          vehiculoo.datosVehiculo();

         // vehiculoo.calcularCostoDeCombustible(calculoDistancia());

         /* if (getRuta().equalsIgnoreCase("si")){
               double sumaTotal= costoPeajes() + vehiculoo.calcularCostoDeCombustible( calculoDistancia());
               System.out.println("costo peajes: "+ costoPeajes());
               System.out.println("costo combustible teniendo en cuenta consumo y precio  "+ vehiculoo.calcularCostoDeCombustible( calculoDistancia()));
               System.out.println("costo total si el viaje comprende destino ubicados en la misma ruta "+ sumaTotal);
          }else {
               double sumaTotal= costoPeajes() + vehiculoo.calcularCostoDeCombustible(getDistanciaEntreCiudadesDistintasCiudades());
               System.out.println("costo peajes: "+ costoPeajes());
               System.out.println("costo combustible teniendo en cuenta consumo y precio  "+ vehiculoo.calcularCostoDeCombustible(getDistanciaEntreCiudadesDistintasCiudades()));
               System.out.println("costo total si el viaje comprende destino ubicados diferentes rutas "+ sumaTotal);
          }*/
          return vehiculoo;
     }

     private double costoPeajes(){
          System.out.println("cantidad de cada peajes?");
          this.setCantidadPeajes(sc.nextInt());
          System.out.println("ingrese el precio de cada peaje, independientemente del vehiculo");
          double precioPeaje=sc.nextDouble();
          double costoPeaje= (double) getCantidadPeajes() * precioPeaje;
          return costoPeaje;
     }


     public double costoTotal(){
          double sumaTotal;
          if (getRuta().equalsIgnoreCase("si")){
               sumaTotal= costoPeajes() + iniciarViaje().calcularCostoDeCombustible(calculoDistancia());
               System.out.println("costo total si el viaje comprende destino ubicados en la misma ruta "+ sumaTotal);
          }else {
               sumaTotal= costoPeajes() + iniciarViaje().calcularCostoDeCombustible(getDistanciaEntreCiudadesDistintasCiudades());
               System.out.println("costo total si el viaje comprende destino ubicados diferentes rutas "+ sumaTotal);
          }
          return sumaTotal;
     }

     @Override
     public String toString() {
          return "Viaje{" +
                  "ciudad=" + ciudad +
                  ", distanciaEntreCiudadesDistintasCiudades=" + distanciaEntreCiudadesDistintasCiudades +
                  ", vehiculo=" + vehiculo +
                  '}';
     }
}
