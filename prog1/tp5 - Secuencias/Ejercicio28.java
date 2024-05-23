public class Ejercicio28 {
    final static int MAX = 20;
    public static void main(String[] args) {
        int[] arreglo =  {0, 1, 2, 33, 4, 0, 1, 0, 3, 4, 0, 1, 0, 3, 4, 0, 3, 4, 0, 1};
        mostrarArreglo(arreglo);
        // consigna
        int[] patron = {3, 4};
        int ini = 0, fin = -1;
        while (ini < MAX) {
            ini = obtenerInicio(arreglo, fin + 1);
            if (ini < MAX) {
                fin = obtenerFin(arreglo, ini);
                if(verificarSecuencia(arreglo, ini, fin, patron)) {
                    eliminarSecuencia(arreglo, ini, fin);
                    fin = ini;
                }
            }
        }
        mostrarArreglo(arreglo);
    }

    public static void eliminarSecuencia(int[] arr, int ini, int fin) {
        for (int i = ini; i <= fin; i++) {
            eliminarElemento(arr, ini);
        }
    }

    public static void eliminarElemento(int[] arr, int pos) {
        while (pos < MAX - 1) {
            arr[pos] = arr[pos + 1];
            pos++;
        }
    }

    public static boolean verificarSecuencia(int[] arr, int ini, int fin, int[] patron) {
        boolean igualdad = false;
        int tamanio = 0;
        for (int i = ini; i <= fin; i++)
            tamanio++;
        if (tamanio == patron.length) {
            int i = 0;
            igualdad = true;
            while (i < tamanio && igualdad) {
                if (arr[i] == patron[i])
                    i++;
                else
                    igualdad = false;
            }
        }
        return igualdad;
    }

    public static int obtenerInicio(int[] arreglo, int pos) {
        while (pos < MAX && arreglo[pos] == 0)
            pos++;
        return pos;
    }

    public static int obtenerFin(int[] arreglo, int pos) {
        while (pos < MAX && arreglo[pos] != 0)
            pos++;
        return pos-1;
    }

    public static void mostrarArreglo(int[] arr) {
        for (int i = 0; i < MAX; i++) 
            System.out.print(arr[i] + " | ");
        System.out.println();
    }
}

/*Hacer un programa que elimine de un arreglo todas las
ocurrencias de una secuencia patrón dada por otro arreglo. */
