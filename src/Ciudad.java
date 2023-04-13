public class Ciudad {

private String ciudadOrigen;
private double kmOrigen;
private String ciudadDestino;
private double kmDestino;

    public Ciudad(String ciudadOrigen, double kmOrigen, String ciudadDestino, double kmDestino) {
        this.ciudadOrigen = ciudadOrigen;
        this.kmOrigen = kmOrigen;
        this.ciudadDestino = ciudadDestino;
        this.kmDestino = kmDestino;
    }

    public Ciudad() {

    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    public double getKmOrigen() {
        return kmOrigen;
    }

    public void setKmOrigen(double kmOrigen) {
        this.kmOrigen = kmOrigen;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public void setCiudadDestino(String ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }

    public double getKmDestino() {
        return kmDestino;
    }

    public void setKmDestino(double kmDestino) {
        this.kmDestino = kmDestino;
    }


    @Override
    public String toString() {
        return "Ciudad{" +
                "ciudadOrigen='" + ciudadOrigen + '\'' +
                ", kmOrigen=" + kmOrigen +
                ", ciudadDestino='" + ciudadDestino + '\'' +
                ", kmDestino=" + kmDestino +
                '}';
    }
}
