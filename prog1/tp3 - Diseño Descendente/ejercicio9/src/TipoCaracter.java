import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TipoCaracter {
    public static void main(String[] args) {
        int numero = 0;
        numero = pedirEntero();
        
        while(numero >= 1 && numero <= 10) {
            char caracter = pedirCaracter();
            verificarCaracter(caracter);

            separador();
            
            System.out.println("Vuelva a ingresar otro numero entre 1 y 10");
            numero = pedirEntero();
        }
        System.out.println("Fin del programa");
    }

    public static int pedirEntero() {
        int numero = 0;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese un numero (entero):");
            numero = Integer.valueOf(entrada.readLine());
        } catch (Exception exc) {
            System.out.println(exc);
        }
        return numero;
    }

    public static char pedirCaracter() {
        char caracter = '0';
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese un caracter:");
            caracter = entrada.readLine().charAt(0);
        } catch (Exception exc) {
            System.out.println(exc);
        }
        return caracter;
    }

    public static void verificarCaracter(char c) {
        if (c >= 'a' && c <= 'z') 
            System.out.println("Letra minuscula");
        else if (c >= 'A' && c <= 'Z')
            System.out.println("Letra mayuscula");
        else if (c >= '9' && c <= '9')
            System.out.println("Digito");
        else 
            System.out.println("Otro");
    }

    public static void separador() {
        System.out.println("-----------------------------------------------------");
    }
}
