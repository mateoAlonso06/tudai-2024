import java.io.BufferedReader;
import java.io.InputStreamReader;

public class VerificarCaracter {
    public static void main(String[] args) {
        char caracter = '0';
        caracter = pedirCaracter();
        while(esDigito(caracter) || esLetraMinuscula(caracter)) {
            if(esDigito(caracter))
                System.out.println(caracter + ": es un digito");
            else {
                if (esVocal(caracter))
                    System.out.println(caracter + ": es vocal");
                else
                    System.out.println(caracter + ": es consonante");
            }
            caracter = pedirCaracter();
        }
        System.out.println("Fin del programa");
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

    public static boolean esDigito(char c) {
        return c >= '0' && c <= '9';
    }

    public static boolean esLetraMinuscula(char c) {
        return c >= 'a' && c <= 'z';
    }

    public static boolean esVocal(char c) {
        boolean flag = false;
        switch (c) {
            case 'a', 'e', 'i', 'o', 'u':
                flag = true;
                break;
        }
        return flag;
    }
}
