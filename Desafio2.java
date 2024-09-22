import java.util.Random;
import java.util.Scanner;
import java.util.Locale;
public class Desafio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        teclado.useLocale(Locale.US);
        String nombre = "Chalup Aldo";
        String tipoDeCuenta = "Corriente";
        double saldo = 20000;
        int opcion = 0;
        int retirar = 0;
        int depositar = 0;



        System.out.println("********************");
        System.out.println("\nNombre del cliente: " + nombre );
        System.out.println("El tipo de cuenta es: " + tipoDeCuenta);
        System.out.println("Su saldo disponible es: ");
        System.out.println("\n********************");


        String menu = """
                *** Escriba el numero de la opcion deseada***
                1 - Consultar saldo
                2 - retirar
                3 - Depositar
                9 - Salir
                """;
        while (opcion != 9) {
            System.out.println(menu);
            opcion = teclado.nextInt();

            if (opcion == 1) {
                System.out.println("Su saldo es de: " + saldo);
            } else if (opcion == 2) {
                System.out.println("ingrese el monto que desea retirar: ");
                retirar = teclado.nextInt();
                if (retirar > saldo) {
                    System.out.println("saldo insuficiente");
                }else {
                    System.out.println("la operacion se realizo con exito su saldo es: " +(saldo - retirar));
                }


            } else if (opcion == 3) {
                System.out.println("Ingrese el monto que desea depositar: ");
                depositar = teclado.nextInt();
                System.out.println("la operacion se realizo con exito su saldo es: " +(saldo + depositar));
            }else {
                System.out.println("la opcion ingresada no es correcta");
            }
        }


    }
}
