import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DistintoDe {
    public static void main(String[] args) {
        final char CORTE = '*';

        char caracter;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Ingrese un caracter para verificar si es digito o vocal minucula:");
            caracter = entrada.readLine().charAt(0);

            while (caracter != CORTE) {
                if (caracter >= '1' && caracter <= '9')
                    System.out.println("Ingreso: " + caracter + ". Es un digito");
                else if (caracter >= 'a' && caracter <= 'z') {
                    switch(caracter) {
                        case 'a':
                        case 'e':
                        case 'i':
                        case 'o':
                        case 'u':
                            System.out.println("Ingreso: " + caracter + ". Es una vocal minuscula");
                            break;
                    }
                } else {
                    System.out.println("El caracter ingresado no cumple ninguna condición");
                }

                System.out.println("Vuelva a ingresar otro caracter:");
                caracter = entrada.readLine().charAt(0);
            }
        }
        catch(Exception exc) {
            System.out.println(exc);
        }
        System.out.println("Fin del programa");
    }
}
