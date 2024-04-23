import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EsMultiplo {
    public static void main(String[] args) {
        final int MIN = 1;
        final int MAX = 100;

        final int PRIMER_MULTIPLO = 2;
        final int SEGUNDO_MULTIPLO = 3;

        int numero;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Ingrese un numero entre (" + MIN + ") y (" + MAX + ")");
            numero = Integer.valueOf(entrada.readLine());
            
            while (numero > MIN && numero < MAX) {
                if ((numero % PRIMER_MULTIPLO == 0) && (numero % SEGUNDO_MULTIPLO == 0))
                    System.out.println("Es multiplo de " + PRIMER_MULTIPLO + " y " + SEGUNDO_MULTIPLO);
                else 
                    System.out.println("No cumple ambas condiciones");

                System.out.println("Ingrese nuevamente otro numero entre los mismos rangos:");
                numero = Integer.valueOf(entrada.readLine());
            }
        }
        catch(Exception exc) {
            System.out.println(exc);
        }
        System.out.println("Fin del programa");
    }
}
