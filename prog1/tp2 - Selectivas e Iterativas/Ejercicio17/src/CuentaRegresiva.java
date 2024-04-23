import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CuentaRegresiva {
    public static void main(String[] args) {
        final int MIN = 1;
        final int MAX = 10;

        int numero = 0;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            System.out.println("Ingrese un numero entre " + MIN + " y " + MAX + ":");
            numero = Integer.valueOf(entrada.readLine());
        } catch (Exception exc) {
            System.out.println(exc);
        }

        System.out.println();
        if (numero >= MIN && numero <= MAX) {
            for(int i = numero; i >= 0; i--) {
                if (i == 0)
                    System.out.print(i);
                else
                    System.out.print(i + " - ");
            }
        }
    }
}
