//Hacer un programa que dado una matriz de enteros de tamaño 4*5, encuentre la posición
//fila,columna de un número entero ingresado por el usuario. Si existe, muestre esa posición por
//pantalla, o indique que no existe.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejemplo3 {
    final static int MAX_FILA = 4;
    final static int MAX_COLUMNA = 5;
    public static void main(String[] args) {
        int[][] matriz = {
                            {1, 2 , 3, 4, 5},
                            {6, 7, 8, 9, 10},
                            {11, 12, 2, 14},
                            {15, 16, 17, 18}
                        };
        int numero = pedirNumero();

        imprimir_elemento(matriz, numero);
    }

    public static void imprimir_elemento(int[][] matriz, int numero) {
        int fila = 0, columna = MAX_COLUMNA;
        while ((fila < MAX_FILA) && (columna == MAX_COLUMNA)) {
            columna = buscarPos(matriz[fila], numero);
            if (columna == MAX_COLUMNA)
                fila++;
        }

        if ((fila < MAX_FILA) && (columna < MAX_COLUMNA))
            System.out.println("El numero: " + numero + " fue encontrado en la fila: " + (fila + 1) + ", columna: " + (columna + 1));
        else 
            System.out.println("No se hallo el valor en la matriz");
    }

    public static int buscarPos(int[] matriz, int numero) {
        int pos = 0;
        while (pos < MAX_COLUMNA && matriz[pos] != numero)
            pos++;
        return pos;
    }

    public static int pedirNumero() {
        int numero = 0;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        boolean valido = false;
        while (!valido) {
            try {
                System.out.println("Ingrese un valor a buscar dentro de la matriz");
                numero = Integer.valueOf(entrada.readLine());
                valido = true;
            } catch (Exception exc) {
                System.out.println(exc);
            }
        }
        return numero;
    }
}
