import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CocienteDeUnEntero {
    public static void main(String[] args) {
        int numeroEntero;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Ingrese el numero entero: ");
            numeroEntero = Integer.valueOf(entrada.readLine());

            System.out.println("Cociente de la division de " + numeroEntero + " por 2, 3 y 4");
            System.out.println(numeroEntero / 2);
            System.out.println(numeroEntero / 3);
            System.out.println(numeroEntero / 4);
        }
        catch (Exception exc) {
            System.out.println(exc);
        }
    }
}
