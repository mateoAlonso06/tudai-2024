import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CargaYMuestra {
    static final int MAX = 5;
    public static void main(String[] args) {
        int[] arreglo = new int[MAX];

        cargarArreglo(arreglo);
        mostrarArreglo(arreglo);
    }

    public static void cargarArreglo(int[] arr) {
        for(int i = 0; i < MAX; i++) 
            arr[i] = cargarEntero();
    }

    public static void mostrarArreglo(int[] arr) {
        for(int i = 0; i < MAX; i++)
            System.out.print(arr[i] + " | ");
    }

    public static int cargarEntero() {
        int numero = 0;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        boolean valido = false;
        while(!valido) {
            try {
                System.out.println("Ingrese un numero entre 1 y 12:");
                numero = Integer.valueOf(entrada.readLine());
                if (numero >= 1 && numero <= 12)
                    valido = true;
            } catch (Exception exc) {
                System.out.println(exc);
            }
        }
        return numero;
    }
}
