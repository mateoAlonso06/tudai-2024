import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EsMultiplo {
    public static void main(String[] args) {
        final int MIN = 1;
        final int MAX = 10;
        int numero = 0;
        
        System.out.println("Ingrese un valor entre 1 y 10");
        numero = pedirEntero();
        while(numero >= MIN && numero <= MAX) {
            if(esMultiplo(3, numero)) {
                char caracter = pedirCaracter();
                verificarCaracter(caracter);
            }
            if(esMultiplo(5, numero))
                    imprimirTabla(numero);
            
            System.out.println("Vuelva a ingresar un numero entero entre 1 y 10");
            numero = pedirEntero();
        }
    }

    public static int pedirEntero() {
        int numero = 0;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese el numero (entero):");
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

    public static boolean esMultiplo(int multiplo, int num) {
        return num % multiplo == 0;
    }

    public static void verificarCaracter(char c) {
        if(c >= 'a' && c <= 'z') 
            System.out.println("Es una letra minuscula");
        else if(c >= 'A' && c <= 'Z') 
            System.out.println("Es una letra mayuscula");
        else if(c >= '0' && c <= '9')
            System.out.println("Es un digito");
        else 
            System.out.println("Otro");
    }

    public static void imprimirTabla(int num) {
        for(int i = 1; i <= 10; i++)
            System.out.println(num + " * " + i + " = " + (num * i));
    }
}
