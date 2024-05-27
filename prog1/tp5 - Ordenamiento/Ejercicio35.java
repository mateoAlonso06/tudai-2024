import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio35 {
    final static int MAX = 10;
    final static int DIVIDER = 0;
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        mostrarArreglo(arr);
        int numero = obtenerEntero();
        insertarValor(arr, numero);
        mostrarArreglo(arr);
    }

    public static void mostrarArreglo(int[] arr) {
        for (int i = 0; i < MAX; i++) 
            System.out.print(arr[i] + " | ");
        System.out.println();
    }

    public static void insertarValor(int[] arr, int numero) {
        int pos = buscarPos(arr, numero);
        /*
            Si el valor a ingresar es más chico que todos los contenidos en el array
            hago un corrimiento en todos las posiciones e inserto el valor en el primer indice
         */
        System.out.println("Pos vale: " + pos);
        if (pos == MAX) {
            arr[MAX-1] = numero;
        } else {
            corrimiento(arr, pos);
            arr[pos] = numero;
        }
    }

    public static void corrimiento(int[] arr, int pos) {
        int i = MAX - 1;
        while (i > pos) {
            arr[i] = arr[i - 1];
            i--;
        }
    }

    public static int buscarPos(int[] arr, int num) {
        int pos = 0;
        while (pos < MAX && arr[pos] < num)
            pos++;
        return pos;
    }

    public static int obtenerEntero() {
        int numero = 0;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        boolean valido = false;
        while (!valido) {
            try {
                System.out.println("Ingrese un valor a insertar en el arreglo:");
                numero = Integer.valueOf(entrada.readLine());
                valido = true;
            } catch (Exception exc) {
                System.out.println(exc);
            }
        }
        return numero;
    }
}

