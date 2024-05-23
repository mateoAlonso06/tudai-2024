/*Hacer un programa que dado un arreglo de enteros de tamaño
10 que se encuentra precargado, solicite al usuario un número
entero y elimine la primera ocurrencia del número (un número
igual) en el arreglo (si existe). Para ello tendrá que buscar la
posición y si está, realizar un corrimiento a izquierda (queda una
copia de la última posición del arreglo en la anteúltima posición).*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio18 {
    final static int MAX = 10;
    public static void main(String[] args) {
        int[] arreglo = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        mostrarArreglo(arreglo);
        // consigna
        int newValue = obtenerValor();
        int posicion = buscarOcurrencia(arreglo, newValue);
        if (posicion != -1) {
            eliminarOcurrencia(arreglo, posicion);
            mostrarArreglo(arreglo);
        }
        else
            System.out.println("El valor no se encontro dentro del arreglo");
    }

    public static int obtenerValor() {
        int valor = 0;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        boolean valido = false;
        while (!valido) {
            try {
                System.out.println("Ingrese un valor a buscar en el arreglo");
                valor = Integer.valueOf(entrada.readLine());
                valido = true;
            } catch (Exception exc) {
                System.out.println(exc);
            }
        }
        return valor;
    }

    public static int buscarOcurrencia(int[] arr, int val) {
        boolean existe = false;
        int i = 0;
        int pos = -1;
        while (i < MAX && !existe) {
            if (arr[i] == val) {
                existe = true;
                pos = i;
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

    public static void eliminarOcurrencia(int[] arr, int pos) {
        while (pos < MAX - 1) {
            arr[pos] = arr[pos + 1];
            pos++;
        }
    }
}
