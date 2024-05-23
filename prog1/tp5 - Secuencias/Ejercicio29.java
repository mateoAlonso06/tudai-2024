/*Hacer un programa que elimine de un arreglo todas las secuencias
 que tienen orden descendente entre sus elementos
 */
public class Ejercicio29 {
    final static int MAX = 20;
    final static int DIVISOR = 0;
    public static void main(String[] args) {
        int[] arreglo =  {0, 10, 5, 4, 3, 0, 1, 0, 5, 2, 0, 1, 2, 3, 0, 0, 99, 77, 55, 0 };
        System.out.println("Arreglo original");
        mostrarArreglo(arreglo);
        int ini = 0, fin = -1;
        while (ini < MAX) {
            ini = obtenerInicio(arreglo, fin + 1);
            if (ini < MAX) {
                fin = obtenerFin(arreglo, ini);
                if (esDescendente(arreglo, ini, fin)) {
                    System.out.println("Eliminando secuencia");
                    eliminarSecuencia(arreglo, ini, fin);
                    fin = ini - 1;
                }
            }
        }
        System.out.println("Arreglo despues de la secuencia");
        mostrarArreglo(arreglo);
    }

    public static void mostrarArreglo(int[] arr) {
        for (int i = 0; i < MAX; i++) 
            System.out.print(arr[i] + " | ");
        System.out.println();
    }

    public static void eliminarSecuencia(int[] arr, int ini, int fin) {
        for (int i = ini; i <= fin; i++) {
            corrimiento_a_izquierda(arr, ini);
        }
    }

    public static void corrimiento_a_izquierda(int[] arr, int ini) {
        while (ini < MAX - 1) {
            arr[ini] = arr[ini + 1];
            ini++;
        }
    }

    public static boolean esDescendente(int[] arr, int ini, int fin) {
        while (ini < fin && arr[ini] > arr[ini + 1])
            ini++;
        return ini == fin;
    }

    public static int obtenerInicio(int[] arreglo, int pos) {
        while (pos < MAX && arreglo[pos] == DIVISOR) 
            pos++;
        return pos;
    }

    public static int obtenerFin(int[] arreglo, int pos) {
        while (pos < MAX && arreglo[pos] != DIVISOR)
            pos++;
        return pos-1;
    }
}
