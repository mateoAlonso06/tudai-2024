import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DistintoDeCero {
    public static void main(String[] args) {
        final int CORTE = 0;
        int numeroEntero = 0;
        numeroEntero = pedirEntero();
        while(numeroEntero != CORTE) {
            int nuevoNumero = pedirEntero();
            System.out.println("Ingreso: " + nuevoNumero);
            numeroEntero = pedirEntero();
        }
        System.out.println("Fin del programa");
    }

    public static int pedirEntero() {
        int numero = 0;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese un numero entero:");
            numero = Integer.valueOf(entrada.readLine());
        } catch (Exception exc) {
            System.out.println(exc);
        }
        return numero;
    }
}
