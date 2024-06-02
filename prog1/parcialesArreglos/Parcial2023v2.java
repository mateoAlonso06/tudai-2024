public class Parcial2023v2 {
    final static int MAX = 19;
    final static int SEPARADOR = 0;
    public static void main(String[] args) {
        int[] arr = {0, 67, 67, 67, 67, 67, 67, 67, 67, 0, 14, 0, 33, 33, 33, 0, 98, 98, 0};
        mostrarArreglo(arr);
        // System.out.println(arr.length);

        int ini = 0, fin = -1;
        int i = 0;
        while (ini < MAX) {
            ini = obtenerInicio(arr, fin+1);
            if (ini < MAX) {
                fin = obtenerFin(arr, ini);
                if (pixelesRepetidos(arr, ini, fin)) {
                    eliminarPixeles(arr, ini, fin);
                    i++;
                    System.out.println("Vuelta: " + i);
                    System.out.println(fin-ini+3);
                    if (fin-ini+3 > MAX) {
                        fin-= ini+3;
                    }
                }
            }
        }
        mostrarArreglo(arr);
    }

    public static void eliminarPixeles(int[] arr, int ini, int fin) {
        // valores a utilizar
        int tam = fin-ini+1;
        int cant = -tam;
        int val = arr[ini];
        // el valor de tam nunca es inferior a 2
        if (tam > 2) {
            for (int i = ini + 2; i <= fin; i++) 
                corrimientoIzquierda(arr, ini);
        }
        arr[ini] = cant;
        arr[ini + 1] = val;
    }

    public static void corrimientoIzquierda(int[] arr, int pos) {
        while (pos < MAX - 1) {
            arr[pos] = arr[pos + 1];
            pos++;
        }
    }

    public static boolean pixelesRepetidos(int[] arr, int ini, int fin) {
        boolean iguales = true;
        int contador = 0;
        int i = ini;
        while (i <= fin && iguales) {
            if (arr[ini] == arr[i]) {
                i++;
                contador++;
            }
            else 
                iguales = false;
        }
        if (contador == 1)
            iguales = false;

        return iguales;
    }


    public static int obtenerInicio(int[] arr, int pos) {
        while (pos < MAX && arr[pos] == SEPARADOR) {
            pos++;
        }
        return pos;
    }

    public static int obtenerFin(int[] arr, int pos) {
        while (pos < MAX && arr[pos] != SEPARADOR) {
            pos++;
        }
        return pos-1;
    }

    public static void mostrarArreglo(int[] arr) {
        for (int i = 0; i < MAX; i++) 
            System.out.print(arr[i] + " | ");
        System.out.println();
    }
} 
