/* 
  Implementar un método que realice un corrimiento a izquierda en un arreglo
  ordenado de tamaño MAX = 10 a partrir de una posición
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio16 {
    final static int MAX = 10;

    // Los corrimientos a izquierda se realizan desde pos hasta MAX - 1;
    public static void main(String[] args) {
        int[] arreglo = {20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10};
        mostrarArreglo(arreglo);
        // consigna
        int pos = obtenerPos();
        corrimientoIzquierda(arreglo, pos);
        mostrarArreglo(arreglo);
    }

    public static int obtenerPos() {
        int pos = 0;
        boolean valido = false;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        while (!valido) {
            try {
                System.out.print("Ingrese una posición entre 0 y " + MAX + ": ");
                pos = Integer.valueOf(entrada.readLine());
                if (pos >= 0 && pos < MAX) 
                    valido = true;
            } catch (Exception exc) {
                System.out.println(exc);
            }
        }
        return pos;
    }

    public static void corrimientoIzquierda(int[] arr, int pos) {
        while (pos < MAX - 1) {
            arr[pos] = arr[pos + 1];
            pos++;
        }
    }

    public static void mostrarArreglo(int[] arr) {
        for (int i = 0; i < MAX; i++) 
            System.out.print(arr[i] + " | ");
        System.out.println();
    }
}