public class Ejercicio30 {
    final static int MAX = 20;
    final static int DIVIDER = 0;
    public static void main(String[] args) {
        int[] arrA = {0, 1, 2, 3, 4, 0, 5, 6, 7, 8, 0, 9, 10, 0, 0, 5, 6, 7, 8, 0};
        int[] arrP = {0, 5, 6, 7, 8, 0};
        int[] arrR = {0, 55, 55, 55, 55, 0};
        mostrarArreglo(arrA);

        int ini = 0, fin = -1;
        while (ini < MAX) {
            ini = obtenerInicio(arrA, fin + 1);
            if (ini < MAX) {
                fin = obtenerFin(arrA, ini);
                if (buscarPatron(arrA, ini, fin, arrP)) {
                    borrarSecuencia(arrA, ini, fin);
                    insertarValores(arrA, ini, fin, arrR);
                    mostrarArreglo(arrA);
                }
            }
        }
    }

    public static void mostrarArreglo(int[] arr) {
        for (int i = 0; i < MAX; i++) 
            System.out.print(arr[i] + " | ");
        System.out.println();
    }

    public static void insertarValores(int[] arrA, int inicio, int fin, int[] arrB) {
        int inicioB = 0, finB = -1;
        inicioB = obtenerInicio(arrB, finB + 1);
        finB = obtenerFin(arrB, inicioB);

        // hago x corrimientos como elementos de la secuencia a insertar haya
        for (int i = inicio; i <= fin; i++) 
            corrimiento_a_derecha(arrA, inicio);

        // en cada valor de la secuencia reemplazo por los nuevos valores
        int indiceA = 0;
        for (int i = inicioB; i <= finB; i++) { 
            arrA[inicio + indiceA] = arrB[i];
            indiceA++;
        }
    }

    public static void corrimiento_a_derecha(int[] arrA, int pos) {
        int i = MAX - 1;
        while (i > pos) {
            arrA[i] = arrA[i - 1];
            i--;
        }
    }

    public static void borrarSecuencia(int[] arrA, int inicio, int fin) {
        for (int i = inicio; i <= fin; i++) {
            corrimiento_a_izquierda(arrA, inicio);
        }
    }

    public static void corrimiento_a_izquierda(int[] arr, int pos) {
        while (pos < MAX - 1) {
            arr[pos] = arr[pos + 1];
            pos++;
        }
    }

    public static boolean buscarPatron(int[]arrA, int inicioA, int finA, int[] arrB) {
        int inicioB = 0, finB = -1;

        // Obtengo el inicio y el final de la secuencia patron a buscar
        inicioB = obtenerInicio(arrB, finB + 1);
        finB = obtenerFin(arrB, inicioB);

        boolean iguales = true;
        if ((finA - inicioA + 1) == (finB - inicioB + 1)) {
            // Si ambas secuencias comparten tamaño comparo sus valores
            int i = 0;
            int tam = finA - inicioA + 1;
            while (i < tam && iguales) {
                if (arrA[inicioA + i] != arrB[inicioB + i])
                    iguales = false;
                i++;
            }
        } else { // si las secuencias son de distinto tamaño
            iguales = false;
        }
        return iguales;
    }

    public static int obtenerInicio(int[] arrA, int pos) {
        while (pos < MAX && arrA[pos] == DIVIDER)
            pos++;
        return pos;
    }

    public static int obtenerFin(int[] arrA, int pos) {
        while (pos < MAX && arrA[pos] != DIVIDER) 
            pos++;
        return pos-1;
    }
}
