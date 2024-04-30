import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Tablas {
    public static void main(String[] args) {
        char letraMinuscula = '0';
        int numeroEntero = 0;

        letraMinuscula = pedirCaracter();
        while (letraMinuscula >= 'a' && letraMinuscula <= 'z') {
            System.out.println("Ingrese un valor entre 1 y 5");
            numeroEntero = pedirEntero();
            if (numeroEntero >= 1 && numeroEntero <= 5) 
                imprimirTabla(numeroEntero);
            
            System.out.println("Vuelva a ingresar otra letra minuscula");
            letraMinuscula = pedirCaracter();
        }
    }

    public static char pedirCaracter() {
        char caracter = '0';
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese un caracter letra minuscula");
            caracter = entrada.readLine().charAt(0);
        } catch (Exception exc) {
            System.out.println(exc);
        }
        return caracter;
    }

    public static int pedirEntero() {
        int numero = 0;
        boolean flag = false;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        while(!flag) {
            try {
                System.out.println("Ingrese el valor (entero):");
                numero = Integer.valueOf(entrada.readLine());
                flag = true;
            } catch (Exception exc) {
                System.out.println(exc);
            }
        }
        return numero;
    }

    public static void imprimirTabla(int numero) {
        for(int i = 1; i <= 10; i++) {
            System.out.println(numero + " * " + i + " = " + (numero * i));
        }
    }
}
