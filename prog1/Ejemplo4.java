/*Hacer un programa que dado una matriz de enteros de tamaño 4x5 que se
encuentra precargada, solicite al usuario una posición fila, columna y realice
un corrimiento a derecha. Además, imprima la matriz antes y después del
corrimiento. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejemplo4 {
    final static int MAX_FILA = 4;
    final static int MAX_COLUMNA = 5;
    public static void main(String[] args) {
        int[][] matriz = {
                            {5, 10, 15, 20, 25},
                            {25, 30, 35, 40, 45},
                            {-55, -50, -45, -35, -30},
                            {10, 22, 31, 44, 50}
                         };

        mostrar_matriz(matriz);

        String mensaje1 = "Ingrese una posicion de la fila (de 1 a " + MAX_FILA + ")";
        String mensaje2 = "Ingrese una posicion de la columna (de 1 a " + MAX_COLUMNA + ")";

        int numeroFila = pedirValor(mensaje1, MAX_FILA);
        int numeroColumna = pedirValor(mensaje2, MAX_COLUMNA);

        procesar_matriz(matriz[numeroFila - 1], numeroColumna - 1);
        mostrar_matriz(matriz);
    }

    public static void procesar_matriz(int[] matriz, int pos) {
        while (pos < MAX_COLUMNA - 1) {
            matriz[pos] = matriz[pos + 1];
            pos++;
        }
    }

    public static void mostrar_matriz(int[][] matriz) {
        for (int i = 0; i < MAX_FILA; i++) {
            for (int j = 0; j < MAX_COLUMNA; j++)
                System.out.print(matriz[i][j] + " | ");
            System.out.println();
        }
    }
    
    public static int pedirValor(String mensaje, int MAX) {
        int valor = 0;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        boolean valido = false;
        while (!valido) {
            try {
                System.out.println(mensaje);
                valor = Integer.valueOf(entrada.readLine());
                if (valor > 0 && valor <= MAX)
                    valido = true;
            } catch (Exception exc) {
                System.out.println(exc);
            }
        }
        return valor;
    }
}
