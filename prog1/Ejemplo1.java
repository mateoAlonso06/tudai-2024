import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejemplo1 {
    final static int MAX_FILA = 3;
    final static int MAX_COLUMNA = 4;
    public static void main(String[] args) {
        int[][] matriz = new int[MAX_FILA][MAX_COLUMNA];

        cargarMatriz(matriz);
        mostrarMatriz(matriz);
    } 

    public static void cargarMatriz(int[][] matriz) {
        for (int i = 0; i < MAX_FILA; i++) {
            for (int j = 0; j < MAX_COLUMNA; j++) 
                matriz[i][j] = valorEntero();
        }
    }

    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < MAX_FILA; i++) {
            for (int j = 0; j < MAX_COLUMNA; j++) 
                System.out.print(matriz[i][j] + " | ");
            System.out.println();
        }
    }

    public static int valorEntero() {
        int numero = 0;
        boolean valido = false;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        while (!valido) {
            try {
                System.out.println("Ingrese un número entero:");
                numero = Integer.valueOf(entrada.readLine());
                valido = true;
            } catch (Exception exc) {
                System.out.println(exc);
            }
        }
        return numero;
    }
}
