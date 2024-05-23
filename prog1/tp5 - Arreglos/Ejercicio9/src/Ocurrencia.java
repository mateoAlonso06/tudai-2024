public class Ocurrencia {
    final static int MAX = 9;
    public static void main(String[] args) {
        char[] arr = {'a', 'e', 'i', 'o', 'u', 'a', 'b', 'c', 'd'};
        if(buscarRepetida(arr))
            System.out.println("Hay almenos 1 letra repetida");
        else
            System.out.println("No hay letras repetidas");
    }

    public static boolean buscarRepetida(char[] arr) {
        boolean repetida = false;
        int contador = 0;
        int i = 0;

        while (i < MAX && !repetida) {
            char letraActual = arr[i];
            for (int k = 0; k < MAX; k++) {
                if (letraActual == arr[k])
                    contador++;
            }
            
            if (contador >= 2) 
                repetida = true;
            
            i++;
        }
        return repetida;
    }
}
