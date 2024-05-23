/*
    Hacer un programa que devuelva la posición de inicio y de fin de la secuencia
    de mayor tamaño
 */

public class Ejercicio26 {
    final static int MAX = 20;
    final static int DIVISOR = 0;
    public static void main(String[] args) {
        int[] arreglo =  {0, 1, 2, 33, 4, 0, 1, 2, 3, 4, 0, 1, 2, 3, 4, 0, 1, 9, 3, 4};
        int tamanioMax = 0;

        int iniMax = 0, finMax = 0;
        int ini = 0, fin = -1;

        while (ini < MAX) {
            ini = obtenerInicio(arreglo, fin + 1);
            if (ini < MAX) {
                fin = obtenerFin(arreglo, ini);
                int tamanio = obtenerTamanio(arreglo, ini, fin);
                if (tamanio > tamanioMax) {
                    tamanioMax = tamanio;
                    iniMax = ini;
                    finMax = fin;
                }
            }
        }

        System.out.println("El inicio de la mayor secuencia es: " + iniMax);
        System.out.println("El fin de la mayor secuencia es: " + finMax);
        System.out.println("La cantidad de elementos dentro es de: " + tamanioMax);
    }

    public static int obtenerInicio(int[] arr, int pos) {
        while (pos < MAX && arr[pos] == DIVISOR)
            pos++;
        return pos;
    }

    public static int obtenerFin(int[] arr, int pos) {
        while (pos < MAX && arr[pos] != DIVISOR)
            pos++;
        return pos - 1;
    }
    
    public static int obtenerTamanio(int[] arr, int ini, int fin) {
        int cantidad = 0;
        for (int i = ini; i <= fin; i++)
            cantidad++;
        return cantidad;
    }
}
