public class Parcial2023 {
    final static int MAX = 19;
    final static int SEPARADOR = 0;
    public static void main(String[] args) {
        int[] arr = {0, 67, 67, 67, 67, 67, 67, 67, 67, 0, 14, 0, 33, 33, 33, 0, 5, 98, 0};
        // System.out.println(arr.length);
        mostrarArreglo(arr);
        System.out.println("--------------------------------------");

        int ini = 0, fin = -1;
        while (ini < MAX) {
            ini = obtenerInicio(arr, fin+1);
            if (ini < MAX) {
                fin = obtenerFin(arr, ini);
                if (pixelesRepetidos(arr, ini, fin)) {
                    System.out.println("Eliminando secuencia\n");
                    eliminarPixelesRepetidos(arr, ini, fin);
                    fin = ini;  
                }
            }
        }
        System.out.println("Arreglo despues de los cambios: ");
        mostrarArreglo(arr);
    }
    public static int obtenerInicio(int[] arr, int pos) {
        while (pos < MAX && arr[pos] == SEPARADOR)
            pos++;
        return pos;
    }

    public static int obtenerFin(int[] arr, int pos) {
        while (pos < MAX && arr[pos] != SEPARADOR) 
            pos++;
        return pos - 1;
    }

    public static boolean pixelesRepetidos(int[] arr, int ini, int fin) {
        int tam = fin-ini+1;
        int contador = 0;
        while (ini <= fin && contador < tam) {
            for (int i = ini; i <= fin; i++) {
                if (arr[ini] == arr[i]) {
                    contador++;
                }
            }
            ini++;
        }
        System.out.println("Tamaño de la secuencia: " + tam);
        System.out.println("El contador es: " + contador);

        return contador == tam && contador > 2;
    }

    public static void eliminarPixelesRepetidos(int[] arr, int ini, int fin) {
        int valAux = arr[ini];
        int cantidad = -(fin - ini + 1);

        for (int i = ini; i <= fin; i++) {
            corrimientoIzquierda(arr, ini);
        }

        for (int i = 0; i < 2; i++) 
            corrimientoDerecha(arr, ini);
        
        arr[ini] = cantidad;
        arr[ini + 1] = valAux;
    }

    public static void corrimientoIzquierda(int[] arr, int ini) {
        while (ini < MAX - 1) {
            arr[ini] = arr[ini + 1];
            ini++;
        }
    }

    public static void corrimientoDerecha(int[] arr, int ini) {
        int i = MAX - 1;
        while (i > ini) {
            arr[i] = arr[i - 1];
            i--;
        } 
    }

    public static void mostrarArreglo(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " | ");
        }
        System.out.println();
    }
}