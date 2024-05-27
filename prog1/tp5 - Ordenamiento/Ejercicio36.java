import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio36 {
    final static int MAX = 10;
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 70, 90, 110, 130, 155};
        mostrarArreglo(arr);
        int numero = obtenerEntero();
        int posOcurrencia = obtenerOcurrencia(arr, numero);
        if (posOcurrencia != -1) {
            eliminarOcurrencia(arr, posOcurrencia);   
            mostrarArreglo(arr);
        }
        else
            System.out.println("No se encontro el valor dentro del arreglo");
    }
    
    public static void mostrarArreglo(int[] arr) {
        for (int i = 0; i < MAX; i++) 
            System.out.print(arr[i] + " | ");
        System.out.println();
    }

    public static void eliminarOcurrencia(int[] arr, int pos) {
        while (pos < MAX - 1) {
            arr[pos] = arr[pos+1];
            pos++;
        }
    }

    public static int obtenerOcurrencia(int[] arr, int numero) {
        int pos = -1;
        int i = 0;
        boolean encontrado = false;
        while (i < MAX && !encontrado) {
            if (arr[i] == numero) {
                encontrado = true;
                pos = i;
            }
            i++;
        }
        return pos;
    }

    public static int obtenerEntero() {
        int num = 0;
        boolean valido = false;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        while (!valido) {
            try {
                System.out.println("Ingrese un numero:");
                num = Integer.valueOf(entrada.readLine());
                valido = true;
            } catch (Exception exc) {
                System.out.println(exc);
            }
        }
        return num;
    }
}
