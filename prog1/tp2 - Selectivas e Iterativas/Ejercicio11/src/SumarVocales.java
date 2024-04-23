import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SumarVocales {
    public static void main(String[] args) {
        int cantidadDeVocales = 0;
        char letra;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Ingrese una letra minuscula:");
            letra = entrada.readLine().charAt(0);

            while (letra >= 'a' && letra <= 'z') {
                switch (letra) {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                        cantidadDeVocales++;
                        break;
                }

                System.out.println("Ingrese otra letra:");
                letra = entrada.readLine().charAt(0);
            }
        }
        catch (Exception exc) {
            System.out.println(exc);
        }
        System.out.println("Se ingresaron " + cantidadDeVocales);
        System.out.println("Fin del programa");
    }
}
