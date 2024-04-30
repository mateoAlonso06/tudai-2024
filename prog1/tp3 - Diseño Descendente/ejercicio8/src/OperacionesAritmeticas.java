import java.io.BufferedReader;
import java.io.InputStreamReader;

public class OperacionesAritmeticas {
    public static void main(String[] args) {
        final char SUMA = 'a';
        final char RESTA = 'b';
        final char PRODUCTO = 'c';
        final char DIVISION = 'd';

        int numero1 = 0, numero2 = 0;
        char operacion = '0';
        int resultado = 0;

        numero1 = pedirValorEntero();
        numero2 = pedirValorEntero();
        operacion = pedirCaracter();

        if (operacion == SUMA) {
            resultado = sumar(numero1, numero2);
            System.out.println("El resultado de la suma fue: " + resultado);
        }
        else if (operacion == RESTA) {
            resultado = restar(numero1, numero2);
            System.out.println("El resultado de la resta fue: " + resultado);
        }
        else if (operacion == PRODUCTO) {
            resultado = multiplicar(numero1, numero2);
            System.out.println("El resultado del producto fue: " + resultado);
        }
        else if (operacion == DIVISION) {
            if (numero2 != 0)  {
                resultado = dividir(numero1, numero2);
                System.out.println("El resultado de la division  fue: " + resultado);
            }
            else 
                System.out.println("No se puede dividir por cero");
        } else 
            System.out.println("Ingreso otro caracter");
    }

    public static int pedirValorEntero() {
        int numero = 0; 
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese un numero (entero):");
            numero = Integer.valueOf(entrada.readLine());
        } catch (Exception exc) {
            System.out.println(exc);
        }
        return numero;
    }

    public static char pedirCaracter() {
        char caracter = '0';
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese un caracter:");
            caracter = entrada.readLine().charAt(0);
        } catch (Exception exc) {
            System.out.println(exc);
        }
        return caracter;
    }

    public static int sumar(int num1, int num2) {
        return num1 + num2;
    }
    public static int restar (int num1, int num2) {
        return num1 - num2;
    }
    public static int multiplicar(int num1, int num2) {
        return num1 * num2;
    }
    public static int dividir(int num1, int num2) {
        if (num2 != 0)
            return num1 / num2;
        else
            return 0;
    }
}
