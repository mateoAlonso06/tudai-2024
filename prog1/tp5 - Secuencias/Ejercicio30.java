public class Ejercicio30 {
    static final int MAX = 20;
    static final int MAX_B = 5;
    static final int DIVISOR = 0;
    public static void main(String[] args) {
        int[] arregloA = {0, 1, 2, 3, 0, 4, 5, 6, 3, 0, 1, 2, 3, 0, 4, 5, 6, 3, 2, 0};
        int[] arregloP = {0, 1, 2, 3, 0};
        int[] arregloR = {0, 5, 5, 5, 0};

        int ini = 0, fin = -1;
        while (ini < MAX) {
            ini = obtenerPosInicio(arregloA, fin  + 1);
            if (ini < MAX) {
                fin = obtenerPosFin(arregloR, ini);
                if(hallarSecuencia(arregloA, arregloP, ini, fin)) {

                }
            }
        }
    }

    public static boolean hallarSecuencia(int[] arrA, int[] arrB, int ini, int fin) {
        int posInicioB = 0, posFinB = -1;
        int tamanioSecuenciaA = 0;
        int tamanioSecuenciaB = 0;
        while (posInicioB < MAX_B) {
            posInicioB = obtenerPosInicio(arrB, posFinB + 1);
            if (posInicioB < MAX_B) {
                posFinB = obtenerPosFin(arrB, posInicioB);
                tamanioSecuenciaA = obtenerTamanio(arrA, ini, fin);
                tamanioSecuenciaB = obtenerTamanio(arrB, posInicioB, posFinB);
                if (tamanioSecuenciaA == tamanioSecuenciaB)
                    
            }
        }


        // while (ini <= fin && arrA[ini] == arrB[])
        // return false;
    }

    public static int obtenerTamanio(int[] arr, int ini, int fin) {
        int cant = 0;
        for (int i = ini; i <= fin; i++) 
            cant++;
        return cant;
    }

    public static int obtenerPosInicio(int[] arr, int pos) {
        while (pos < MAX && arr[pos] == DIVISOR) 
            pos++;
        return pos;
    }

    public static int obtenerPosFin(int[] arr, int pos) {
        while (pos < MAX && arr[pos] != DIVISOR)
            pos++;
        return pos - 1;
    }
}
