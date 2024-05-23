public class InvertirOrden {
    final static int MAX = 10;
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; 
        // Arreglo original
        System.out.println("El arreglo contiene los elementos:");
        imprimirArreglo(arr);
        // Arreglo modificado
        System.out.println("\nEl arreglo con su orden invertido es:");
        invertirOrden(arr);
        imprimirArreglo(arr);
    }

    public static void invertirOrden(int[] arr) {
        for(int i = 0; i < MAX / 2; i++) {
            int aux = arr[i];
            arr[i] = arr[(MAX - 1) - i];
            arr[(MAX-1) - i] = aux;
        }
    }

    public static void imprimirArreglo(int[] arr) {
        for(int i = 0; i < MAX; i++) {
            System.out.print(arr[i] + " | ");
        }
    }
}
