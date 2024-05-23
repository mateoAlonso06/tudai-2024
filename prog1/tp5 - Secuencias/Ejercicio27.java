/*Hacer un programa que dado un número N ingresado por el
usuario, elimine las secuencias de tamaño N de números distintos
de cero.*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio27 {
    final static int MAX = 20;
    final static int DIVISOR = 0;
    public static void main(String[] args) {
        int[] arreglo =  {0, 1, 2, 33, 4, 0, 1, 0, 3, 4, 0, 1, 2, 3, 4, 0, 3, 4, 0, 1};
        mostrarArreglo(arreglo);
        int tamanio = pedirTamanio();
        int ini = 0, fin = -1;

        while (ini < MAX) {
            ini = obtenerInicio(arreglo, fin + 1);
            if (ini < MAX) {
                fin = obtenerFin(arreglo, ini);
                int tamanioSecuencia = obtenerTamanio(arreglo, ini, fin);
                if (tamanio == tamanioSecuencia) {
                    eliminarSecuencia(arreglo, ini, fin);
                    fin = ini;
                }
            }
        }
        mostrarArreglo(arreglo);
    }

    public static void eliminarSecuencia(int[] arreglo, int ini, int fin) {
        for (int i = ini; i <= fin; i++) {
            corrimiento_a_izquierda(arreglo, ini);
        }
    }

    public static void corrimiento_a_izquierda(int[] arr, int pos) {
        while (pos < MAX - 1) {
            arr[pos] = arr[pos + 1];
            pos++;
        }
    }

    public static int pedirTamanio() {  
        int tam = 0;
        boolean valido = false;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        while (!valido) {
            try {
                System.out.println("Ingrese el tamañio que desea buscar para eliminar (menor a "+MAX+"):");
                tam = Integer.valueOf(entrada.readLine());
                if (tam < MAX) 
                    valido = true;
            } catch (Exception exc) {
                System.out.println(exc);
            }
        }
        return tam;
    }

    public static int obtenerInicio(int[] arreglo, int pos) {
        while (pos < MAX && arreglo[pos] == DIVISOR)
            pos++;
        return pos;
    }

    public static int obtenerFin(int[] arreglo, int pos) {
        while (pos < MAX && arreglo[pos] != DIVISOR)
            pos++;
        return pos-1;
    }

    public static int obtenerTamanio(int[] arr, int ini, int fin) {
        int cant = 0;
        for (int i = ini; i <= fin; i++) 
            cant++;
        return cant;
    }

    public static void mostrarArreglo(int[] arr) {
        for (int i = 0; i < MAX; i++) 
            System.out.print(arr[i] + " | ");
        System.out.println();
    }

    public static void eliminarSecuencia(int[] arr, int ini, int fin, int cant) {
        for (int i = 0; i < cant; i++) {
            while (ini < fin - 1) {
                arr[ini] = arr[ini + 1];
                ini++;
            }
        }
    }
}
