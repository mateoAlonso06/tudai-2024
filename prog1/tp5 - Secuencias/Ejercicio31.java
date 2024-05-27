public class Ejercicio31 {
    final static int MAX = 20;
    final static int DIVIDER = 0;
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 0, 5, 6, 7, 8, 0, 9, 10, 0, 0, 5, 6, 7, 8, 0};
        mostrarArreglo(arr);

        int lastIni = 0;
        int lastFin = 0;

        // consigna
        int ini = 0, fin = -1;
        while (ini < MAX) {
            ini = obtenerInicio(arr, fin+1);
            if (ini < MAX) {
                fin = obtenerFin(arr, ini);
                lastIni = ini;
                lastFin = fin;
            }
        }

        // System.out.println("Ultima secuencia: primer indice: " + lastIni);
        // System.out.println("Ultima secuencia: ultimo indice: " + lastFin);

        if (fin != -1) {
            invertirSecuencia(arr, lastIni, lastFin);
            System.out.println("Arreglo invertido");
            mostrarArreglo(arr);
        }
        else 
            System.out.println("No se encontro ninguna secuencia");

    }

    public static void mostrarArreglo(int[] arr) {
        for (int i = 0; i < arr.length; i++) 
            System.out.print(arr[i] + " | ");
        System.out.println();
    }

    public static void invertirSecuencia(int[] arr, int ini, int fin) {
        int[] arrAux = new int[fin-ini+1];
        // asigno los valores a un nuevo arreglo
        int k = 0;
        for (int i = fin; i >= ini; i--) {
            arrAux[k] = arr[i];
            k++;
        }
        // guardo los valores en el arreglo original
        k = 0;
        for (int i = ini; i <= fin; i++) {
            arr[i] = arrAux[k];
            k++;
        }
    }

    public static int obtenerInicio(int[] arr, int pos) {
        while (pos < MAX && arr[pos] == DIVIDER)
            pos++;
        return pos;
    }

    public static int obtenerFin(int[] arr, int pos) {
        while (pos < MAX && arr[pos] != DIVIDER)
            pos++;
        return pos-1;
    }
}
