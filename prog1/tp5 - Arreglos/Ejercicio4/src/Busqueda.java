import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Busqueda {
    static final int MAX = 10;
    public static void main(String[] args) {
        char[] arr = {'a', 'b', 'a', 'c', 'e', 'd', 'f', 'g', 'a', 'z'};
        char caracterAbuscar = ingresarLetra();
        mostrarPosiciones(arr, caracterAbuscar);
    }

    public static char ingresarLetra() {
        char letra = 'a';
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese una letra minuscula:");
            letra = entrada.readLine().charAt(0);
        } catch (Exception exc) {
            System.out.println(exc);
        }
        return letra;
    }

    public static void mostrarPosiciones(char[] arr, char letra) {
        int pos = -1;
        for (int i = 0; i < MAX; i++) {
            if (arr[i] == letra) {
                System.out.println("Se encontre a " + letra + " en la posicion " + (i + 1));
            }
        }

        if (pos == -1) {
            System.out.println("No se encontro el elemento dentro del arreglo");
        }
    }
}
