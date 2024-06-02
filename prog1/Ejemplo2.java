public class Ejemplo2 {
    final static int MAX_FILA = 3;
    final static int MAX_COLUMNA = 3;
    public static void main(String[] args) {
        int[][] matriz = {
                            {1, 2, 33, 14},
                            {71, 21, 3, 4},
                            {51, 23, 53, 4},
                            {1, 2, 11, 84},
                        };

        imprimirPromedio(matriz);
    }

    public static void imprimirPromedio(int[][] matriz) {
        for (int i = 0; i < MAX_FILA; i++)
            System.out.println("El promedio de valores en la fila " + i + " es: " + calcularPromedio(matriz[i]));
    }

    public static double calcularPromedio(int[] matriz) {
        int acumulador = 0;
        for (int columna = 0; columna < MAX_COLUMNA; columna++) {
            acumulador += matriz[columna];
        }
   
        return acumulador / (double)MAX_COLUMNA;
    }
}
