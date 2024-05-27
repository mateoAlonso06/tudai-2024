/*Se tiene un arreglo de enteros de tamaño 20 de secuencias de
números entre 1 y 9, separadas por 0. El arreglo está precargado,
y además empieza y termina con uno o más separadores 0. Hacer
un programa que permita obtener a través de métodos la posición
de inicio y la posición de fin de la secuencia ubicada a partir de
una posición entera ingresada por el usuario. Finalmente, si
existen imprima por pantalla ambas posiciones obtenidas. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio32 {
    final static int MAX = 20;
    final static int DIVISOR = 0;
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 0, 5, 6, 7, 8, 0, 9, 2, 0, 0, 5, 6, 7, 8, 0};

        int posEntero = obtenerPos();
    
        boolean encontrado = false;
        int ini = -1, fin = posEntero-1;
        while (ini < MAX && !encontrado) {
            ini = obtenerInicio(arr, posEntero+1);
            if (ini < MAX) {
                fin = obtenerFin(arr, ini);
                // una vez hallado un inicio y un final encontrado es true porque lo que el bucle deberia frenar
                encontrado = true;
            }
        }

        if (encontrado) 
            System.out.println("La siguiente posicion de arranque de la secuencia es: " + ini + " y su fin es: " + fin);
        else
            System.out.println("No se encontro ninguna secuencia a partir de la posicion ingresada");
    }

    public static int obtenerFin(int[] arr, int pos) {
        while (pos < MAX && arr[pos] != DIVISOR)
            pos++;
        return pos-1;
    }

    public static int obtenerInicio(int[] arr, int pos) {
        while (pos < MAX && arr[pos] == DIVISOR) 
            pos++;
        return pos;
    }

    public static int obtenerPos() {
        int pos = 0;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        boolean valido = false;
        while (!valido) {
            try {
                System.out.println("Ingrese una posicion menor a " + MAX);
                pos = Integer.valueOf(entrada.readLine());
                valido = true;
            } catch (Exception exc) {
                System.out.println(exc);
            }
        }
        return pos;
    }
}
