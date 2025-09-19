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
        return "Cuenta:\n " +
                "numerodecuenta: " + numerodecuenta +
                "\n cedula: " + cedula +
                "\n saldoactual:  " + saldoactual +
                '.';
    }public Double saldoactual (Double saldoactual) {
        if (saldoactual < 10000){
            System.out.println("Error: Saldo insuficiente ");
        } else {

        }
            System.out.println(1);

        return null ;
    }

    public Double ingresar (double monto) {
return this.saldoactual + monto;
    }
        public Double retirar (double monto2) {
            return this.saldoactual - monto2;


    }

    public Double  retirar2 (double monto3) {
        return this.saldoactual * 0.20;
    }


}
