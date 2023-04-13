public class Combustible {

private String TipoCombustible;
private double precioCombustible;

    public Combustible(String tipoCombustible, double precioCombustible) {
        TipoCombustible = tipoCombustible;
        this.precioCombustible = precioCombustible;
    }

    public Combustible() {
    }

    public String getTipoCombustible() {
        return TipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        TipoCombustible = tipoCombustible;
    }

    public double getPrecioCombustible() {
        return precioCombustible;
    }

    public void setPrecioCombustible(double precioCombustible) {
        this.precioCombustible = precioCombustible;
    }
}
