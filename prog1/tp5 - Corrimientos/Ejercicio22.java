public class Ejercicio22 {
    final static int MAX = 10;
    public static void main(String[] args) {
        int[] arreglo = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        mostrarArreglo(arreglo);

        // consigna
        eliminarOcurrencias(arreglo);
    }

    public static void eliminarOcurrencias(int[] arr) {
        boolean existe = true;
        int pos = 0;
        // int it = 0;
        while (existe) {
            pos = obtenerPos(arr);
            if (pos < MAX) {
                if (arr[MAX - 1] % 2 == 0) {
                    arr[MAX - 1] = 1;
                }  
                eliminarElemento(arr, pos);
            } 
            else 
                existe = false;
        }
        System.out.println("Fin de la busqueda");

        mostrarArreglo(arr);
    }

    public static int obtenerPos(int[] arr) {
        int i = 0;
        while (i < MAX && (arr[i] % 2) != 0) 
            i++;
        return i;
    }

    public static void eliminarElemento(int[] arr, int pos) {
        while (pos < MAX - 1) {
            arr[pos] = arr[pos + 1];
            pos++;
        }
    }

    public static void mostrarArreglo(int[] arr) {
        for (int i = 0; i < MAX; i++) 
            System.out.print(arr[i] + " | ");
        System.out.println();
    }
}
