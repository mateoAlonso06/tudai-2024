import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DistintoDeCero {
    public static void main(String[] args) {
        final int CORTE = 0;
        
        int numero;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese un numero distinto de: ("+ CORTE + ")");
            numero = Integer.valueOf(entrada.readLine());

            while (numero != CORTE) {
                System.out.println("Ingrese otro numero (entero):");
                int segundoNumero = Integer.valueOf(entrada.readLine());

                System.out.println("El numero ingresado es: " + segundoNumero);

                System.out.println("------------------------------------------------------------");
                System.out.println("Vuelva a ingresar otro numero (" + CORTE + ") para salir:");
                numero = Integer.valueOf(entrada.readLine());
            }
        }
        catch(Exception exc) {
            System.out.println(exc);
        }
        System.out.println("Fin del programa");
    }
}
