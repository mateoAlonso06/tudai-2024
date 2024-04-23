import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DigitoLetra {
    public static void main(String[] args) {
        final char MIN_DIGITO = '1';
        final char MAX_DIGITO = '9';
        final char MIN_LETRA = 'a';
        final char MAX_LETRA = 'z';

        char caracter;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            System.out.println("Ingrese un caracter digito o letra minuscula:");
            caracter = entrada.readLine().charAt(0);

            while (((caracter >= MIN_DIGITO) && (caracter <= MAX_DIGITO)) && ((caracter >= MIN_LETRA) && (caracter <= MAX_LETRA))) {
                if ((caracter >= MIN_DIGITO) && (caracter <= MAX_DIGITO)) {
                    System.out.println("Es un caracter digito");
                } else {
                    switch (caracter) {
                        case 'a':
                        case 'e':
                        case 'i':
                        case 'o':
                        case 'u':
                            System.out.println("Es un caracter letra minuscula vocal");
                            break;
                        default:
                            System.out.println("Es un caracter letra minuscula consonante");
                            break;
                    }
                }

                System.out.println("------------------------------------------------------------");
                System.out.println("Ingrese otro caracter digito o letra minuscula:");
                caracter = entrada.readLine().charAt(0);
            }
        }
        catch(Exception exc) {
            System.out.println(exc);
        }
        System.out.println("Fin del programa");
    }
}