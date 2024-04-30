import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NumeroNatural {
    public static final BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) {
        int numeroNatural = 0;
        System.out.println("Ingrese un numero natural (mayores a 0)");
        numeroNatural = pedirEntero();
        while (numeroNatural > 0) {
            float nuevoNumero = pedirReal();
            System.out.println("El valor ingresado fue: " + nuevoNumero);
            System.out.println("Ingrese otro numero natural (mayores a 0)");
            numeroNatural = pedirEntero();
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
    
    public static float pedirReal() {
        float numero = 0;
        try {
            System.out.println("Ingrese cualquier numero:");
            numero = Float.valueOf(entrada.readLine());
        } catch (Exception exc) {
            System.out.println(exc);
        }
        return numero;
    }
}
