public class Par {
    final static int MAX = 10;
    public static void main(String[] args) {
        int[] enteros = {10, 4, 64, 55, 3, 99, 1004, -43, 33, 55};
        int cantidadPares = contarPares(enteros);
        if (cantidadPares > 0)
            System.out.println("Se encontraron " + cantidadPares + " numeros pares");
        else 
            System.out.println("No se encontraron numeros pares");
    }

    public static int contarPares(int[] arr) {
        int contador = 0;
        for (int i = 0; i < MAX; i++) {
            if (arr[i] % 2 == 0)
                contador++;
        }
        return contador;
    }
}
