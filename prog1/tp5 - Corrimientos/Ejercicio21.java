/*Hacer un programa que inserte un elemento en un arreglo
(ordenado decrecientemente) de tamaño MAX=10. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio21 {
    final static int MAX = 10;
    public static void main(String[] args) {
        int[] arreglo = {100, 90, 80, 70, 60, 50, 40, 30, 20, 10};
        mostrarArreglo(arreglo);
        int nuevoValor = obtenerValor();
        int pos = obtenerPos(arreglo, nuevoValor);
        if (pos < MAX) {
            insertarElemento(arreglo, pos, nuevoValor);
            mostrarArreglo(arreglo);
        } else {
            corrimientoIzquierda(arreglo);
            arreglo[MAX - 1] = nuevoValor;
            mostrarArreglo(arreglo);
        }
    }

    public static int obtenerValor() {
        int valor = 0;
        boolean valido = false;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        while (!valido) {
            try {
                System.out.println("Ingrese un nuevo valor:");
                valor = Integer.valueOf(entrada.readLine());
                valido = true;
            } catch (Exception exc) {
                System.out.println(exc);
            }
        }
        return valor;
    }

    public static int obtenerPos(int[] arr, int val) {
        int i = 0;
        while (i < MAX && arr[i] > val) {
            i++;
        }
        return i;
    }

    public static void insertarElemento(int[] arreglo, int pos, int val) {
        corrimientoDerecha(arreglo, pos);
        arreglo[pos] = val;
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

    public static void corrimientoIzquierda(int[] arr) {
        int pos = 0;
        while (pos < MAX - 1) {
            arr[pos] = arr[pos + 1];
            pos++;
        }
    }
}
