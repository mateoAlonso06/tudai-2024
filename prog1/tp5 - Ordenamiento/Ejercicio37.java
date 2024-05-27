import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio37 {
    final static int MAX = 10;
    public static void main(String[] args) {
        int[] arr = {10, 55, 66, 2, 3, 0, 350, -44, 21, 23};
        mostrarArreglo(arr);
        int pos1 = obtenerPos();
        int pos2 = obtenerPos();

        ordenarArr(arr, pos1, pos2);
        mostrarArreglo(arr);
    }

    public static void mostrarArreglo(int[] arr) {
        for (int i = 0; i < MAX; i++) 
            System.out.print(arr[i] + " | ");
        System.out.println();
    }

    public static void ordenarArr(int[] arr, int pos1, int pos2) {
        // solo si la distancia entre los valores es una, por lo que no vale la pena iterar
        if (pos1 + 1 == pos2 || pos2 + 1 == pos1) {
            System.out.println("Ordenamiento A");
            if (pos1 > pos2) {
                int aux = arr[pos1];
                arr[pos1] = arr[pos2];
                arr[pos2] = aux;
            } else {
                int aux = arr[pos2];
                arr[pos2] = arr[pos1];
                arr[pos1] = aux;
            }
        } else {
            int aux;

            for (int i = pos1+1; i < pos2; i++) {
                for (int j = pos1; j < pos2; j++) {
                    if (arr[j] > arr[j+1]) {
                        aux = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = aux;
                    }
                }
            }
        }
    }

    public static int obtenerPos() {
        int pos = 0;
        boolean valido = false;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        while (!valido) {
            try {
                System.out.print("Ingrese una posicion desde 0 (incluido) y " + MAX + " (Sin incluir): ");
                pos = Integer.valueOf(entrada.readLine());
                if (pos >= 0 && pos < MAX)
                    valido = true;
            } catch (Exception exc) {
                System.out.println(exc);
            }
        }
        return pos;
    }
}
