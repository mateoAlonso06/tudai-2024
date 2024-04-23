import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DividirPor {
    public static void main(String[] args) {
        final int CORTE = 0;

        int numero = 1;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Ingrese un numero distinto de:" + CORTE);
            numero = Integer.valueOf(entrada.readLine());
            
            while (numero != CORTE) {
                int divisor = 0, dividendo = 0;

                System.out.println("Ingrese el divisor:");
                divisor = Integer.valueOf(entrada.readLine());
                
                System.out.println("Ingrese el dividendo:");
                dividendo = Integer.valueOf(entrada.readLine());

                if (dividendo != 0) {
                    int resultado = divisor / dividendo;
                    System.out.println("El resultado de la division fue: " + resultado);
                } else {
                    System.out.println("No se puede dividir por cero");
                }

                System.out.println("Ingrese otro numero distinto de: " + CORTE);
                numero = Integer.valueOf(entrada.readLine());
            }
        } catch (Exception exc) {
            System.out.println(exc);
        }

        System.out.println("-----------------------------------------------------------------\nFin del programa");
    }
}
