import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Orden {
    final static int MAX = 8;
    public static void main(String[] args) {
        int[] arr = new int[MAX];
        cargarArreglo(arr);
        if(estaOrdenado(arr)) 
            System.out.println("El arreglo esta ordenado ascendentemente");
        else
            System.out.println("El arreglo no esta ordenado");
    }

    public static void cargarArreglo(int[] arr) {
        for (int i = 0; i < MAX; i++)
            arr[i] = cargarValor();
    }

    public static int cargarValor() {
        int numero = 0;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        boolean valido = false;
        while (!valido) {
            try {
                System.out.println("Ingrese un valor entero:");
                numero = Integer.valueOf(entrada.readLine());
                valido = true;
            } catch (Exception exc) {
                System.out.println(exc);
            }
        }
        return numero;
    }

    public static boolean estaOrdenado(int[] arr) {
        boolean ordenado = true;
        int i = 0;
        while (i < MAX - 1 && ordenado) {
            if (arr[i + 1] < arr[i])
                ordenado = false;
            i++;
        }
        return ordenado;
    }
    
    public static void mostrarArreglo(int[] arr) {
        for (int i = 0; i < MAX; i++)
            System.out.print(arr[i] + " | ");
    }
}
