import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NPrimos {
    final static int MAX = 10;
    public static void main(String[] args) {
        int[] arr = {3, 10, 8, 3, 7, 99, 100, 250, 33, 45};
        int cantidadABuscar = ingresarEntero("Ingrese la cantidad a buscar de numeros primos");
        if (buscarPrimos(arr, cantidadABuscar))
            System.out.println("Se encontraron almenos " + cantidadABuscar + " numeros primos");
        else
            System.out.println("No se encontro la cantidad deseada de numeros primos");
    }

    public static int ingresarEntero(String mensaje) {
        int numero = 0;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        boolean esValido = false;
        while (!esValido) {
            try {
                System.out.println(mensaje);
                numero = Integer.valueOf(entrada.readLine());
                esValido = true;
            } catch (Exception exc) {
                System.out.println(exc);
            }
        }
        return numero;
    }

    public static boolean buscarPrimos(int[] arr, int cant) {
        int contadorPrimos = 0;
        int i = 0;
        while (i < MAX && contadorPrimos < cant) {
            int divisores = 0;
            for (int k = 1; k <= arr[i]; k++) {
                if (arr[i] % k == 0)
                    divisores++;
            }
            System.out.println("divisores vale: " + divisores);
            if(divisores == 2) 
                contadorPrimos++;
            i++;
        }
        return contadorPrimos == cant;
    }
}
