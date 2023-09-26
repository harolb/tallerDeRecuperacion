public class Cuenta {
    private double saldoDeCuenta;
    private String nombreDelTitular;
    private  long numeroDeCuenta;

    public Cuenta( String nombreDelTitular ,double saldoDeCuenta) {

        this.saldoDeCuenta = saldoDeCuenta;
        this.nombreDelTitular = nombreDelTitular;
        this.numeroDeCuenta = (long) (Math.random()*9_000_000_000L)+ 1_000_000_000L;


    }
    public double setIngreso(double monto){
        if (monto>0){
            this.saldoDeCuenta += monto;
        }
        return monto;
    }
    public double setRetiro(double monto){
        if (monto>0 && monto <= this.saldoDeCuenta){
            this.saldoDeCuenta -=monto;
        }
        return monto;
    }
    public double getSaldoDeCuenta(){
        return this.saldoDeCuenta;
    }
    public String muestraDatos(){
        return "Titular de la Cuenta: "+ this.nombreDelTitular + " Saldo de la cuenta: "+ this.saldoDeCuenta + " Número de Cuenta: "+ this.numeroDeCuenta;
    }
}