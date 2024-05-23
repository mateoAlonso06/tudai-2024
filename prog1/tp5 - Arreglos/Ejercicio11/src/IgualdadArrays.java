public class IgualdadArrays {
    final static int MAX_A = 7;
    final static int MAX_B = 10;
    public static void main(String[] args) {
        int[] arrayA = {1, 2, 3, 4, 5, 6, 7};
        int[] arrayB = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        if (compararArrays(arrayA, arrayB))
            System.out.println("Todos los elementos de A estan contenidos en B");
        else
            System.out.println("Los elementos de A no estan en B");
    }

    public static boolean compararArrays(int[] arrA, int[] arrB) {
        int cantidadEncontrados = 0;
        // primero itero sobre A tomando cada elemento
        for(int i = 0; i < MAX_A; i++) {
            int contador = 0;
            int valorActual = arrA[i];
            for(int j = 0; j < MAX_B; j++) {
                if (valorActual == arrB[j])
                    contador++;
            }
            if (contador > 0)
                cantidadEncontrados++;
        }
        return cantidadEncontrados == MAX_A;
    }
}
