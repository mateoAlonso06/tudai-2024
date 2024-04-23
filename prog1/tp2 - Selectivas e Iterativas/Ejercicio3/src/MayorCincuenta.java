import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MayorCincuenta {
    public static void main(String[] args) {
        final int MAYOR_QUE = 50;
        
        int numero;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            System.out.println("Ingrese un numero mayor a " + MAYOR_QUE + ":");
            numero = Integer.valueOf(entrada.readLine());

            if (numero > MAYOR_QUE && ((numero % 2 == 0) || (numero % 3 == 0)))
                System.out.println("El numero ingresado es: " + numero);
        }
        catch(Exception exc) {
            System.out.println(exc);
        }
        System.out.println("Fin del programa");
    }
}
