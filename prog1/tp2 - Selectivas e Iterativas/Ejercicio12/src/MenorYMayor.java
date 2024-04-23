import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MenorYMayor {
    public static void main(String[] args) {

        char letra, menorLetra, mayorLetra;
        boolean primerVuelta = false;

        menorLetra = '0';
        mayorLetra = '0';

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Ingrese una letra minuscula:");
            letra = entrada.readLine().charAt(0);

            while (letra >= 'a' && letra <= 'z') {
                if (!primerVuelta) {
                    menorLetra = letra;
                    mayorLetra = letra;
                    primerVuelta = true;
                }
                else {
                    if (letra < menorLetra)
                        menorLetra = letra;
                    else if (letra > mayorLetra)
                        mayorLetra = letra;
                }

                System.out.println("Vuelva a ingresar otra letra minuscula:");
                letra = entrada.readLine().charAt(0);
            }
        }
        catch (Exception exc) {
            System.out.println(exc);
        }
        
        System.out.println("-------------------------------------------------------");
        if (menorLetra != '0' && mayorLetra != '0') {
            System.out.println("La menor letra ingresada fue: " + menorLetra);
            System.out.println("La mayor letra ingresada fue: " + mayorLetra);
        } else
            System.out.println("Fin");
    }
}
