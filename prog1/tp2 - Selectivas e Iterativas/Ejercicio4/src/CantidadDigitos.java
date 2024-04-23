import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CantidadDigitos {
    public static void main(String[] args) {
        final int MIN = 0;
        final int MAX = 999;

        int numero;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Ingrese un numero entre " + MIN + " y " + MAX);
            numero = Integer.valueOf(entrada.readLine());

            if (numero > MIN && numero < MAX) {
                if (numero < 10)
                    System.out.println("Tiene 1 digito");
                else if (numero < 100)
                    System.out.println("Tiene 2 digitos");
                else 
                    System.out.println("El numero ingresado fue: " + numero + ". Este tiene 3 digitos");
            } else {
                System.out.println("El numero ingresado esta fuera de rango");
            }
        }
        catch(Exception exc) {
            System.out.println(exc);
        }
    }
}
