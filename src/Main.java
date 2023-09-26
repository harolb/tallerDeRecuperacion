import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lee = new Scanner(System.in).useDelimiter("\n");
        List<Cuenta> cuentas = new ArrayList<>();
        int i = 0;
        System.out.println("Bienvenido a la aplicación de ingreso de cuentas de banco más cuca del barrio.");

        System.out.println("Ingrese el numbre del cliente nuevo");
        String nombre = lee.next();
        System.out.println("Ingrese el Saldo de la cuenta");
        double sald = lee.nextDouble();
        Cuenta p1 = new Cuenta(nombre,sald);
        cuentas.add(p1);
        for ( i = 0; i<cuentas.size();i++){
            System.out.println("Ingrese el monto a retirar");
            double retiro = lee.nextDouble();
            System.out.println(cuentas.get(i).setRetiro(retiro));
            System.out.println("Ingres el monto a depositar");
            double depos = lee.nextDouble();
            System.out.println(cuentas.get(i).setIngreso(depos));
            System.out.println("El saldo en la cuenta es de "+cuentas.get(i).getSaldoDeCuenta());
            System.out.println(cuentas.get(i).muestraDatos());
        }
    }
}