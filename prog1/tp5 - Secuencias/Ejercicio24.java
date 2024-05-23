public class Ejercicio24 {
    final static int MAX = 20;
    final static int DIVISOR = 0;
    public static void main(String[] args) {
        int[] arreglo =  {0, 1, 2, 33, 4, 0, 1, 2, 3, 4, 0, 1, 2, 3, 4, 0, 1, 9, 3, 4};
        int maxSuma = 0;
        int inicio = 0, fin = -1;
        while (inicio < MAX) {
            inicio = obtenerInicio(arreglo, fin + 1);
            if (inicio < MAX) {
                fin = obtenerFin(arreglo, inicio);
                int suma = sumar(arreglo, inicio, fin);
                if (suma > maxSuma)
                    maxSuma = suma;
            }
        }

        System.out.println("La secuencia con mayor valor es de: " + maxSuma);
    }

    public static int obtenerInicio(int[] arr, int pos) {
        while (pos < MAX && arr[pos] == DIVISOR) 
            pos++;
        return pos;
    }

    public static int obtenerFin(int[] arr, int pos) {
        while (pos < MAX && arr[pos] != DIVISOR) 
            pos++;
        return pos-1;
    }

    public static int sumar(int[] arr, int inicio, int fin) {
        int suma = 0;
        for (int i = inicio; i <= fin; i++) {
            System.out.println("i vale: " + i);
            suma += arr[i];
        }
        return suma;
    }
}
