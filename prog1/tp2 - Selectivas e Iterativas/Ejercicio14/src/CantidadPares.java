import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CantidadPares {
    public static void main(String[] args) {
        final int MAX = 10;

        int numero;
        int cantidadPares = 0;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < MAX; i++) {
            try {
                System.out.println("Ingresa un numero entero positivo:");
                numero = Integer.valueOf(entrada.readLine());
                if(numero > 0 && numero % 2 == 0) {
                    cantidadPares++;
                } else {
                    if(numero <= 0) 
                        System.out.println("El numero ingresado es menor o igual a cero");
                    else
                        System.out.println("El numero ingresado no es par");
                }
            }
            catch (Exception exc) {
                System.out.println(exc);
            }
        }
        System.out.println("Se ingresaron: " + cantidadPares + " numeros pares positivos");
    }
}
