/*Suponer a partir de lo resuelto en el ejercicio anterior (11) que
el elemento a eliminar coincide con el último que hay en el arreglo.
¿Qué pasa en este caso? ¿Cómo daría una solución al problema? */

public class Ejercicio20 {
    final static int MAX = 10;
    public static void main(String[] args) {
        int[] arreglo = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        mostrarArreglo(arreglo);
        int pos = MAX - 3;
        eliminarElemento(arreglo, pos);
        mostrarArreglo(arreglo);
    }

    public static void mostrarArreglo(int[] arreglo) {
        for (int i = 0; i < MAX; i++) 
            System.out.print(arreglo[i] + " | ");
        System.out.println();
    }

    public static void eliminarElemento(int[] arr, int pos) {
        while (pos < MAX - 1) {
            arr[pos] = arr[pos + 1];
            pos++;
        }
    }
}
