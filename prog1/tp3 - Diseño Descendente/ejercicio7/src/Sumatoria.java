import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Sumatoria {
    public static void main(String[] args) {
        final int CORTE = 0;
        final int CANT_NUMEROS = 200;
        int numero = 0;

        numero = pedirEntero();

        while(numero != CORTE) {
            int sumatoria = calcularSumatoria(CANT_NUMEROS);
            System.out.println("La sumatoria es: " + sumatoria);

            numero = pedirEntero();
        }
        System.out.println("Fin del programa");
    }

    public static int pedirEntero() {
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

    public static int calcularSumatoria(int max) {
        int acumulador = 0;
        for (int i = 1; i <= max; i++) {
            acumulador += i;
        }
        return acumulador;
    }
}
