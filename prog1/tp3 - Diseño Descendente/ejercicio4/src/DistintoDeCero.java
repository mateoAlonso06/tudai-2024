import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DistintoDeCero {
    public static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) {
        final int CORTE = 0;
        int numero = 0;
        System.out.println("Ingrese un numero (" + CORTE + " para salir)");
        numero = pedirEntero();
        while (numero != CORTE) {
            System.out.println("Ingrese un nuevo valor:");
            int nuevoNumero = pedirEntero();
            int resultado = numero * nuevoNumero;
            System.out.println("El resultado del producto fue: " + resultado);

            System.out.println("Ingrese un numero (" + CORTE + " para salir)");
            numero = pedirEntero();
        }
        System.out.println("Fin del programa");

    }

    public static int pedirEntero() {
        int numero = 0;
        try {
            System.out.println("Ingrese el numero:");
            numero = Integer.valueOf(entrada.readLine());
        } catch (Exception exc) {
            System.out.println(exc);
        }
        return numero;
    }
}
