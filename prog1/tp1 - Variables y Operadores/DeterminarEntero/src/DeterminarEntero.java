import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DeterminarEntero {
    public static void main(String[] args) {
        int numero;

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese un entero:");
            numero = Integer.valueOf(entrada.readLine());

            System.out.println("Inciso a: " + ((numero % 6 == 0) && (numero % 7 == 0)));
            System.out.println("Inciso b: " + (((numero > 30) && (numero % 2 == 0)) || (numero <= 30)));
            System.out.println("Inciso c: " + ((numero / 5) > 10));
        }
        catch (Exception exc) {

        }
    }
}
