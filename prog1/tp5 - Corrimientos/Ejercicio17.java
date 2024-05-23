/* Hacer un programa que dado un arreglo de enteros de tamaño 10 que se encuentra cargado, solicite
 * al usuario un numero entero y lo agregue al principio del arreglo (posicion 0). Para ello tendrá que realizar un 
 * corrimiento a derecha (se pierde el último valor del arreglo) y colocar el número en el arreglo en la posicion
 * indicada
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio17 {
    final static int MAX = 10;
    public static void main(String[] args) {
        int[] arreglo = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        mostrarArreglo(arreglo);
        // consigna
        int nuevoValor = obtenerValor();
        insertarValor(arreglo, nuevoValor);
        mostrarArreglo(arreglo);
    }

    public static int obtenerValor() {
        int valor = 0;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        boolean valido = false;
        while (!valido) {
            try {
                System.out.println("Ingrese un valor para insertar en el arreglo:");
                valor = Integer.valueOf(entrada.readLine());
                valido = true;
            } catch (Exception exc) {
                System.out.println(exc);
            }
        }
        return valor;
    }

    public static void insertarValor(int[] arr, int valor) {
        int pos = 0;
        corrimientoDerecha(arr, pos);
        arr[0] = valor;
    }

    public static void corrimientoDerecha(int[] arr, int pos) {
        int i = MAX - 1;
        while (i > pos) {
            arr[i] = arr[i - 1];
            i--;
        }
    }

    public static void mostrarArreglo(int[] arr) {
        for (int i = 0; i < MAX; i++) 
            System.out.print(arr[i] + " | ");
        System.out.println();
    }
}
