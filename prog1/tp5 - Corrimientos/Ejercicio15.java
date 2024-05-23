import java.io.BufferedReader;
import java.io.InputStreamReader;

// Los corrimientos a derecha se realizan desde el final.
public class Ejercicio15 {
    final static int MAX = 10;
    public static void main(String[] args) {
        int[] arreglo = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        mostrarArreglo(arreglo);
        // realizo la consigna
        int pos = obtenerPos();
        corrimientoDerecha(arreglo, pos);
        mostrarArreglo(arreglo);
    }

    public static void corrimientoDerecha(int[] arr, int pos) {
        int i = MAX - 1;
        while (i > pos) {
            arr[i] = arr[i - 1];
            i--;
        }
    }

    public static void mostrarArreglo(int[] arr) {
        for (int i : arr)
            System.out.print(i + " | ");
        System.out.println();
    }

    public static int obtenerPos() {
        int pos = 0;
        boolean valido = false;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        while (!valido) {
            try {
                System.out.print("Ingrese un valor entre 0 y " + MAX + ": ");
                pos = Integer.valueOf(entrada.readLine());
                if (pos >= 0 && pos < MAX) 
                    valido = true;
            } catch (Exception exc) {
                System.out.println(exc);
            }
        }
        return pos;
    }
}