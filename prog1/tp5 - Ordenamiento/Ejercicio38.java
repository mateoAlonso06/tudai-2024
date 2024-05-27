import java.util.Random;

public class Ejercicio38 {
    final static int MAX = 10;
    final static int MAXVALUE = 100;
    final static int MINVALUE = 0;
    public static void main(String[] args) {
        int[] arr = new int[MAX];
        cargarArreglo(arr);
        System.out.println("Arreglo original:");
        mostrarArreglo(arr);
        // arreglo ordenado decrecientemente 
        System.out.println("Arreglo decreciente:");
        ordenarDecreciente(arr);
        mostrarArreglo(arr);
        // arreglo ordenado crecientemente
        System.out.println("Arreglo creciente:");
        ordenarCreciente(arr);
        mostrarArreglo(arr);
    }

    public static void ordenarDecreciente(int[] arr) {
        for (int i = 1; i < MAX; i++) {
            for (int j = 0; j < MAX - 1; j++) {
                if (arr[j] < arr[j+1]) {
                    int aux = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = aux;
                }
            }
        }
    }

    public static void ordenarCreciente(int[] arr) {
        for (int i = 1; i < MAX; i++) {
            for (int j = 0; j < MAX - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    int aux = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = aux;
                }
            }
        }
    }

    public static void mostrarArreglo(int[] arr) {
        for (int i = 0; i < MAX; i++)
            System.out.print(arr[i] + " | ");
        System.out.println();
    } 

    public static void cargarArreglo(int[] arr) {
        Random r = new Random();
        for (int i = 0; i < MAX; i++) 
            arr[i] = (r.nextInt(MAXVALUE - MINVALUE + 1) + MINVALUE);
    }
}
