public class Cuenta {

    private int numerodecuenta;
    private int cedula;
    private Double saldoactual;

    //constructor vacio
    public Cuenta () {
    }
    //CONSTRUCTOR CON PARAMETROS


    public Cuenta(int numerodecuenta, int cedula, Double saldoactual) {
        this.numerodecuenta = numerodecuenta;
        this.cedula = cedula;
        this.saldoactual = saldoactual;
    }
    //get and set


    public int getNumerodecuenta() {
        return numerodecuenta;
    }

    public void setNumerodecuenta(int numerodecuenta) {
        this.numerodecuenta = numerodecuenta;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public Double getSaldoactual() {
        return saldoactual;
    }

    public void setSaldoactual(Double saldoactual) {
        this.saldoactual = saldoactual;
    }
    //metodo tostring

    @Override
    public String toString() {
        return "Cuenta{" +
                "numerodecuenta=" + numerodecuenta +
                ", cedula=" + cedula +
                ", saldoactual=" + saldoactual +
                '}';
    }

}
