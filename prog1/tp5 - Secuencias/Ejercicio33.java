/*Hacer un programa que dado el arreglo definido y precargado,
y un número entero ingresado por el usuario, copie de forma
continua las secuencias de tamaño igual al número ingresado en
otro arreglo de iguales características e inicializado con 0. La
copia en este último arreglo deben comenzar desde el principio
del mismo. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio33 {
    final static int MAX = 20;
    final static int DIVISOR = 0;
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 0, 5, 6, 7, 8, 0, 9, 2, 0, 0, 5, 6, 7, 8, 0};
        System.out.println("Arreglo original:");
        mostrarArreglo(arr);
        int[] segundoArr = new int[MAX];
        int tam = obtenerTamanio();

        // Hay que hallar las secuencias de igual tamaño a tam;
        int ini = 0, fin = -1;
        int contador = 0;
        while (ini < MAX) {
            ini = obtenerInicio(arr, fin+1);
            if (ini < MAX) {
                fin = obtenerFin(arr, ini);
                // una vez hallada la secuencia comparo tamaños
                if ((fin-ini+1) == tam) {
                    contador++;
                    guardarValores(arr, ini, fin, segundoArr);
                }
            }
        }
        if (contador>0) {
            System.out.println("Asi quedo el segundo arreglo:");
            mostrarArreglo(segundoArr);
        } else {
            System.out.println("No se encontraron secuencias del tamaño asignado");
        }
    }

    public static void guardarValores(int[] arrA, int ini, int fin, int[] arrB) {
        // deberia hallar un cero antes de guardar valores asi se a partir de donde quedaron elementos guardados
        int indice = 0;
        while (indice < MAX && arrB[indice] != 0) {
            indice++;
        }

        // ahora solo quedar jugar con el indice
        for (int i = indice; i < MAX && ini <= fin; i++) {
            arrB[i] = arrA[ini];
            ini++;
        }   
    }

    public static void mostrarArreglo(int[] arr) {
        for (int i = 0; i < MAX; i++) 
            System.out.print(arr[i] + " | ");
        System.out.println();
    }

    public static int obtenerInicio(int[] arr, int pos) {
        while (pos < MAX && arr[pos] == DIVISOR)
            pos++;
        return pos;
    }

    public static int obtenerFin(int[] arr, int pos) {
        while (pos < MAX && arr[pos] != DIVISOR) 
            pos++;
        return pos-1;
    }

    public static int obtenerTamanio() {
        int tam = 0;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        boolean valido = false;
        while (!valido) {
            try {
                System.out.println("Ingrese un número menor a: " + MAX);
                tam = Integer.valueOf(entrada.readLine());
                valido = true;
            } catch (Exception exc) {
                System.out.println(exc);
            }
        }
        return tam;
    }
}
