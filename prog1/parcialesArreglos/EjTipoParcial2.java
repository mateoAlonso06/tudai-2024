public class EjTipoParcial2 {
    final static int MAX_A = 42;
    final static int MAX_S = 22;
    final static char DIVISOR = ' ';
    public static void main(String[] args) {
        char[] arrA = {' ', 'l', 'a', ' ', 'c', 'a', 's', 'a', ' ', 'r', 'o', 'j', 'a', ',', ' ', 
                     'a', ' ', 'l', 'a', ' ', 'v', 'u', 'e', 'l', 't', 'a', ' ', 'd', 'e', ' ', 
                     'l', 'a', ' ', 'e', 's', 'q', 'u', 'i', 'n', 'a', '.', ' '};
        System.out.println(arrA.length);
        mostrarArreglo(arrA);
        // stop words
        char[] arrS = {' ', 'a', ' ', 'l', 'o', ' ', 'l', 'o', 's', ' ', 'd', 'e', ' ', ' ', 'l', 'a', ' ', ' ', 'l', 'a', 's', ' '};

        // Hallo la secuencia de ArrA
        int ini = 0, fin = -1;
        while (ini < MAX_A) {
            ini = obtenerInicio(arrA, fin+1, MAX_A);
            if (ini < MAX_A) {
                fin = obtenerFin(arrA, ini);
                if (esUnaStopword(arrA, ini, fin, arrS))
                    eliminarStopword(arrA, ini, fin);
            }
        }

        System.out.println("Despues de borrar las stopwords");
        mostrarArreglo(arrA);
    }

    public static void eliminarStopword(char[] arr, int ini, int fin) {
        for (int i = ini; i <= fin; i++) 
            corrimiento_izquierda(arr, ini);
    }

    public static void corrimiento_izquierda(char[] arr, int pos) {
        while (pos < MAX_A-1) {
            arr[pos] = arr[pos+1];
            pos++;
        }
    }

    public static boolean esUnaStopword(char[] arrA, int ini, int fin, char[] arrS) {
        int tamA = fin-ini+1;
        boolean stopword = false;
        int contador = 0;

        int iniB = 0, finB = -1;
        while (iniB < MAX_S) {
            contador = 0;
            iniB = obtenerInicio(arrS, finB+1, MAX_S);
            if (iniB < MAX_S) {
                finB = obtenerFin(arrS, iniB);
                int tamB = finB-iniB+1;
                if (tamA == tamB) {
                    int i = 0;
                    while (i < tamA && contador != tamA) {
                        if (arrA[ini + i] == arrS[iniB + i]) {
                            contador++;
                        }
                        if (contador == tamA) 
                            stopword = true;
                        i++;
                    }
                }
            }
        }
        return stopword;
    }

    public static void mostrarArreglo(char[] arr) {
        for (int i = 0; i < MAX_A; i++)
            System.out.print(arr[i] + " | ");
        System.out.println();
    }

    public static int obtenerInicio(char[] arr, int pos, int MAX_VAL) {
        while (pos < MAX_VAL && arr[pos] == DIVISOR) 
            pos++;
        return pos;
    }

    public static int obtenerFin(char[] arr, int pos) {
        while (pos < MAX_A && arr[pos] != DIVISOR)
            pos++;
        return pos-1;
    }
}
