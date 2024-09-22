import java.util.Random;
import java.util.Scanner;
import java.util.Locale;

public class Desafio {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        teclado.useLocale(Locale.US);

        int intentos = 0;
        int numeroSecreto = new Random().nextInt(100) + 1; // Genera un número entre 1 y 100
        int limiteIntentos = 10;
        boolean adivinado = false;

        System.out.println("Adivina el número entre 1 y 100. Tienes " + limiteIntentos + " intentos.");

        while (intentos < limiteIntentos && !adivinado) {
            System.out.print("Introduce tu intento: ");
            int intentoUsuario = teclado.nextInt();
            intentos++;

            if (intentoUsuario == numeroSecreto) {
                adivinado = true;
                System.out.println("¡Felicidades! Has adivinado el número en " + intentos + " intentos.");
            } else if (intentoUsuario < numeroSecreto) {
                System.out.println("El número es mayor. Inténtalo de nuevo.");
            } else {
                System.out.println("El número es menor. Inténtalo de nuevo.");
            }
        }

        if (!adivinado) {
            System.out.println("Lo siento, has agotado tus intentos. El número secreto era: " + numeroSecreto);
        }

        teclado.close(); // Cierra el Scanner
    }
}