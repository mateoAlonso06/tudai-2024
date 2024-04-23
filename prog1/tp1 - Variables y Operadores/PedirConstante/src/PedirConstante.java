import java.io.BufferedReader;
import java.io.InputStreamReader;


/*  
    Se puede asignar un valor a una constante luego de su declaración, pero una vez que esta obtenga un valor
    ya no podra reasignarse un valor sobre este
*/

public class PedirConstante {
    public static void main(String[] args) throws Exception {
        final int pedirNumero;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Ingrese un valor: ");
            pedirNumero = Integer.valueOf(entrada.readLine());

            System.out.println("El valor ingresado es: " + pedirNumero);
        }
        catch (Exception exc) {
            System.out.println(exc);
        }
    }
}
