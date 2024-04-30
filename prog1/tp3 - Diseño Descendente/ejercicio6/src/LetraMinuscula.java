import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LetraMinuscula {
    public static void main(String[] args) {
        char letra = '0';
        letra = pedirCaracter();
        while(letra >= 'a' && letra <= 'z') {
            int valor = 9;
            int max = 10;
            imprimirTabla(valor, max);
            letra = pedirCaracter();
        }
        System.out.println("Fin del programa");
    }

    public static char pedirCaracter() {
        char c = '0';
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese un caracter:");
            c = entrada.readLine().charAt(0);
        } catch (Exception exc) {
            System.out.println(exc);
        }
        return c;
    }

    public static void imprimirTabla(int val, int max) {
        for(int i = 1; i <= max; i++) {
            System.out.println(val + " * " + i + " = " + (val * i));
        }
    }
}
