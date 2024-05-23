public class Ejercicio25 {
    final static int MAX = 20;
    public static void main(String[] args) {
        int[] arreglo =  {0, 1, 2, 33, 4, 0, 1, 2, 3, 4, 0, 1, 2, 3, 4, 0, 1, 9, 3, 4};
        int posInicio = 0, posFin = 0;

        int cantidadSecuencias = 0;
        int inicio = 0, fin = -1;
        while (inicio < MAX) {
            inicio = obtenerPosInicio(arreglo, fin + 1);
            if (inicio < MAX) {
                fin = obtenerPosFin(arreglo, inicio);
                cantidadSecuencias++;
                if (cantidadSecuencias == 3) {
                    posInicio = inicio;
                    posFin = fin;
                }
            }
        }
        System.out.println("La ubicación de inicio de la ante-ultima secuencia es: " + posInicio);
        System.out.println("La ubicación de fin de la ante-ultima secuencia es: " + posFin);
    }

    public static int obtenerPosInicio(int[] arr, int pos) {
        while (pos < MAX && arr[pos] == 0) 
            pos++;
        return pos;
    }

    public static int obtenerPosFin(int[] arr, int pos) {
        while (pos < MAX && arr[pos] != 0)
            pos++;
        return pos - 1;
    }
}