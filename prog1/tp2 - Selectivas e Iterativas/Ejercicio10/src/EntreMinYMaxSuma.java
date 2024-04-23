import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EntreMinYMaxSuma {
    public static void main(String[] args) {
        final int MIN = 1;
        final int MAX = 10;

        int acumulador = 0;
        int numero;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Ingrese un numero entre " + MIN + " y " + MAX + " (inclusive):");
            numero = Integer.valueOf(entrada.readLine());

            while (numero >= MIN && numero <= MAX) {
                acumulador+= numero;

                System.out.println("Ingrese otro número:");
                numero = Integer.valueOf(entrada.readLine());
            }

            System.out.println();
        } catch (Exception exc) {
            System.out.println(exc);
        }
        if (acumulador != 0) {
            System.out.println("La suma de todos los valores ingresados da como resultado: " + acumulador);
        } else {
            System.out.println("No se ingresaron numeros dentro del bucle");
        }
    }
}