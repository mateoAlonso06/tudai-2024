/*Hacer un programa que devuelva la posición de inicio y fin de la
primera secuencia de números distinta de ceros. */

public class Ejercicio23 {
    final static int MAX = 20;
    final static int DIVISOR = 0;
    public static void main(String[] args) {
        int[] arreglo =  {0, 1, 2, 3, 4, 0, 1, 2, 3, 4, 0, 1, 2, 3, 4, 0, 1, 2, 3, 4};
        int posInicio = -1, posFin = -1;

        int inicio = 0, fin = -1;
        boolean encontrada = false;
        while (inicio < MAX && !encontrada) {
            inicio = obtenerInicio(arreglo, fin + 1);
            if (inicio < MAX) {
                fin = obtenerFinal(arreglo, inicio);
                posInicio = inicio;
                posFin = fin;
                encontrada = true;
            }
        }

        System.out.println("La posición de inicio de la primer secuencia es: " + posInicio);
        System.out.println("La posición de fin de la primer secuencia es: " + posFin);
    }

    public static int obtenerInicio(int[] arr, int pos) {
        while (pos < MAX && arr[pos] == DIVISOR) 
            pos++;
        return pos;
    }

    public static int obtenerFinal(int[] arr, int pos) {
        while (pos < MAX && arr[pos] != DIVISOR)
            pos++;
        return pos-1;
    }
}