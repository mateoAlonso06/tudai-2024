import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TratandoDigitos {
    public static void main(String[] args) {
        final char CORTE = '*';
        char caracter = '0';
        caracter = pedirCaracter();
        while (caracter != CORTE) {
            verificarCaracter(caracter);
            if (caracter >= 'a' && caracter <= 'z') 
                if (esVocal(caracter))
                    System.out.println("Es vocal");
                else
                    System.out.println("Es consonante");
            
            System.out.println("Vuelva a ingresar otro caracter:");
            caracter = pedirCaracter();
        }
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
        if (c >= '0' && c <= '9') {
            System.out.println("Es un digito");
        } else {
            if (c >= 'a' && c <= 'z')
                System.out.println("Letra minuscula");
        }
    }

    public static boolean esVocal(char c ) {
        boolean vocal = false;
        switch (c) {
            case 'a', 'e', 'i', 'o', 'u':
                vocal = true;
                break;
        }
        return vocal;
    }
}