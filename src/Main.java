import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion;
        System.out.println("Que deseas hacer?\n 1.ingresar dinero\n 2.retirar dinero" );
        System.out.println("Ingrese el numero de la opcion: ");
        opcion = teclado.nextInt();
        Cuenta a1 = new Cuenta();
        switch (opcion) {
            case 1:
                System.out.println("Ingrese su saldo actual: \n (el monto minimo es de 10.000 COP) ");
                a1.saldoactual(teclado.nextDouble());
                System.out.println("Ingrese su cedula: ");
                a1.setCedula(teclado.nextInt());
                System.out.println("Ingrese su numero de cuenta: ");
                a1.setNumerodecuenta(teclado.nextInt());
                System.out.println(a1.);;
                System.out.println(a1.toString());

                Scanner ingresar = new Scanner(System.in);
                double monto;

                System.out.println("Ingrese el dinero que quiere ingresar: ");
                monto = ingresar.nextDouble();
                System.out.println("su saldo actual: ");

                System.out.println(a1.ingresar(monto)) ;

                return;
                case  2:
                    System.out.println("Ingrese su saldo actual: ");
                    a1.setSaldoactual(teclado.nextDouble());
                    System.out.println("Ingrese su cedula: ");
                    a1.setCedula(teclado.nextInt());
                    System.out.println("Ingrese su numero de cuenta: ");
                    a1.setNumerodecuenta(teclado.nextInt());
                    System.out.println(a1.toString());

                    Scanner retirar = new Scanner(System.in);
                    double monto2;

                    System.out.println("Ingrese el dinero que quiere retirar: ");
                    monto2 = retirar.nextDouble();
                    System.out.println("su saldo actual es de: ");
                    System.out.println(a1.retirar(monto2)) ;
            case 3:


        }
    }}