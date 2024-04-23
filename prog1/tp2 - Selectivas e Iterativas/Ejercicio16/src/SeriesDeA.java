import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SeriesDeA {
    public static void main(String[] args) {
        final int MAX = 15;
        char letra = '0';
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        // auxiliares
        int cantidadA = 0;
        int maxCantidadA = 0;

        for (int i = 0; i < MAX; i++) {
            try {
                System.out.println("Ingrese una letra:");
                letra = entrada.readLine().charAt(0);
            } catch (Exception exc) {
                System.out.println(exc);
            }

            if (letra == 'a') {
                cantidadA++;
                if (cantidadA > maxCantidadA) 
                    maxCantidadA = cantidadA;
            }
            else {
                cantidadA = 0;
            }
        }

        if (maxCantidadA > 0) 
            System.out.println("Se ingresaron: " + maxCantidadA + " \"a\" como serie maxima consecutiva");
        else 
            System.out.println("No se ingreso ninguna a minuscula");
    }
}