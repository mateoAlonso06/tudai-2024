/*Hacer un programa que dado un arreglo de enteros de tamaño
10 que se encuentra precargado, solicite al usuario un número
entero y elimine todas las ocurrencia de número en el arreglo.
Mientras exista (en cada iteración tiene que buscar la posición
dentro del arreglo) tendrá que usar la posición para realizar un
corrimiento a izquierda (quedarán tantas copias de la última
posición del arreglo como cantidad de ocurrencias del número). */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio19 {
    final static int MAX = 10;
    public static void main(String[] args) {
        int[] arreglo = {10, 30, 30, 40, 50, 60, 30, 80, 20, 100};
        mostrarArreglo(arreglo);
        // consigna
        int valor = obtenerValor();
        buscarOcurrencias(arreglo, valor);
        mostrarArreglo(arreglo);
    }

    public static int obtenerValor() {
        int numero = 0;
        boolean valido = false;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        while (!valido) {
            try {
                System.out.println("Ingrese un valor a buscar dentro del arreglo:");
                numero = Integer.valueOf(entrada.readLine());
                valido = true;
            } catch (Exception exc) {
                System.out.println(exc);
            }
        }
        return numero;
    }

    public static void eliminarElemento(int[] arr, int pos) {
        while (pos < MAX - 1) {
            arr[pos] = arr[pos + 1];
            pos++;
        }
        System.out.println("Saliste del metodo eliminar elemento");
    }

    public static void buscarOcurrencias(int[] arr, int valor) {
        boolean existe = true;
        int pos = 0;
        while (existe) {
            pos = obtenerPos(arr, valor);
            if (pos != -1) {
                eliminarElemento(arr, pos);
            } else {
                existe = false;
            }
        }
    }

    public static int obtenerPos(int[] arr, int valor) {
        int i = 0;
        int pos = -1;
        boolean existe = false;
        while (i < MAX && !existe) {
            if (arr[i] == valor) {
                pos = i;
                existe = true;
            }
            i++;
        }
        return pos;
    }

    public static void mostrarArreglo(int[] arr) {
        for (int i = 0; i < MAX; i++) 
            System.out.print(arr[i] + " | ");
        System.out.println();
    }
}
