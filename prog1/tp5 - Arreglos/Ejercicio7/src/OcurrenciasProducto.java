import java.io.BufferedReader;
import java.io.InputStreamReader;

public class OcurrenciasProducto {
    final static int MAX = 10;
    public static void main(String[] args) {
        int[] arr = {3, 2, 5, 10, 3, 8, 7, 2, 1, 20};
        mostrarArreglo(arr, MAX);
        int findNumber = pedirValor("Ingrese un valor a hallar en el arreglo");
        int productNumber = pedirValor("Ingrese el valor por el cual quiere multiplicar las ocurrencias de dicho numero:");

        int[] pos = ocurrencias(arr, findNumber);
        multiplicarOcurrencias(pos, arr, productNumber);
        mostrarArreglo(arr, MAX);
    }

    public static int pedirValor(String mensaje) {
        int numero = 0;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        boolean esValido = false;
        while (!esValido) {
            try {
                System.out.println(mensaje);
                numero = Integer.valueOf(entrada.readLine());
                esValido = true;
            } catch (Exception exc) {
                System.out.println(exc);
            }
        }
        return numero;
    }
    
    public static int[] ocurrencias(int[] arr, int num) {
        int tamanio = 0;
        for(int i = 0; i < MAX; i++) {
            if(arr[i] == num) 
                tamanio++;
        }

        int[] posiciones = new int[tamanio];

        int j = 0;

        for(int i = 0; i < MAX; i++) {
            if(arr[i] == num) {
                posiciones[j] = i;
                j++;
            }
        }
        return posiciones;
    }
    
    public static void mostrarArreglo(int[] arr, int MAX) {
        for(int i = 0; i < MAX; i++)
            System.out.print(arr[i] + " | ");
        System.out.println();
    }

    public static void multiplicarOcurrencias(int[] pos, int[] arr, int producto) {
        for(int i = 0; i < pos.length; i++) {
            arr[pos[i]] *= producto;
        }
    }
}
